package ru.java.homeworks.homework13;

public class Man {
    private String name;
    private Transport currentTransport;
    private int energy;

    public Man(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy(int count) {
        energy -= count;
    }

    public void getInTransport(Transport transport) {

        if (currentTransport != null) {
            System.out.println(name + " в данный момент использует " + currentTransport + " для перемещения");
            return;
        }

        transport.setDriver(this);
        this.currentTransport = transport;
        System.out.println(name + " теперь использует " + currentTransport + " для перемещения");
    }

    public void getOutOfTransport() {

        if (currentTransport == null) {
            System.out.println(name + " в данный момент ничего не использует");
            return;
        }
        this.currentTransport = null;
        System.out.println(name + " снова перемещаеться пешком");
    }

    public void letsGo(int distance, Terrain area) {

        if (distance == 0) {
            System.out.println("Стоим на месте.");
            return;
        }

        if (currentTransport == null) {
            System.out.println(name + " прошел пешком " + distance + " по " + area);
            return;
        }
        currentTransport.move(distance, area);
    }

}
