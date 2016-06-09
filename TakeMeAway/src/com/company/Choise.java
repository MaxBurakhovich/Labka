package com.company;
import java.util.Scanner;

public class Choise {
    Person Person = new Person();
    Scanner reader = new Scanner(System.in);
    EditFile Edit = new EditFile();
    Input Input = new Input();
    int menu = 1;

    public void Client_Choise() {


        int choise;
        String file = "drivers.txt";

        int Line = Input.DriverIDco;
        System.out.println("1 - See more info about driver");
        System.out.println("2 - List all drivers");
        System.out.println("3 - Add new client");
        System.out.println("4 - logout");
        System.out.println("0 - exit");
        System.out.print("Choise: ");
        choise = reader.nextInt();
        switch (choise) {
            case 1: {
                Edit.Read_After_Line(Line,file);
                break;
            }
            case 2: {
                Person.List_Drivers();
            }
            case 3: {
                Person.Add_New_Client();
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                menu = 0;
                break;
            }
        }
    }

    public void Driver_Choise() {

        int choise;

        System.out.println("1 - See more info about client");
        System.out.println("2 - List all clients");
        System.out.println("3 - Add new driver");
        System.out.println("4 - logout");
        System.out.println("0 - exit");
        System.out.print("Choise: ");
        choise = reader.nextInt();
        switch (choise) {
            case 1: {
                System.out.println("this function is under construction");
                break;
            }
            case 2: {
                Person.List_Clients();
                break;
            }
            case 3: {
                Person.Add_New_Driver();
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                menu = 0;
                break;
            }
        }
    }
}
