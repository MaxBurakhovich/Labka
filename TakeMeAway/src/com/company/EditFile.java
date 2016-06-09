package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class EditFile {

    public static void Add_To_File_String(String SomeString,String FL) {

        try {
            File file = new File(FL);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(SomeString);
            bw.append(System.getProperty("line.separator"));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Add_To_File_Int(Integer SomeInt,String FL) {

        try {
            File file = new File(FL);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String SomeString = new Integer(SomeInt).toString();
            bw.append(SomeString);
            bw.append(System.getProperty("line.separator"));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Add_To_File_Int_2(Integer SomeInt, Integer OtherInt,String FL) {

        try {
            File file = new File(FL);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String SomeString = new Integer(SomeInt).toString();
            String OtherString = new Integer(OtherInt).toString();
            bw.append(SomeString);
            bw.append(",");
            bw.append(OtherString);
            bw.append(System.getProperty("line.separator"));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean Find_In_File(String Find,String FL) {

        try {
            File file = new File(FL);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null) {
                if (st.contains(Find)) {
                    return true;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int Count_Lines(String FL){
        int count = 0;
        try {
            File file = new File(FL);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st;
            String read = null;
            while ((read = br.readLine()) != null) {
                count = count + 1;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int Find_By_Destination(int X,int Y,String FL){
        int ID = 0;
        int count = 0;
        try {
            File file = new File(FL);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String XX = new Integer(X).toString();
            String YY = new Integer(Y).toString();
            String XY = XX + "," +YY;
            String st;
            Boolean bool;
            while ((st = br.readLine()) != null) {
                count = count + 1;
                if (st.contains(XY)) {
                    ID = (count - 6) / 7 + 1;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ID;
    }

    public int Find_By_Coordinates(int X, int Y, String FL){
        int ID = 0;
        int count = 0;
        try {
            File file = new File(FL);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String XX = new Integer(X).toString();
            String YY = new Integer(Y).toString();
            String XY = XX + "," +YY;
            String st;
            while ((st = br.readLine()) != null) {
                count = count + 1;
                if (st.contains(XY)) {
                    ID = (count - 5) / 7 + 1;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ID;
    }

    public void Read_After_Line(int Line, String FL){

        try {

            File file = new File(FL);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st;
            for (int i = 0; i < Line; ++i) {
                br.readLine();
            }
            int j = 1;
            switch(j){
                case 1: {
                    st = br.readLine();
                    System.out.println("ID: " + st);
                    j=2;
                }
                case 2: {
                    st = br.readLine();
                    System.out.println("Name: " + st);
                    j=3;
                }
                case 3: {
                    st = br.readLine();
                    System.out.println("Surname: " + st);
                    j=4;
                }
                case 4: {
                    st = br.readLine();
                    System.out.println("PhoneNumber: " + st);
                    j=5;
                }
                case 5: {
                    st = br.readLine();
                    System.out.println("CoordsXY: " + st);
                    j=6;
                }
                case 6: {
                    st = br.readLine();
                    System.out.println("DestinationXY: " + st);
                    j=7;
                }
                case 7: {
                    st = br.readLine();
                    System.out.println("Color: " + st);
                    break;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}