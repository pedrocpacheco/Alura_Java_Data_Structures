package ListOfObjects;

public class Lesson implements Comparable<Lesson>{

    private String name;
    private int time;

    public Lesson(String name, int time){
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "(Lesson: " + getName() + ", " + "Time: " + getTime() + ")";
    }

    @Override
    public int compareTo(Lesson lesson) {
        return this.name.compareTo(lesson.name);
    }

    

}
