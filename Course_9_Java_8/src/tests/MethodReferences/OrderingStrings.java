package tests.MethodReferences;

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

        words.sort(Comparator.comparing(String::length));

        words.forEach(System.out::println); 
    }
}
