package ru.java.homeworks.homework27;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits;

    public Box(){
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit){
        this.fruits.add(fruit);
    }

    public int weight(){
        int result = 0;
        for (T fruit:fruits) {
            result += fruit.getWeight();
        }
        return  result;
    }

    public boolean compare(Box<?> box){
        return this.weight() == box.weight();
    }

    public void pourFruits(Box<? super T> box){
        if (box == null){
            System.out.println("Не передана коробка для пересыпания");
            return;
        }
        if (this == box){
            System.out.println("Перемещения внутри коробки запрещены");
            return;
        }

        for (int i = 0; i < fruits.size(); i++) {
            box.add(fruits.get(i));
        }
        fruits.clear();
        System.out.println("Пересыпали все фрукты из коробки");
    }
}
