package ru.java.homeworks.homework11;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
        this.swimStaminaCosts = 2;
    }
}
