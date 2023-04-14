package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthDesktopPaneUI;

import classes.Course;
import classes.Lesson;

public class TestCourse {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Mastering the Collections", "Rafael Ronqui");
        System.out.println(javaCollections.getLessons());

        javaCollections.add(new Lesson("Relashionship of Collections", 23));
        javaCollections.add(new Lesson("Colletions on the Creation", 18));
        javaCollections.add(new Lesson("Problem Solving with Colletions", 32));

        // Printing the Lessons
        List<Lesson> inmutableLessons = javaCollections.getLessons();
        System.out.println(inmutableLessons);

        // Sorting the Lessons List
        List<Lesson> mutableLessons = new ArrayList<Lesson>(inmutableLessons); 
        Collections.sort(mutableLessons); // By passing inmutalable to a List constructor it's turn to mutable
        System.out.println(mutableLessons);
        
        // Printing Course's information with toString()
        System.out.println(javaCollections.toString());


    }
}
