package tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // Creating NameList
        List<String> nameList = new ArrayList<String>();
    
        // Adding items to List
        nameList.add("Pedro");
        nameList.add("Luane");
        nameList.add("Daniel");
        nameList.add("Rick");
        nameList.add("Daryl");
        
        // ForEach printing all the names with caption
        for (String name : nameList) {
            System.out.printf("Current name is: %s\n", name);
        }
        // Printing the Default Look
        System.out.println(nameList);
        System.out.println("Printing the Espcific name: " + nameList.get(0));

        // Removing item by value
        nameList.remove("Pedro");
        System.out.println(nameList); // Printing after removing

        // Removing item by index
        nameList.remove(1); 
        System.out.println(nameList); // Printing after removing

        // ForEach using ArrayList method
        nameList.forEach(name -> {System.out.println("This name is: " + name);});
        
        // Sorting the List
        Collections.sort(nameList);
        System.out.println(nameList); // Printing the sorted list


    }
}
