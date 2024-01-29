import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Human man1 = new Human("Mike", 30, 77);
       // Human man2 = new Human("Jim", 22, 70);

       // man1.eat();
       // man2.eat();
       // System.out.println(Human.humans);

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number here: ");
        double number1 = sc.nextDouble();

        System.out.println("Enter the 2nd number here: ");
        double number2 = sc.nextDouble();

        System.out.println("Enter the 3rd number here: ");
        double number3 = sc.nextDouble();

        System.out.println ("The smallest number is: " + smallest(number1, number2, number3));
        }
    public static double smallest (double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }*/
        int arr[] = {1, 12, 10, 34, 19, 22, 11, 99, 223, 81, 32};
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i])
                {
                    min = arr[i];
                }
        }
        System.out.println("The minimum element is " + min);

        System.out.println("рік народження мого друга " + (3126 - 8));
    }
}