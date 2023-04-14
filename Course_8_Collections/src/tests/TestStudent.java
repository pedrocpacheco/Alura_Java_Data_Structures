package tests;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Set<String> students = new HashSet<String>();
        students.add("Pedro");
        students.add("Henrique");
        students.add("Luane");

        System.out.println(students);
    }
}
