package tests.BeforeJava8;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import classes.BeforeJava8.LengthComparator;


public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura Online"}; 
        List<String> words = Arrays.asList(a);

        LengthComparator lengthComparator = new LengthComparator();

        Collections.sort(words, lengthComparator); // Before Java 8
        System.out.println(words);

        words.sort(lengthComparator); // After Java 8
        System.out.println(words);

        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); // After Java 8 -> Lambds
        System.out.println(words);

        for (String word : words) { // Before Java 8
            System.out.println("Currente word is: " + word);
        }

        // Lambda:
        words.forEach(word -> System.out.println("Current word is: " + word)); // After Java 8
    }
}
