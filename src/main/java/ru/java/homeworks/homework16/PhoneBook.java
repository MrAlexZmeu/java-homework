package ru.java.homeworks.homework16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String fio, String phone) {
        book.computeIfAbsent(fio, a -> new HashSet<>()).add(phone);
    }

    public Set<String> find(String fio) {
        return book.get(fio);
    }

    public void containsPhoneNumber(String number){
        for (Map.Entry<String, Set<String>> values: book.entrySet()) {
            if(values.getValue().contains(number)){
                System.out.println("Контакт существует в справочнике. Его имя "+values.getKey());
                return;
            }
        }
        System.out.println("Контакта не существует");
    }

}

