package ru.java.homeworks.homework12;

public class Plate {
    private int maxValueFood;
    private int currentValueFood;

    public Plate(int maxValueFood) {
        this.maxValueFood = maxValueFood;
        this.currentValueFood = maxValueFood;
    }

    public int getCurrentValueFood() {
        return currentValueFood;
    }

    public void add(int count) {
        if (count < 0) {
            System.out.println("Из тарелки нельзя забирать");
            return;
        }
        currentValueFood += count;
        if (currentValueFood > maxValueFood) {
            System.out.println("Тарелка полная! На пол упало " + (currentValueFood - maxValueFood));
            currentValueFood = maxValueFood;
            return;
        }
        System.out.println("Добавили еду в тарелку. Теперь ее " + currentValueFood);
    }

    public boolean decrease(int count) {
        currentValueFood -= count;
        if (currentValueFood < 0) {
            currentValueFood = 0;
            return false;
        }
        return true;
    }

    public void info() {
        System.out.println("Food: " + currentValueFood);
    }
}
