package classes;

public class Student {
    private String name;
    private int rm;

    public Student(String name, int rm){
        if(name == null || rm == 0){
            throw new NullPointerException("Informations Cannot be Null");
        }
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

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if(this.name == student.name){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }


}
