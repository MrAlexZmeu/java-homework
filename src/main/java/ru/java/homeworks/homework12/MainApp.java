package ru.java.homeworks.homework12;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Grey", 3);
        cats[2] = new Cat("Black", 4);

        Plate plate = new Plate(10);

        for (Cat cat:cats) {
            cat.eat(plate);
        }

        for (Cat cat:cats) {
            cat.info();
        }
    }
}
