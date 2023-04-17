package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import classes.LengthComparator;

public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura Online"}; 
        List<String> words = Arrays.asList(a);

        LengthComparator lengthComparator = new LengthComparator();

        words.sort(lengthComparator);
        System.out.println(words);

    }
}
