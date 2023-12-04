package ru.java.homeworks.homework5;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int quantity = 5;
        String word = "Hello java!";
        printWord(5, word);
        System.out.println("");

        int[] arr = {1, 7, 10, 15, 16, 18};
        sum(arr);
        System.out.println("");

        int[] arrayInput = new int[10];
        fill(5, arrayInput);
        System.out.println("");

        int[] arrayNumbers = {2, 56, 33, 85, 24, 15};
        chArrayNumber(7, arrayNumbers);

        System.out.println("");
        sumHalfArray(arrayNumbers);

        System.out.println("");
        int[][] arrData = {{1, 2, 3},
                {2, 2},
                {1, 1, 1, 1, 1}};
        sumArrays(arrData);

        System.out.println("");
        int[] arrPoint = {5, 1, 3, 4, -1};
        pointSum(arrPoint);

        System.out.println("");
        int[] arrayOrder = {5, 4, 3, 2, 1};
        orderArray(arrayOrder);

        System.out.println("");
        int[] arrForTurn = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        turnArray(arrForTurn);
    }


    public static void printWord(int quantity, String word) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(word);
        }
    }

    public static void sum(int[] arrayForSum) {
        int sumArray = 0;
        for (int i = 0; i < arrayForSum.length; i++) {
            if (arrayForSum[i] > 5) {
                sumArray += arrayForSum[i];
            }
        }
        System.out.println(sumArray);
    }

    public static void fill(int num, int[] arrayData) {
        for (int i = 0; i < arrayData.length; i++) {
            arrayData[i] = num;
        }
        System.out.println(Arrays.toString(arrayData));
    }

    public static void chArrayNumber(int num, int[] arrayData) {
        for (int i = 0; i < arrayData.length; i++) {
            arrayData[i] += num;
        }
        System.out.println(Arrays.toString(arrayData));
    }

    public static void sumHalfArray(int[] arrayData) {
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < arrayData.length; i++) {
            if (i < arrayData.length / 2) {
                firstHalf += arrayData[i];
                continue;
            }
            secondHalf += arrayData[i];
        }
        System.out.println(Arrays.toString(arrayData));
        if (firstHalf > secondHalf) {
            System.out.println("Сумма первой половины массива больше!");
            return;
        }
        if (firstHalf == secondHalf) {
            System.out.println("Сумма половин массив равна!");
            return;
        }
        System.out.println("Сумма второй половины массива больше!");

    }

    public static void sumArrays(int[][] arrayData) {
        int max = 0;

        for (int i = 0; i < arrayData.length; i++) {
            if (max < arrayData[i].length) {
                max = arrayData[i].length;
            }
        }

        int[] arr = new int[max];

        for (int i = 0; i < arrayData.length; i++) {
            for (int j = 0; j < arrayData[i].length; j++) {
                arr[j] += arrayData[i][j];
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pointSum(int[] arr) {
        int sum = 0;
        int sumHalf = 0;
        int sumArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumArray += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArray -= arr[i];

            if (sum == sumArray) {
                System.out.println("Точка после индекса " + i);
                return;
            }
        }
    }

    public static void orderArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите метод проверки массива:");
        System.out.println("1 - по возрастанию");
        System.out.println("2 - по убыванию");
        int resultIn = scanner.nextInt();
        if (arr.length == 1) {
            System.out.println("Массив упорядочен");
            return;
        }
        switch (resultIn) {
            case 1:
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        System.out.println("Массив не упорядочен по возрастанию");
                        return;
                    }
                }
                System.out.println("Массив упорядочен по возрастанию");
                return;
            case 2:
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < arr[i + 1]) {
                        System.out.println("Массив не упорядочен по убыванию");
                        return;
                    }
                }
                System.out.println("Массив упорядочен по убыванию");
                return;
            default:
                System.out.println("Метод не обнаружен!\nПока!");

        }
    }

    private static void turnArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int buff = 0;
            buff = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buff;
        }
        System.out.println(Arrays.toString(arr));
    }
}
