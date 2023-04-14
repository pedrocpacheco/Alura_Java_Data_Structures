package Files.MoreSimple;

import java.io.FileReader;
import java.io.FileWriter;

public class SameSimpler {
    public static void main(String[] args) throws Exception{
      
        FileWriter fileWriter = new FileWriter("simplerFile.txt");
        fileWriter.write("Writing using method");
        fileWriter.write(System.lineSeparator()); // breaking line

        FileReader fileReader = new FileReader("simplerFile.txt");
        System.out.println(fileReader.read());

        fileWriter.close();
        fileReader.close();
    }
}
