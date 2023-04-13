package Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFiles {
  public static void main(String[] args) throws IOException{
    
    // Creating File Input Stream -> Can Only Read Bytes
    FileInputStream fileInputStream = new FileInputStream("lorem.txt"); // Taking the Text and Turning to Binary

    // Creating a InputStreamReader -> Takes the bytes and turn to an Array, dont read.
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); // Taking the Binary to characters

    // Creating a BufferedReader -> Reads
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // Takes a Reader 
    String line = bufferedReader.readLine(); // Reads a Line of the Text
  
    System.out.println("Printing all the lines: ");

    //Loop to print all the lines
    while(line != null){
      System.out.println(line);
      line = bufferedReader.readLine();
    }
    bufferedReader.close(); // Similar to an Scanner, we need to tell the BR to close when its stops reading


  }
}
