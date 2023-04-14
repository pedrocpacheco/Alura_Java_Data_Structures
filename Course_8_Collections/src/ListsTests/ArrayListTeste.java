package ListsTests;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTeste {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Pedro");
        nameList.add("Luane");
        nameList.add("Daniel");

        for (String name : nameList) {
            System.out.printf("Current name is: %s\n", name);
        }
        
    }
}
