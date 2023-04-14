package tests;

import classes.Course;
import classes.Lesson;
import classes.Student;

public class TestCourseStudent {
    public static void main(String[] args) {

        Course javaCollections = new Course("Mastering the Collections", "Rafael Ronqui");
        System.out.println(javaCollections.getLessons());

        // Adding Lessons in the Lessons List by .add method
        javaCollections.add(new Lesson("Relashionship of Collections", 23));
        javaCollections.add(new Lesson("Colletions on the Creation", 18));
        javaCollections.add(new Lesson("Problem Solving with Colletions", 32));

        // Adding Students in the Students Set by .enroll method
        javaCollections.enroll(new Student("Pedro Pacheco", 98043));
        javaCollections.enroll(new Student("Henrique Baptista", 97706));
        javaCollections.enroll(new Student("Luane Santos", 904245));

        javaCollections.getStudents().forEach(student -> System.out.println(student));

        // Creating a new Student and seeing if it's Enrolled
        Student thiago = new Student("Thiago Fritz", 90216);
        System.out.println(javaCollections.isEnrolled(thiago));

    }
}
