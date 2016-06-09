package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        EditFile Edit = new EditFile();
        Client Client = new Client();
        Driver Driver = new Driver();
        Person Person = new Person();
        Choise Choise = new Choise();
        Input Input = new Input();

        int DriverIDde;
        int DriverIDco;

        int menu = 0;

        int login;
        int coordsX = 0;
        int coordsY = 0;
        int destinX = 0;
        int destinY = 0;


        Scanner reader = new Scanner(System.in);


        do {
            System.out.println("Login as: ");
            System.out.println("1 - client");
            System.out.println("2 - driver");
            System.out.println("0 - exit");
            System.out.print("Choise: ");
            login = reader.nextInt();

            if (login == 1) {
                Input.input1();
                DriverIDco = Input.DriverIDco;
                DriverIDde = Input.DriverIDde;
                if ((DriverIDco == DriverIDde) && (DriverIDde != 0)) {
                    System.out.println("There is a driver for you with ID: " + DriverIDco);
                    menu = 1;
                    Choise.Client_Choise();
                    menu = Choise.menu;
                } else {
                    System.out.println("No drivers found!");
                    menu = 1;
                }

            } else if (login == 2){
                Input.input2();
                DriverIDco = Input.DriverIDco;
                DriverIDde = Input.DriverIDde;
                if ((DriverIDco == DriverIDde) && (DriverIDde != 0)) {
                    System.out.println("There is a client for you with ID: " + DriverIDco);
                    menu = 1;
                    Choise.Driver_Choise();
                    menu = Choise.menu;
                } else {
                    System.out.println("No clients found!");
                    menu = 1;
                }
            }
            else {
                menu = 0;
            }
        } while (menu != 0);
    }
}