package com.company;

public class Bedroom {
    private String name;
    private Bed bed;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Ceiling ceiling;

    public Bedroom(String name, Bed bed, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Ceiling ceiling) {
        this.name = name;
        this.bed = bed;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making Bed");
        bed.make();
    }
}
