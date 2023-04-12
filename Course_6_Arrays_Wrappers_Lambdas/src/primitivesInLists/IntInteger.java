package primitivesInLists;

import java.util.ArrayList;
import java.util.List;

public class IntInteger {
    public static void main(String[] args) {

        // Creating ages
        int agePedro = 17;
        int ageLuane = 18;

        // How we make a "List" of ints using Arrays only
        int[] agesArray = new int[5];

        // Adding a age into a Arrat
        agesArray[0] = agePedro;
        agesArray[1] = ageLuane;
        // It's hard coded and bad to use, thats why we use Lists

        // List only storages Objects, so Java Creates a Class Integer for Ints
        List<Integer> intInteger = new ArrayList<Integer>();
        
        // Adding Ints into a Integer List
        intInteger.add(agePedro);
        intInteger.add(ageLuane);
    }
}
