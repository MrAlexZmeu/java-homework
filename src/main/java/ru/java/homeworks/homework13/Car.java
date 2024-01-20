package ru.java.homeworks.homework13;

public class Car implements Transport {
    private int fuel;
    private Man driver;
    private int fuelConsumed;

    public Car(int fuel) {
        this.fuel = fuel;
        this.fuelConsumed = 5;
    }

    @Override
    public void setDriver(Man driver) {

        this.driver = driver;
    }

    @Override
    public boolean move(int distance, Terrain area) {

        if (area == Terrain.SWAMP || area == Terrain.DENSE_FOREST) {
            System.out.println("Машина не сможет проехать по " + area);
            return false;
        }

        if (fuelConsumed * distance > fuel) {
            System.out.println("Чтобы проехать " + distance + " надо больше топлива. Текущее значение " + fuel);
            return false;
        }
        fuel -= fuelConsumed * distance;
        System.out.println("Машина проехала по " + area + " на расстояние " + distance + ". Осталось топлива " + fuel);
        return true;
    }

}
