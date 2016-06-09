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
    public String Destination;
    public int Color;

    public void Add_New_Client(){
        Client Client = new Client();
        EditFile Edit = new EditFile();

        Person.this.ID = (Edit.Count_Lines() / 7) + 1;
        Edit.Add_To_File_Int(Person.this.ID);

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Name: ");
        Person.this.Name = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Name);


        System.out.println("Enter Surname: ");
        Person.this.Surname = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Surname);


        System.out.println("Enter a phone number: ");
        Person.this.PhoneNumber = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.PhoneNumber);


        System.out.println("Enter coordsX: ");
        Person.this.Coordinates.X = reader.nextInt();
        System.out.println("Enter coordsY: ");
        Person.this.Coordinates.Y = reader.nextInt();
        Edit.Add_To_File_Int_2(Person.this.Coordinates.X,Person.this.Coordinates.Y);


        System.out.println("Enter Destination: ");
        Person.this.Destination = reader.nextLine();
        Edit.Add_To_File_String(Person.this.Destination);


        System.out.println("Enter color: ");
        Person.this.Color = reader.nextInt();
        Edit.Add_To_File_Int(Person.this.Color);
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