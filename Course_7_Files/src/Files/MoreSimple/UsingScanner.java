package Files.MoreSimple;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
 

public class UsingScanner {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

            Scanner scanner2 = new Scanner(line);
            scanner2.useLocale(Locale.US);
            scanner2.useDelimiter(",");
            scanner2.close();

            
        }
        
        
    }
}
