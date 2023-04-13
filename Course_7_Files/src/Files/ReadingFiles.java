package Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFiles {
  public static void main(String[] args) throws IOException{
    
    // Creating File Input Stream -> Can Only Read Bytes
    FileInputStream fileInputStream = new FileInputStream("./lorem.txt");
    fileInputStream.read(); // Taking the Text and Turning to Binary

    // Creating a InputStreamReader -> Takes the bytes and turn to an Array, dont read.
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    inputStreamReader.read(); // Taking the Binary to characters

    // Creating a BufferedReader -> Reads
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Takes a Reader 
    String firstLine = bufferedReader.readLine(); // Reads a Line of the Text
    

  }
}
