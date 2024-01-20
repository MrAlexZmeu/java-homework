package ru.java.homeworks.homework13;

public class AllTerainVehicle implements Transport {
    private int fuel;
    private Man driver;
    private int fuelConsumed;

    public AllTerainVehicle(int fuel) {
        this.fuel = fuel;
        this.fuelConsumed = 5;
    }

    @Override
    public boolean move(int distance, Terrain area) {

        if (fuelConsumed * distance > fuel) {
            System.out.println("Чтобы проехать " + distance + " надо больше топлива. Текущее значение " + fuel);
            return false;
        }
        fuel -= fuelConsumed * distance;
        System.out.println("Вездеход проехал по " + area + " на расстояние " + distance + ". Осталось топлива " + fuel);
        return true;
    }

    @Override
    public void setDriver(Man driver) {

        this.driver = driver;
    }
}
