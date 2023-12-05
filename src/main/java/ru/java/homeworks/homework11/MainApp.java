package ru.java.homeworks.homework11;

public class MainApp {
    public static void main(String[] args) {
        Animal[] participants = new Animal[3];
        participants[0] = new Cat("Барсик", 2, 6);
        participants[1] = new Horse("Спирит", 4, 2, 30);
        participants[2] = new Dog("Чаппи", 3, 3, 25);
        int time = 0;
        String divider = "=";

        System.out.println("Начался забег на 10 м");
        for (Animal participant : participants) {
            time = participant.run(10);
            if (time > 0) {
                System.out.println(participant.name + " пробежал за " + time + " сек");
            }
        }

        System.out.println(divider.repeat(10));
        System.out.println("Начался заплыв на 5 м");
        for (Animal participant : participants) {
            time = participant.swim(5);
            if (time > 0) {
                System.out.println(participant.name + " проплыл за " + time + " сек");
            }
        }

        System.out.println(divider.repeat(10));
        for (Animal participant : participants) {
            participant.info();
        }

    }
}
