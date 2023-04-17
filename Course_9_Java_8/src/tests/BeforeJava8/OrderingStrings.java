package tests.BeforeJava8;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import classes.BeforeJava8.LengthComparator;


public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura Online"}; 
        List<String> words = Arrays.asList(a);

        LengthComparator lengthComparator = new LengthComparator();

        // 1
        Collections.sort(words, lengthComparator); // Before Java 8
        System.out.println(words);
        
        // 2
        words.sort(lengthComparator); // After Java 8
        System.out.println(words);

        // 3
        words.sort((s1, s2) -> s1.length() - s2.length()); // After Java 8 -> Lambds
        System.out.println(words);

        // 4
        words.sort(Comparator.comparing(s -> s.length())); // Lambds inside Comparator Method
        System.out.println(words);

        // 5
        words.sort(Comparator.comparing(String::length));
        System.out.println(words);

        for (String word : words) { // Before Java 8
            System.out.println("Currente word is: " + word);
        }

        // Lambda:
        words.forEach(System.out::println); // After Java 8
    }
}
