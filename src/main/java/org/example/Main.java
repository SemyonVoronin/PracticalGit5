package org.example;

public class Main {

}
class House {
    public final int floors;

    public House(int floors) {
        if (floors <= 0)
            throw new IllegalArgumentException("Floors must be positive");

        this.floors = floors;
    }

}