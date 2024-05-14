import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("WriteFile.txt");

        // read from file using Scanner
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // read from File using fileHeader
        try {
            FileReader fr = new FileReader(file);
            int i = 0;
            while((i=fr.read())!=-1)
            {
                System.out.println(i);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read from file using BufferedReader
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String i = " ";
            while ((i=br.readLine())!=null) {
                System.out.println(i);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
