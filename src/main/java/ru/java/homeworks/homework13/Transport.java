package ru.java.homeworks.homework13;

public interface Transport {
    boolean move(int distance, Terrain area);
    void setDriver(Man driver);
}
