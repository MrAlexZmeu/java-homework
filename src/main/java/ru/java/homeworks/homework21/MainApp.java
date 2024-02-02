package ru.java.homeworks.homework21;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        MainThread();
        try {
            InThreads(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void MainThread() {
        double[] array = new double[100_000_000];
        Long startTime = System.currentTimeMillis();

        FillArray(0, array.length, array);
        System.out.println("Выполнение через 1 поток " + (System.currentTimeMillis() - startTime));
    }

    public static void InThreads(int countThreads) throws InterruptedException {
        double[] array = new double[100_000_000];
        int step = array.length / countThreads;

        List<Thread> arrThread = new ArrayList<>();
        for (int i = 1; i < countThreads; i++) {
            int finalI = i - 1;
            arrThread.add(new Thread(() -> FillArray(finalI * step, finalI * step + step - 1, array)));
        }
        arrThread.add(new Thread(() -> FillArray(array.length - step, array.length, array)));

        long startTime = System.currentTimeMillis();
        for (Thread thread : arrThread) {
            thread.start();
        }

        for (Thread thread : arrThread) {
            thread.join();
        }

        System.out.println("Выполнение через " + countThreads + " потокa " + (System.currentTimeMillis() - startTime));
    }

    public static void FillArray(int min, int max, double[] array) {
        for (int i = min; i < max; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
