package lists.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListXLinkedList {
    public static void main(String[] args) {
        // ARRAY-LIST
        System.out.println("ArrayList (maleNames):");

        // Creating a ArrayList by using a List Reference
        List<String> maleNames = new ArrayList<String>();
       
        // Using the ArrayLists methods
        System.out.println("Using the ArrayList Methods: ");
        
        // Adding
        maleNames.add("Pedro");
        maleNames.add("Kauã");
        //Priting List Itens After Adding 2 Names
        System.out.println(maleNames);
        // Priting List Size
        System.out.println(maleNames.size());

        // Removing
        maleNames.remove(1);
        // Priting After Removing 1 Name
        System.out.println(maleNames);
        // Priting the Size
        maleNames.size();

        // LINKED-LIST
        System.out.println("LinkedList (femaleNames): ");

        // Creating a ArrayList by using a List Reference
        List<String> femaleNames = new LinkedList<String>();
       
        // Using the ArrayLists methods
        System.out.println("Using the ArrayList Methods: ");
        
        // Adding
        femaleNames.add("Luane");
        femaleNames.add("Júlia");
        //Priting List Itens After Adding 2 Names
        System.out.println(maleNames);
        // Priting List Size
        System.out.println(maleNames.size());

        // Removing
        maleNames.remove(1);
        // Priting After Removing 1 Name
        System.out.println(maleNames);
        // Priting the Size
        maleNames.size();

    }
}
