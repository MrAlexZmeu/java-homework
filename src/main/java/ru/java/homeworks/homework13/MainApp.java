package ru.java.homeworks.homework13;

public class MainApp {
    public static void main(String[] args) {
        Man man = new Man("David", 1150);
        AllTerainVehicle allTerainVehicle = new AllTerainVehicle(100);
        Bicycle bicycle = new Bicycle();
        Car car = new Car(120);
        Horse horse = new Horse(60);

        man.letsGo(10, Terrain.SWAMP);
        man.getInTransport(bicycle);
        man.letsGo(100, Terrain.SWAMP);
        man.getOutOfTransport();
        man.getInTransport(allTerainVehicle);
        man.letsGo(10, Terrain.SWAMP);
    }
}
