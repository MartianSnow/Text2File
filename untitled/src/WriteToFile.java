import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WriteToFile {
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
