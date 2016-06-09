package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EditFile Edit = new EditFile();
        Client Client = new Client();
        Driver Driver = new Driver();
        Person Person = new Person();
        Choise Choise = new Choise();
        int menu = 0;

        int login;
        int coordsX = 0;
        int coordsY = 0;
        int destinX = 0;
        int destinY = 0;
        int DriverIDde;
        int DriverIDco;

        Scanner reader = new Scanner(System.in);


        do {
            System.out.println("Login as: ");
            System.out.println("1 - client");
            System.out.println("2 - driver");
            System.out.println("0 - exit");
            System.out.print("Choise: ");
            login = reader.nextInt();

            if (login == 1) {
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
                if (DriverIDco == DriverIDde) {
                    System.out.println("There is a driver for you with ID: " + DriverIDco);
                    menu = 1;
                    Choise.Client_Choise();
                    menu = Choise.menu;
                } else {
                    System.out.println("No driver found!");
                    menu = 1;
                    Choise.Client_Choise();
                    menu = Choise.menu;
                }

            } else if (login == 2){
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
                DriverIDde = Edit.Find_By_Destination(destinX, destinY, file);
                DriverIDco = Edit.Find_By_Coordinates(coordsX, coordsY, file);
                if (DriverIDco == DriverIDde) {
                    System.out.println("There is a client for you with ID: " + DriverIDco);
                    menu = 1;
                    Choise.Driver_Choise();
                    menu = Choise.menu;
                } else {
                    System.out.println("No clients found!");
                    menu = 1;
                    Choise.Driver_Choise();
                    menu = Choise.menu;
                }
            }
            else {
                menu = 0;
            }
        } while (menu != 0);
    }
}