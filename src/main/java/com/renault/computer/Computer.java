package com.renault.computer;

public class Computer {
    private String brand;
    private int memories;

    private Keyboard keyboard;

    public Computer(String brand, int memories, Keyboard keyboard) {
        this.brand = brand;
        this.memories = memories;
        this.keyboard = keyboard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemories() {
        return memories;
    }

    public void setMemories(int memories) {
        this.memories = memories;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", memories=").append(memories);
        sb.append(", keyboard=").append(keyboard);
        sb.append('}');
        return sb.toString();
    }

    public void start() {
        System.out.println("Starting my computer");
        keyboard.start();

    }

    public void doSomeStuff() {
        System.out.println("Modify photos");
    }

    public void stop() {
        System.out.println("Stop the computer");
    }
}
