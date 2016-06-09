package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.jar.Attributes;

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

        String file = "Clients.txt";
        Person.this.ID = (Edit.Count_Lines(file) / 7) + 1;
        Edit.Add_To_File_Int(Person.this.ID,file);

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Name: ");
        Person.this.Name = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Name,file);


        System.out.println("Enter Surname: ");
        Person.this.Surname = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Surname,file);


        System.out.println("Enter a phone number: ");
        Person.this.PhoneNumber = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.PhoneNumber,file);


        System.out.println("Enter coordsX: ");
        Person.this.Coordinates.X = reader.nextInt();
        System.out.println("Enter coordsY: ");
        Person.this.Coordinates.Y = reader.nextInt();
        Edit.Add_To_File_Int_2(Person.this.Coordinates.X,Person.this.Coordinates.Y,file);


        System.out.println("Enter Destination coordsX: ");
        Person.this.Destination.X = reader.nextInt();
        System.out.println("Enter Destination coordsY: ");
        Person.this.Destination.Y = reader.nextInt();
        Edit.Add_To_File_Int_2(Person.this.Destination.X,Person.this.Destination.Y,file);


        System.out.println("Enter color: ");
        Person.this.Color = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.Color,file);
    }

    public void Add_New_Driver(){
        Driver Driver = new Driver();
        EditFile Edit = new EditFile();

        String file = "drivers.txt";
        Person.this.ID = (Edit.Count_Lines(file) / 7) + 1;
        Edit.Add_To_File_Int(Person.this.ID,file);

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Name: ");
        Person.this.Name = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Name,file);


        System.out.println("Enter Surname: ");
        Person.this.Surname = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Surname,file);


        System.out.println("Enter a phone number: ");
        Person.this.PhoneNumber = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.PhoneNumber,file);


        System.out.println("Enter coordsX: ");
        Person.this.Coordinates.X = reader.nextInt();
        System.out.println("Enter coordsY: ");
        Person.this.Coordinates.Y = reader.nextInt();
        Edit.Add_To_File_Int_2(Person.this.Coordinates.X,Person.this.Coordinates.Y,file);


        System.out.println("Enter Destination coordsX: ");
        Person.this.Destination.X = reader.nextInt();
        System.out.println("Enter Destination coordsY: ");
        Person.this.Destination.Y = reader.nextInt();
        Edit.Add_To_File_Int_2(Person.this.Destination.X,Person.this.Destination.Y,file);


        System.out.println("Enter color: ");
        Person.this.Color = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.Color,file);
    }

    public void List_Drivers(){

        try {
            File file = new File("drivers.txt");
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
}