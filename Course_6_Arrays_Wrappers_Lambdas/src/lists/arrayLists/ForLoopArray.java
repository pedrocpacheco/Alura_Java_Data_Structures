package arrayLists;

import java.util.ArrayList;

public class ForLoopArray {
    public static void main(String[] args) {
        
        // Creating a ArrayList of Integers
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        // Creating 2 ints
        int grade1 = 10;
        int grade2 = 9;

        // Adding the Ints to the numberList
        numberList.add(grade1);
        numberList.add(grade2);

        // Looping the list using a For Loop        
        for(int i = 0; i < numberList.size(); i++){
            System.out.println("Using For Loop | The Current grade is: " + numberList.get(i));
        }

        System.out.println("---------------------------------");

        // Looping the list using For Each
        for(Integer grade : numberList){
            System.out.println("Using For Each | The Current grade is: " + grade);
        }

    }
}
