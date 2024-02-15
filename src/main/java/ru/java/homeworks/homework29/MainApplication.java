package ru.java.homeworks.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApplication {
    private final Object monitor = new Object();
    private volatile char letter = 'A';

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MainApplication mainApplication = new MainApplication();
        executorService.execute(() -> mainApplication.printA());
        executorService.execute(() -> mainApplication.printB());
        executorService.execute(() -> mainApplication.printC());

        executorService.shutdown();
    }

    public void printA() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'A') {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(letter);
                letter = 'B';
                monitor.notifyAll();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'B') {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(letter);
                letter = 'C';
                monitor.notifyAll();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            for (int i = 0; i < 5; i++) {
                while (letter != 'C') {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(letter);
                letter = 'A';
                monitor.notifyAll();
            }
        }
    }
}
