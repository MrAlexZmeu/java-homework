package ru.java.homeworks.homework10;

public class MainApp {
    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User("Иван", "Петров", "Дмитриевич", 1993, "ipd@mail.ru");
        users[1] = new User("Петр", "Иванов", "Алексеевич", 1953, "ipa@mail.ru");
        users[2] = new User("Алексей", "Пупкин", "Иванович", 1967, "pai@mail.ru");
        users[3] = new User("Михаил", "Летов", "Александрович", 2000, "lma@mail.ru");
        users[4] = new User("Константин", "Леснов", "Кириллович", 1999, "lkk@mail.ru");
        users[5] = new User("Валерий", "Морской", "Артемович", 1998, "mva@mail.ru");
        users[6] = new User("Александр", "Трубкин", "Алексеевич", 1960, "taa@mail.ru");
        users[7] = new User("Борис", "Древнов", "Борисович", 1959, "dbb@mail.ru");
        users[8] = new User("Кирилл", "Бубкин", "Дмитриевич", 1961, "bkd@mail.ru");
        users[9] = new User("Сергей", "Губинов", "Алексеевич", 1994, "gsa@mail.ru");
        String stringSymbol = "=";
        for (int i = 0; i < users.length; i++) {
            if (2023 - users[i].getBornYear() >= 40) {
                System.out.println(users[i]);
                System.out.println(stringSymbol.repeat(10));
            }
        }

        Box box1 = new Box(10, "Red", false);
        box1.openBox();
        box1.put("ball");
        box1.getOut("table");
    }
}
