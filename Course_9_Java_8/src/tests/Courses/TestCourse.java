package tests.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import classes.Course;

public class TestCourse {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>(); // Create list
        courses.add(new Course("Java 8", 110)); // Add 1 item
        courses.add(new Course("Java BDD", 115)); // Add 2 item
        courses.add(new Course("Spring MVC", 95)); // Add 3 item

        courses.sort(Comparator.comparing(Course::getStudents)); // Sorting by Method Reference
        courses.forEach(System.out::println); // ForEach -> Print | Using MR

        System.out.println("<Filtering the List>");

        // Learing Streams
        courses.stream().filter(course -> course.getStudents() >= 100); // Don't delete all the -100 students courses
        courses.forEach(System.out::println); // It print's all the courses

        // Printing the filter
        int sum = courses.stream().filter(course -> course.getStudents() >= 100)
                        .mapToInt(Course::getStudents)
                        .sum();

        System.out.println("The Sum of the +100 Students Course's is: " + sum);

    }
}
