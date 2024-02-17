package ru.java.homeworks.homework30;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 8, 4, 1, 2, 4};
        System.out.println(Arrays.toString(arrayAfterLastOne(arr)));
        int[] arrOne = {1,1};
        System.out.println(arrayConsistOfOneTwo(arrOne));
        int[] arrOne1 = {1,2};
        System.out.println(arrayConsistOfOneTwo(arrOne1));
    }

    public static int[] arrayAfterLastOne(int[] arr) {
        int n = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                n = i;
                break;
            }
        }

        if (n == -1) {
            throw new RuntimeException();
        }

        int[] result = new int[arr.length - n - 1];
        for (int i = n + 1; i < arr.length; i++) {
            result[i - n - 1] = arr[i];
        }
        return result;
    }

    public static boolean arrayConsistOfOneTwo(int[] arr) {
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2 || arr[i] < 1) {
                return false;
            }
            if (arr[i] == 1) {
                countOne++;
            }
            if (arr[i] == 2) {
                countTwo++;
            }
        }
        if (countOne == 0 || countTwo == 0) {
            return false;
        }
        return true;
    }
}
