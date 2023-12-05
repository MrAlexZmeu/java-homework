package ru.java.homeworks.homework11;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
        this.swimStaminaCosts = 4;
    }
}
