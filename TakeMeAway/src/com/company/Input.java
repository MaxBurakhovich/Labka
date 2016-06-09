package com.company;
import java.util.Scanner;

public class Input {

    int DriverIDde;
    int DriverIDco;

    public void input1(){
        EditFile Edit = new EditFile();

        Scanner reader = new Scanner(System.in);

        int coordsX = 0;
        int coordsY = 0;
        int destinX = 0;
        int destinY = 0;

        System.out.println("Enter your coordinates: ");
        System.out.print("Coord X: ");
        coordsX = reader.nextInt();
        System.out.print("Coord Y: ");
        coordsY = reader.nextInt();
        System.out.println("Enter your destination: ");
        System.out.print("Coord X: ");
        destinX = reader.nextInt();
        System.out.print("Coord Y: ");
        destinY = reader.nextInt();

        String file = "drivers.txt";
        DriverIDde = Edit.Find_By_Destination(destinX, destinY, file);
        DriverIDco = Edit.Find_By_Coordinates(coordsX, coordsY, file);
    }

    public void input2() {
        EditFile Edit = new EditFile();

        Scanner reader = new Scanner(System.in);

        int coordsX = 0;
        int coordsY = 0;
        int destinX = 0;
        int destinY = 0;
        System.out.println("Enter your coordinates: ");
        System.out.print("Coord X: ");
        coordsX = reader.nextInt();
        System.out.print("Coord Y: ");
        coordsY = reader.nextInt();
        System.out.println("Enter your destination: ");
        System.out.print("Coord X: ");
        destinX = reader.nextInt();
        System.out.print("Coord Y: ");
        destinY = reader.nextInt();

        String file = "Clients.txt";
        DriverIDde = Edit.Find_By_Destination(destinX, destinY, file);
        DriverIDco = Edit.Find_By_Coordinates(coordsX, coordsY, file);
    }
}
