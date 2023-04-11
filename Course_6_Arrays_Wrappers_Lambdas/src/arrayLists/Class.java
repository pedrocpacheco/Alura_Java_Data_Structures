package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        
        // Creating Name List
        ArrayList<String> nameList = new ArrayList<String>();

        //Adding names to nameList
        nameList.add("Pedro");
        nameList.add("Luane");

        // Creating Scanner to Name Search
        Scanner sc = new Scanner(System.in);

        // Asking the User to Type the Name he's looking for
        System.out.println("Search in the Name list: ");
        String nameSearched = sc.nextLine();

        // Dinamic answering if the name is or is not in the nameList
        if(nameList.contains(nameSearched))
            System.out.println("\nName Founded!\n");
            System.out.println("Do you want the remove that name do the List? \nPress 1: Yes | Other: No\n");
            int option = sc.nextInt();
            sc.close();

            if(option == 1){
                nameList.remove(nameSearched);
            }
        else  
            System.out.println("\nName Not Founded!\n");

            System.out.println("Do you want the add that name do the List? \nPress 1: Yes | Other: No\n");
            int option = sc.nextInt();
            sc.close();

            if(option == 1){
                nameList.add(nameSearched);
            }
        // Showing all the name using a for loop
        System.out.println("All the Names in The Name List Are:\n");
        for(String name : nameList){
            System.out.println("Current Name Is: " + name);
        }


    }
}
