package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            ArrayList<ArrayList<String>> ListOfCars = new ArrayList<>();

            ArrayList<String> germanCars = new ArrayList<>();
            for (String a : Arrays.asList("BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Opel")) {
                germanCars.add(a);
            }

            ArrayList<String> americanCars = new ArrayList<>();
            for (String c : Arrays.asList("Chevrolet", "Ford", "Lincoln", "Dodge")) {
                americanCars.add(c);
            }

            ArrayList<String> japaneseCars = new ArrayList<>();
            for (String c : Arrays.asList("Toyota", "Nissan", "Lexus", "Honda")) {
                japaneseCars.add(c);
            }

            ListOfCars.add(americanCars);
            ListOfCars.add(germanCars);
            ListOfCars.add(japaneseCars);
            System.out.println(ListOfCars);
            Writer writer = new FileWriter("Cars.json");
            gson.toJson(ListOfCars, writer);
            writer.flush();
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
