package ru.java.homeworks.homework11;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int runStaminaCosts;
    protected int swimSpeed;
    protected int swimStaminaCosts;
    protected int stamina;

    protected Animal(String name, int runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = 0;
        this.runStaminaCosts = 1;
        this.swimStaminaCosts = -1;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Имя: " +name + " остаток выносливости " + stamina);
    }

    public int run(int distance) {
        if (runStaminaCosts <= 0) {
            System.out.println(name + " не умеет бегать");
            return -1;
        }
        int time = 0;
        if (stamina < distance * runStaminaCosts){
            stamina = 0;
            System.out.println(name +" устал и не добежал " + (distance - stamina / runStaminaCosts) +" м");
            return -1;
        }
        System.out.println(name + " побежал дистанцию " + distance + " м");
        time = distance / this.runSpeed;
        stamina -= distance * runStaminaCosts;
        if (stamina == 0) {
            System.out.println(name + " устал");
        }
        return time;
    }

    public int swim(int distance) {
        if (swimStaminaCosts <= 0) {
            System.out.println(name + " не умеет плавать");
            return -1;
        }
        int time = 0;
        if (stamina < distance * swimStaminaCosts){
            stamina = 0;
            System.out.println(name +" устал и не доплыл " + (distance - stamina / swimStaminaCosts) +" м");
            return -1;
        }
        System.out.println(name + " поплыл дистанцию " + distance + " м");
        time = distance / this.swimSpeed;
        stamina -= distance * swimStaminaCosts;
        if (stamina == 0) {
            System.out.println(name + " устал");
        }
        return time;
    }
}
