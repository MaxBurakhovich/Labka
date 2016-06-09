package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EditFile Edit = new EditFile();
        Client Client = new Client();
        Driver Driver = new Driver();
        Person Person = new Person();

        System.out.println("Login as: ");
        System.out.println("false - driver, true - client");
        boolean login;
        int coordsX = 0;
        int coordsY = 0;
        int destinX = 0;
        int destinY = 0;
        int DriverIDde;
        int DriverIDco;
        Scanner reader = new Scanner(System.in);
        login=reader.nextBoolean();
        if (login == true){
          //  System.out.println("All available drivers: ");
          //  Person.List_Drivers();
            System.out.println("Enter your coordinates: ");
            System.out.println("Coord X: ");
            coordsX = reader.nextInt();
            System.out.println("Coord Y: ");
            coordsY = reader.nextInt();
            System.out.println("Enter your destination: ");
            System.out.println("Coord X: ");
            destinX = reader.nextInt();
            System.out.println("Coord Y: ");
            destinY = reader.nextInt();

            String file = "drivers.txt";
            DriverIDde = Edit.Find_By_Destination(destinX,destinY,file);
            DriverIDco = Edit.Find_By_Coordinates(coordsX,coordsY,file);
            if (DriverIDco == DriverIDde){
                System.out.println("There is a driver for you with ID: " + DriverIDco);
            }
            else {
                System.out.println("No driver found!");
            }

        }
        else {
            System.out.println("All available clients: ");
            Person.List_Clients();

            System.out.println("Enter your coordinates: ");
            System.out.println("Coord X: ");
            coordsX = reader.nextInt();
            System.out.println("Coord Y: ");
            coordsY = reader.nextInt();
            System.out.println("Enter your destination: ");
            System.out.println("Coord X: ");
            destinX = reader.nextInt();
            System.out.println("Coord Y: ");
            destinY = reader.nextInt();

            String file = "Clients.txt";
            DriverIDde = Edit.Find_By_Destination(destinX,destinY,file);
            DriverIDco = Edit.Find_By_Coordinates(coordsX,coordsY,file);
            if (DriverIDco == DriverIDde){
                System.out.println("There is a client for you with ID: " + DriverIDco);
            }
            else {
                System.out.println("No clients found!");
            }
        }
    }
}