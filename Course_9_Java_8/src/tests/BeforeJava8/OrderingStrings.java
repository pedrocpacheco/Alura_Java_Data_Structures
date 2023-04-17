package tests.BeforeJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import classes.BeforeJava8.LengthComparator;


public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura Online"}; 
        List<String> words = Arrays.asList(a);

        // Creating a Comparator
        LengthComparator lengthComparator = new LengthComparator();
        
        // Using the Collections static method
        Collections.sort(words, lengthComparator);

        System.out.println(words);

    }
}
