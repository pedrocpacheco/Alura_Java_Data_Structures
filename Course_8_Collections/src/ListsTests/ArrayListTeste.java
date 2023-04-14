package ListsTests;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Pedro");
        nameList.add("Luane");
        nameList.add("Daniel");
        nameList.add("Rick");
        nameList.add("Daryl");
        
        for (String name : nameList) {
            System.out.printf("Current name is: %s\n", name);
        }
        System.out.println(nameList);

        nameList.remove("Pedro"); // Removing item by value
        System.out.println(nameList);
        
        nameList.remove(1);
        System.out.println(nameList);

        nameList.forEach(name -> {System.out.println("Percorrendo: " + name);});
        
    }
}
