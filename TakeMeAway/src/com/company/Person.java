package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Person {
    private int ID;
    public String Name;
    public String Surname;
    public int PhoneNumber;
    public coordinate Coordinates;
    public coordinate Destination;
    public int Color;

    public void Add_New_Client(){
        Client Client = new Client();
        EditFile Edit = new EditFile();
        Scanner reader = new Scanner(System.in);

        String file = "Clients.txt";

        Person.this.ID = (Edit.Count_Lines(file) / 7) + 1;

        System.out.println("Enter Name: ");
        Person.this.Name = reader.nextLine();

        System.out.println("Enter Surname: ");
        Person.this.Surname = reader.nextLine();

        do {
            System.out.println("Enter a phone number: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter a phone number: ");
                reader.next();
            }
            Person.this.PhoneNumber = reader.nextInt();
        }
        while (Person.this.PhoneNumber < 0);

        do {
            System.out.println("Enter coordsX: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter coordsX: ");
                reader.next();
            }
            Person.this.Coordinates.X = reader.nextInt();
        }
        while (Person.this.Coordinates.X < 0);

        do {
            System.out.println("Enter coordsY: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter coordsY: ");
                reader.next();
            }
            Person.this.Coordinates.Y = reader.nextInt();
        }
        while (Person.this.Coordinates.Y < 0);

        do {
            System.out.println("Enter Destination coordsX: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter Destination coordsX: ");
                reader.next();
            }
            Person.this.Destination.X = reader.nextInt();
        }
        while (Person.this.Destination.X < 0);

        do {
            System.out.println("Enter Destination coordsY: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter Destination coordsY: ");
                reader.next();
            }
            Person.this.Destination.Y = reader.nextInt();
        }
        while (Person.this.Destination.Y < 0);

        do {
            System.out.println("Enter color: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter color: ");
                reader.next();
            }
            Person.this.Color = reader.nextInt();
        }
        while (Person.this.Color < 0);

        EditFile.Add_To_File_Int(Person.this.ID,file);
        EditFile.Add_To_File_String(Person.this.Name,file);
        EditFile.Add_To_File_String(Person.this.Surname,file);
        EditFile.Add_To_File_Int(Person.this.PhoneNumber,file);
        EditFile.Add_To_File_Int_2(Person.this.Coordinates.X,Person.this.Coordinates.Y,file);
        EditFile.Add_To_File_Int_2(Person.this.Destination.X,Person.this.Destination.Y,file);
        EditFile.Add_To_File_Int(Person.this.Color,file);
    }

    public void Add_New_Driver(){
        Driver Driver = new Driver();
        EditFile Edit = new EditFile();
        Scanner reader = new Scanner(System.in);

        String file = "drivers.txt";
        
        Person.this.ID = (Edit.Count_Lines(file) / 7) + 1;

        System.out.println("Enter Name: ");
        Person.this.Name = reader.nextLine();

        System.out.println("Enter Surname: ");
        Person.this.Surname = reader.nextLine();

        do {
            System.out.println("Enter a phone number: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter a phone number: ");
                reader.next();
            }
            Person.this.PhoneNumber = reader.nextInt();
        }
        while (Person.this.PhoneNumber < 0);

        do {
            System.out.println("Enter coordsX: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter coordsX: ");
                reader.next();
            }
            Person.this.Coordinates.X = reader.nextInt();
        }
        while (Person.this.Coordinates.X < 0);

        do {
            System.out.println("Enter coordsY: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter coordsY: ");
                reader.next();
            }
            Person.this.Coordinates.Y = reader.nextInt();
        }
        while (Person.this.Coordinates.Y < 0);

        do {
            System.out.println("Enter Destination coordsX: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter Destination coordsX: ");
                reader.next();
            }
            Person.this.Destination.X = reader.nextInt();
        }
        while (Person.this.Destination.X < 0);

        do {
            System.out.println("Enter Destination coordsY: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter Destination coordsY: ");
                reader.next();
            }
            Person.this.Destination.Y = reader.nextInt();
        }
        while (Person.this.Destination.Y < 0);

        do {
            System.out.println("Enter color: ");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.println("Enter color: ");
                reader.next();
            }
            Person.this.Color = reader.nextInt();
        }
        while (Person.this.Color < 0);

        EditFile.Add_To_File_Int(Person.this.ID,file);
        EditFile.Add_To_File_String(Person.this.Name,file);
        EditFile.Add_To_File_String(Person.this.Surname,file);
        EditFile.Add_To_File_Int(Person.this.PhoneNumber,file);
        EditFile.Add_To_File_Int_2(Person.this.Coordinates.X,Person.this.Coordinates.Y,file);
        EditFile.Add_To_File_Int_2(Person.this.Destination.X,Person.this.Destination.Y,file);
        EditFile.Add_To_File_Int(Person.this.Color,file);
    }

    public void List_Drivers(){

        try {
            File file = new File("drivers.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int count = 1;
            String read = null;
            while ((read = br.readLine()) != null) {
                System.out.println(read);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void List_Clients(){

        try {
            File file = new File("Clients.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st;
            int count = 1;
            String read = null;
            while ((read = br.readLine()) != null) {
                System.out.println(read);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int DistanceAB(int Ax,int Ay, int Bx, int By){
        int distance = 0;
        int Ax2Ay2;
        int Bx2By2;
        int A;
        int B;
        Ax2Ay2 = Ax * Ax + Ay * Ay;
        Bx2By2 = Bx * Bx + By * By;
        A = Ax2Ay2^(1/2);
        B = Bx2By2^(1/2);
        distance = Math.abs(B - A);
        return distance;
    }
}