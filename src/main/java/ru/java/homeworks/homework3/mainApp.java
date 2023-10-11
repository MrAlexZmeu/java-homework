package ru.java.homeworks.homework3;

import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите метод:");
        System.out.println("1 - Вывести сообщение");
        System.out.println("2 - Проверить сумму 3 чисел");
        System.out.println("3 - Выбрать цвет");
        System.out.println("4 - Сравнить 2 числа");
        System.out.println("5 - Увеличить\\уменьшить число");
        int resultIn = scanner.nextInt();
        switch (resultIn){
            case 1:
                greetings();
                break;
            case 2:
                checkSign(1, 2, 3);
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNumbers();
                break;
            case 5:
                addOrSubtractAndPrint(10,5,true);
                break;
            default:
                System.out.println("Метод не обнаружен!\nПока!");

        }

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(){
        int data = 21;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20 ) {
            System.out.println("Желтый");
        } else{
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 15;

        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment = true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
