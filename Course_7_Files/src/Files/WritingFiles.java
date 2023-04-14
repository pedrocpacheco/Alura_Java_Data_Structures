package Files;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WritingFiles {
    public static void main(String[] args) throws IOException{
    
        OutputStream fo = new FileOutputStream("saida.txt"); 
        OutputStreamWriter osw = new OutputStreamWriter(fo); 
        BufferedWriter bw = new BufferedWriter(osw); 
      
        bw.write("This is the printed message in the file");
        bw.newLine();
        bw.write("I broke a line.");
        
        bw.close(); 
     }
}
