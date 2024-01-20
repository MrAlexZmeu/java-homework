package ru.java.homeworks.homework13;

public class Horse implements Transport {
    private int stamina;
    private Man driver;
    private int staminaConsumed;

    public Horse(int stamina) {
        this.stamina = stamina;
        this.staminaConsumed = 3;
    }

    @Override
    public void setDriver(Man driver) {
        this.driver = driver;
    }

    @Override
    public boolean move(int distance, Terrain area) {

        if (area == Terrain.SWAMP) {
            System.out.println("Лошадь не сможет передвигаться по болоту");
            return false;
        }

        if (distance * staminaConsumed > stamina) {
            System.out.println("Не хватит сил проехать расстояние " + distance);
            return false;
        }
        stamina -= distance * staminaConsumed;
        System.out.println("На лошаде удалось проскакать  " + distance + " по " + area);
        return true;
    }
}
