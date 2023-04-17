package tests.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import classes.Course;

public class TestCourse {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>(); // Create list
        courses.add(new Course("Java 8", 40)); // Add 1 item
        courses.add(new Course("Java BDD", 15)); // Add 2 item
        courses.add(new Course("Spring MVC", 25)); // Add 3 item

        courses.sort(Comparator.comparing(Course::getStudents)); // Sorting by Method Reference
        courses.forEach(System.out::println); // ForEach -> Print | Using MR

    }
}
