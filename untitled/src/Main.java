import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String txt = "C:\\Users\\Vlad\\OneDrive\\Desktop\\test.txt";

        WriteToFile wrt = new WriteToFile();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String text = sc.nextLine();

        wrt.WriteToFile(txt, text);
    }
    static class WriteToFile {
        public void WriteToFile(String path, String text) {
            File file = new File(path);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.write("\n" + formatter.format(date) + ": " + text);
                writer.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}