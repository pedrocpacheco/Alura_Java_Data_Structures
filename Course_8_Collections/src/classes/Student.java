package classes;

public class Student {
    private String name;
    private int rm;

    public Student(String name, int rm){
        this.name = name;
        this.rm = rm;
    }

    public String getName() {
        return name;
    }

    public int getRm() {
        return rm;
    }

    @Override
    public String toString() {
        return "(Name: " + getName() + " | RM: " + getRm() + ")";
    }

}
