package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<Lesson>();

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
    
    public void add(Lesson lesson){
        this.lessons.add(lesson);
    }

    public int getTotalTime(){
        int totalTime = 0;
        for(Lesson lesson : lessons){
            totalTime += lesson.getTime();
        }
        return totalTime;
    }

    

}
