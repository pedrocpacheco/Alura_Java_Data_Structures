package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura"}; 
        List<String> words = Arrays.asList(a);

        Collections.sort(words);
        System.out.println(words);

    }
}
