import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Volvo", "Toyota", "VW"};
        for(int i = 0; i < cars.length; i++){
            System.out.println("The car make is: "+ cars[i]);
        }
    }
}