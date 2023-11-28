package ru.java.homeworks.homework7;

public class MainApp {
    public static void main(String[] args) {
        int[][] arr = {{-1, -5, 10},
                {1, 11, 6, 7, -10},
                {-3, 15, -20, 0}};
        int sumArray = 0;
        sumArray = sumOfPositiveElements(arr);
        System.out.println(sumArray);

        System.out.println("");
        printSquad(4);

        System.out.println("");
        int[][] squadArray = {{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 8, 7, 6},
                                {5, 4, 3, 2}};
        zeroDiagonalSquad(squadArray);

        System.out.println("");
        int maxNumber = findMax(arr);
        System.out.println(maxNumber);

        System.out.println("");
        int sumRow = 0;
        int[][] arrData = {{1,2,3,4},{4,5,6,7,8,9,10}};
        sumRow = sumSecondRow(arrData);
        System.out.println(sumRow);

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }

        }
        return sum;
    }

    public static void printSquad(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonalSquad(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                if (i == arr.length - 1 - j) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int findMax(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondRow(int[][] arr){
        int sum = 0;
        if (arr.length == 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 1){
                    sum += arr[i][j];
                }
            }
            if (i == 1){
                return sum;
            }
        }
        return -1;
    }
}
