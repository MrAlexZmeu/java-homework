package ru.java.homeworks.homework10;

import java.util.Objects;

public class Box {
    private int size;
    private String color;
    private boolean isOpened;
    private String item;

    public Box(int size, String color, boolean isOpened) {
        this.size = size;
        this.color = color;
        this.isOpened = isOpened;
    }

    public void openBox() {
        if (this.isOpened == true){
            System.out.println("Коробка уже открыта");
        }
        this.isOpened = true;
        System.out.println("Коробка открыта");
    }

    public void closeBox() {
        if (this.isOpened != true){
            System.out.println("Коробка уже закрыта");
        }
        this.isOpened = false;
        System.out.println("Коробка закрыта");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена в " + color);
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void put(String item){

        if (!this.isOpened) {
            System.out.println("Коробка закрыта, откройте чтобы положить предмет");
            return;
        }
        if (Objects.equals(this.item, item)) {
            System.out.println("В коробке уже лежит " + this.item);
            return;
        }
        if (this.item != null) {
            System.out.println("Нет места! В коробке лежит " + this.item);
            return;
        }
        this.item = item;
        System.out.println("В коробку положили " + item);
    }

    public void getOut(String item){
        if (!this.isOpened) {
            System.out.println("Коробка закрыта, откройте чтобы взять предмет");
            return;
        }
        if (!Objects.equals(this.item, item)) {
            System.out.println("В коробке нет " + item);
            return;
        }

        this.item = null;
        System.out.println("Из коробки достали " + item);
    }

    @Override
    public String toString() {
        return "Box: " +
                "size=" + size +
                ", color='" + color + '\'';
    }
}
