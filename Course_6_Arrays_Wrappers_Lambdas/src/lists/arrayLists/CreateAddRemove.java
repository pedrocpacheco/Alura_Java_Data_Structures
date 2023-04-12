package lists.arrayLists;

import java.util.ArrayList;

public class CreateAddRemove {
    public static void main(String[] args) {
        
        // Creating the nameList
        ArrayList<String> nameList = new ArrayList<String>();

        // Priting nameList size as 0
        System.out.println(nameList.size());

        // Creating name variables
        String nameMale = "Pedro";
        String nameFemale = "Luane";

        // Adding names to nameList
        nameList.add(nameMale);
        nameList.add(nameFemale);

        // Priting especific names from nameList
        System.out.println("The Male is: " + nameList.get(0));
        System.out.println("The Female is: " + nameList.get(1));

        // Priting the nameList size after adding names:
        System.out.println(nameList.size());

        // Removing name from nameList using it's id
        nameList.remove(0); // Pedro Removed

        // Printing nameList size after removing
        System.out.println(nameList.size());
    }
    
}
