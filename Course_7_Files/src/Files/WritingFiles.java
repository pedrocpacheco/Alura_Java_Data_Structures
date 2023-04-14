package Files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WritingFiles {
    public static void main(String[] args) throws IOException{
    
        OutputStream fileInputStream = new FileOutputStream("saida.txt"); 
        OutputStreamWriter inputStreamReader = new OutputStreamWriter(fileInputStream); 
        BufferedWriter bufferedWriter = new BufferedWriter(inputStreamReader); 
      
        bufferedWriter.write("This is the printed message in the file");
        bufferedWriter.newLine();
        bufferedWriter.write("I broke a line.");
        
        bufferedWriter.close(); 
     }
}
