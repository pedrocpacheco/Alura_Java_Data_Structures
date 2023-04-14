package tests;

import classes.Course;
import classes.Lesson;

public class TestCourse {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Mastering the Collections", "Rafael Ronqui");
        System.out.println(javaCollections.getLessons());

        javaCollections.getLessons().add(new Lesson("Relashionship of Collections", 23));

        System.out.println(javaCollections.getLessons());



    }
}
