import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("WriteFile.txt");

        // write to file
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Hello \n");
            fw.write("Hi \n");
            fw.write("Bye");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
