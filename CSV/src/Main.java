import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        String csv = "C:\\Users\\Vlad\\OneDrive\\Desktop\\TestFile.csv";
        Reader r = new Reader();
        r.CSV(csv);
    }

    static class Reader {
        public void CSV(String csv) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(csv));
                while((line = br.readLine()) != null){
                    String[] occupation = line.splitby(csvSplitBy);
                    System.out.println("Occupation " + occupation[3]);
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}