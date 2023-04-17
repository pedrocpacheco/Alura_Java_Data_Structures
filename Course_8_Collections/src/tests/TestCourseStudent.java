package tests;

//import java.util.Set;

//import java.util.Iterator;

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
        javaCollections.enroll(new Student("Daniel Soares", 904245));

        // Printing with the array forEach all the Enrolled Students
        System.out.println("Enrolled Students: ");
        javaCollections.getStudents().forEach(student -> System.out.println(student));

        // Using Iterator
        // Set<Student> students = javaCollections.getStudents();
        // Iterator<Student> iterator = students.iterator();
        // while(iterator.hasNext()){
        //     Student next = iterator.next();
        //     System.out.println(next);
        // }
        
        System.out.println("Is Enrolled?");
        System.out.println(javaCollections.isEnrolled(new Student("Cesar", 22)));

        // Creating a new Student and seeing if it's Enrolled
        Student anotherPedroPacheco = new Student("Pedro Pacheco", 98043);
       
        // Comparing to different objects but with same values, by changing .equals
        System.out.println("Is Pedro Pacheco there? "); // Even being diferent
        System.out.println(javaCollections.isEnrolled(anotherPedroPacheco)); // We changed the .equals and used .hashCode
        

    }
}
