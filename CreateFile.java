import java.io.File;
import java.io.IOException;

/**
 * CreateFile
 */
public class CreateFile {
    public static void main(String[] args) 
    {
        File file = new File("Createfile.txt");

        // Create .txt file
        try
        {
            file.createNewFile();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}