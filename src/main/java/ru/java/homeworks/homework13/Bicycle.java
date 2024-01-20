package ru.java.homeworks.homework13;

public class Bicycle implements Transport {
    private Man driver;
    private int energyConsumed;

    public Bicycle() {
        this.energyConsumed = 2;
    }

    @Override
    public void setDriver(Man driver) {
        this.driver = driver;
    }

    @Override
    public boolean move(int distance, Terrain area) {

        if (area == Terrain.SWAMP) {
            System.out.println("Велосипед не сможет проехать по болоту");
            return false;
        }

        if (distance * energyConsumed > driver.getEnergy()) {
            System.out.println("Не хватит сил проехать расстояние " + distance);
            return false;
        }
        driver.decreaseEnergy(distance * energyConsumed);
        System.out.println("На велосипеде удалось проехать " + distance + " по " + area);
        return true;
    }
}
