package tests.Lambdas;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderingStrings {
    public static void main(String[] args) {
        String[] a = new String[] {"Code's House", "Caelum", "Alura Online"}; 
        List<String> words = Arrays.asList(a);

        // Lambdas by themselfes
        words.sort((s1, s2) -> s1.length() - s2.length()); 
        System.out.println(words);

        // Lambdas inside Comparator Method
        words.sort(Comparator.comparing(s -> s.length())); // Lambds inside Comparator Method
        System.out.println(words);

        // Using Lambda inside a forEach method
        words.forEach(word -> System.out.println("Current Word: " + word)); 
    }
}
