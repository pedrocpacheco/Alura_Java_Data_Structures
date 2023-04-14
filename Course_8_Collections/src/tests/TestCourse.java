package tests;

import java.util.List;

import classes.Course;
import classes.Lesson;

public class TestCourse {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Mastering the Collections", "Rafael Ronqui");
        List<Lesson> javaLessons = javaCollections.getLessons();   
        
        System.out.println(javaLessons);

        javaLessons.add(new Lesson("Relashionship of Collections", 23));
        
        // Printing by reference
        System.out.println(javaLessons);

        // Printing by object method
        System.out.println(javaCollections.getLessons());

    }
}
