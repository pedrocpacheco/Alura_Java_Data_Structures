package tests.Courses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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

        // Summing
        OptionalDouble opitionaoAverage = courses.stream()
                        .filter(course -> course.getStudents() >= 100)
                        .mapToInt(Course::getStudents)
                        .average();
                        
        System.out.println("The Sum of the +100 Students Course's is: " + opitionaoAverage);

        // Using Opitional Class
        Optional<Course> opitionalCourse = courses.stream().filter(course -> course.getStudents() >= 100).findAny();

        // Saving a Course in variable and printing it
        Course course100 = opitionalCourse.orElse(null);
        System.out.println(course100);

        // Using ifPresent method
        opitionalCourse.ifPresent(course -> System.out.println(course));


        List<Course> listResult = courses.stream().filter(course -> course.getStudents() >= 100).collect(Collectors.toList());
        listResult.forEach(course -> System.out.println("Current Course: " + course));
        
        Map<String, Integer> mapResult = courses.stream().filter(course -> course.getStudents() >= 100).collect(Collectors.toMap(course -> course.getName(), course -> course.getStudents()));
        mapResult.forEach((name, students) -> System.out.println(name + " has " + students + " students"));
    
    }
}
