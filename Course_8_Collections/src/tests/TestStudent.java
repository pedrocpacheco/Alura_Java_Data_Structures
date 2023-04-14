package tests;

import java.util.Collection;
import java.util.HashSet;

public class TestStudent {
    public static void main(String[] args) {

        // Creating HashSet
        Collection<String> students = new HashSet<String>();
        
        students.add("Pedro");
        students.add("Henrique");
        students.add("Luane");

        // Random Order of the Itens
        System.out.println(students);

        students.add("Pedro"); // Don't add a same value
        students.add("Daniel"); // Just Different
        
        // Different Order From Before
        System.out.println(students);

        // For Each Estructure
        for (String student : students) {
            System.out.println("Student Name's: " + student);
        }

        // For Each Method
        students.forEach(student -> {
            System.out.println("Student Name's " + student);
        });

        // Contains
        boolean isPedroInStudents = students.contains("Pedro");
        System.out.println(isPedroInStudents); // True 

    }
}
