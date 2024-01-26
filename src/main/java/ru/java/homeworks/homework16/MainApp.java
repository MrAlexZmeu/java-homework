package ru.java.homeworks.homework16;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "1456789");
        phoneBook.add("Иванов", "24567");
        phoneBook.add("Петров", "1324567");
        phoneBook.add("Сидоров", "1567345");

        System.out.println(phoneBook.find("Иванов"));
        phoneBook.containsPhoneNumber("24567");
    }
}
