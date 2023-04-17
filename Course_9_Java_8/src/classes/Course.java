package classes;

public class Course {
    private String name;
    private int students;

    public Course(String name, int students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(Course: " + getName() + " | Students: " + getStudents() + ")";
    }

}