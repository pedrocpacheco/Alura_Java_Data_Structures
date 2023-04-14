package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Both{
  
    public static void main(String[] args) throws Exception{
      
        FileOutputStream fileOutputStream = new FileOutputStream("teste.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream); 
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        bw.write("This is a Write and Read test!");
        bw.close();


        FileInputStream fileInputStream = new FileInputStream("teste.txt"); 
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bReader = new BufferedReader(inputStreamReader);

        System.out.println(bReader.readLine());
        bReader.close();

    }
}
