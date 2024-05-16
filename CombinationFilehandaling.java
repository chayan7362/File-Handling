import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CombinationFilehandaling {
    public static void main(String[] args) {
        File file = new File("JavaInfo.txt");
        // Create 
        try {
            file.createNewFile();
            // Write
            FileWriter fw = new FileWriter(file);
            fw.write("Java is a PL used to develop App");
            fw.append("its a Platform");
            fw.close();
            // read
            Scanner sc = new Scanner(file);
            while(sc.hasNext())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
            
            // Delete
            if(file.delete())
            {
                System.out.println("my file is deleted");
            }
            else{
                System.out.println();
            }

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
