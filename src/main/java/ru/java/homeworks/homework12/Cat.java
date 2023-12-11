package ru.java.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getCurrentValueFood() < appetite) {
            System.out.println(name + " не поел, в тарелке мало еды");
            return;
        }
        fullness = plate.decrease(appetite);
        System.out.println(name + " поел");
    }

    public void info() {
        if (fullness) {
            System.out.println(name + ": сыт");
            return;
        }
        System.out.println(name + ": голоден");
    }

}
