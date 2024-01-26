package ru.java.homeworks.homework14;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {
        String[][] array = {
                {"10","5","7","1"},
                {"10","err","1","2"},
                {"10","5","7","4"},
                {"10","5","7","4"}
        };

        try{
            System.out.println("Сумма массива = "+ sumArray(array));
        } catch (AppArraySizeException | AppArrayDataException e){
            System.err.println(e.getMessage());
        }
    }

    public static int sumArray(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException("Размер массива не соответствует ожидаемому.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != 4) {
                    throw new AppArraySizeException("Размер массива не соответствует ожидаемому.");
                }

                try{
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new AppArrayDataException("Не удалось преобразовать к числу ячейку массива "+i + ","+j);
                }
            }

        }
        return sum;
    }
}
