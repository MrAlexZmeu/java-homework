package ru.java.homeworks.homework27;

public class MainApplication {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        orangeBox.add(new Orange(12));
        orangeBox.add(new Orange(14));
        orangeBox1.add(new Orange(12));
        orangeBox1.add(new Orange(5));

        System.out.println("Коробка 1 весит " + orangeBox.weight());
        System.out.println("Коробка 2 весит " + orangeBox1.weight());

        if (orangeBox.compare(orangeBox1)) {
            System.out.println("Коробки одинакового размера");
        }

        orangeBox.pourFruits(orangeBox1);
    }
}
