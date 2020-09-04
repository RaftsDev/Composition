package com.company;

public class Main {

    public static void main(String[] args) {
	// walls
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("north");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("south");

//        bed

        Bed bed = new Bed("western",2,3,2,1);

//        ceiling
        Ceiling ceiling = new Ceiling(7,333);

//        lamp
        Lamp lamp = new Lamp("classic",false,3);

//        Bedroom

        Bedroom bedroom = new Bedroom("Regular", bed, wall1, wall2, wall3, wall4, lamp, ceiling);

        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
