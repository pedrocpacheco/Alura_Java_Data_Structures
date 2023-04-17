package classes;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Course {
    private String name;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private Set<Student> students = new HashSet<Student>();
    private Map<Integer, Student> rmStudent = new LinkedHashMap<>();

    public Course(String name, String teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Lesson> getLessons() {
        return Collections.unmodifiableList(lessons);
    }
    
    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void add(Lesson lesson){
        this.lessons.add(lesson);
    }

    public void enroll(Student student){
        this.students.add(student);
        this.rmStudent.put(student.getRm(), student);
    }

    public boolean isEnrolled(Student student){
        return this.students.contains(student);
    }

    public int getTotalTime(){
        int totalTime = 0;
        for(Lesson lesson : lessons){
            totalTime += lesson.getTime();
        }
        return totalTime;
    }


    public Student getEnrolledStudent(int rm){
        if(!rmStudent.containsKey(rm))
            throw new NoSuchElementException("There Is no Student with This RM");
        return rmStudent.get(rm);
    }


    @Override
    public String toString() {
        return "[Course: " + getName() + " | Teacher: " + getTeacher() + " | Lessons: " + getLessons() + " | Course's Total Time: " + getTotalTime();
    }

}
