import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String txt = "test.txt";

        WriteToFile wrt = new WriteToFile();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String text = sc.nextLine();

        wrt.WriteToFile(txt, text);
    }
}