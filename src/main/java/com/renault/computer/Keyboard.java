package com.renault.computer;

public class Keyboard {
    private int keys;

    public Keyboard(int keys) {
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("keys=").append(keys);
        sb.append('}');
        return sb.toString();
    }

    public void start() {
        System.out.println("starting the keyboard");

    }
}
