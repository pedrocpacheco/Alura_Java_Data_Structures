package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
    private String name;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private Set<Student> students = new HashSet<Student>();

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
    }

    public int getTotalTime(){
        int totalTime = 0;
        for(Lesson lesson : lessons){
            totalTime += lesson.getTime();
        }
        return totalTime;
    }

    @Override
    public String toString() {
        return "[Course: " + getName() + " | Teacher: " + getTeacher() + " | Lessons: " + getLessons() + " | Course's Total Time: " + getTotalTime();
    }

}
