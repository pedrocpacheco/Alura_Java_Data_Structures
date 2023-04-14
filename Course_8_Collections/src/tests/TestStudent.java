package tests;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {

        // Creating HashSet
        Set<String> students = new HashSet<String>();
        
        students.add("Pedro");
        students.add("Henrique");
        students.add("Luane");

        // Random Order of the Itens
        System.out.println(students);

        students.add("Pedro"); // Don't add a same value
        students.add("Daniel"); // Just Different
        
        // Different Order From Before
        System.out.println(students);

        for (String student : students) {
            System.out.println("Student Name's: " + student);
        }

    }
}
