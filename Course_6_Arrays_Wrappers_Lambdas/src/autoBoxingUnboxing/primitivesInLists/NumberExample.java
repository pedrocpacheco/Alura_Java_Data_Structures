package autoBoxingUnboxing.primitivesInLists;

import java.util.ArrayList;
import java.util.List;

public class NumberExample {
    public static void main(String[] args) {

        // AutoBoxing x Unboxing
        Integer ageObject = 29; // Autoboxing Creating Integer Object 
        int agePrimitive = 18; // Creating a primitive variable of Int type

        // Adding Object x Adding Primitive in a List
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(ageObject); // Passing a Object to the List
        integerList.add(agePrimitive); // Creating a Object with the value of the int

        // Creating int varibales of lists Itens
        int variable1 = integerList.get(0);  // Turning a Object to a Primitive
        Integer variable2 = integerList.get(1);  // Primitive to Primitive

        // Priting the variables value
        System.out.println(variable1);  //29
        System.out.println(variable2); //21

        // Creating a Integer Object and Getting it's value
        Integer objectCreated = Integer.valueOf(33); // delegando a criação para método valueOf
        int gettedPrimitive = objectCreated.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper

        System.out.println(gettedPrimitive); //33

    }
}
