package ru.java.homeworks.homework10;

public class User {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private int bornYear;
    private String email;

    public User(String firstName, String lastName, String patronymicName, int bornYear, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.bornYear = bornYear;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public int getBornYear() {
        return bornYear;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ФИО: "+this.lastName + " " + this.firstName + " " + this.patronymicName
                + "\n" + "Год рождения: " + this.bornYear
                + "\n" + "e-mail: " + this.email;
    }
}
