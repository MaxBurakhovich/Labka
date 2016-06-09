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
        Scanner reader = new Scanner(System.in);
        login=reader.nextBoolean();
        if (login == true){
            System.out.println("All available drivers: ");
            Person.List_Drivers();
        }
        else {
            System.out.println("All available clients: ");
            Person.List_Clients();
        }
    }
}