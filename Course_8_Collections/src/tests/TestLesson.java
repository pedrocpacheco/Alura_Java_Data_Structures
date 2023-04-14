package tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import classes.Lesson;

public class TestLesson {
    public static void main(String[] args) {

        // Creating Lesson ArrayList
        List<Lesson> lessonAList = new ArrayList<Lesson>();

        // Creating Lessons and adding them to the List in the same time
        lessonAList.add(new Lesson("C: Listas de Objetos",19));
        lessonAList.add(new Lesson("B: Revisitando Array Lists", 20));
        lessonAList.add(new Lesson("A: Relacionamento de Listas e Objetos", 29));
        
        // Sorting by names
        Collections.sort(lessonAList);
        System.out.println(lessonAList);

        // Sorting by time
        Collections.sort(lessonAList, Comparator.comparing((Lesson::getTime)));
        System.out.println(lessonAList);
        
        
   
    }
}
