package tests;

import classes.Course;
import classes.Lesson;

public class TestCourse {
    public static void main(String[] args) {
        
        Course javaCollections = new Course("Mastering the Collections", "Rafael Ronqui");
        System.out.println(javaCollections.getLessons());

        javaCollections.add(new Lesson("Relashionship of Collections", 23));
        javaCollections.add(new Lesson("Colletions on the Creation", 18));
        javaCollections.add(new Lesson("Problem Solving with Colletions", 32));


        System.out.println(javaCollections.getLessons());



    }
}
