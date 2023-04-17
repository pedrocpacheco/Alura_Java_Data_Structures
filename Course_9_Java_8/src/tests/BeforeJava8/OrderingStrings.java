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

        // Sorting Itens from a Lista: Before x After:

        // Using the Collections static method -> Before
        Collections.sort(words, lengthComparator);

        // Use as parameter of list.sort() -> After
        words.sort(lengthComparator);

        // For Each: Before x After

        // ForEach Structure -> Before
        for (String word : words) {
            System.out.println("Currente word is: " + word);
        }

        // ForEach List Method -> After
        words.forEach(word -> System.out.println(word));
    
        System.out.println(words);

    }
}
