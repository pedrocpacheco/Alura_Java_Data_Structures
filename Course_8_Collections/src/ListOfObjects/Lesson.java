package ListOfObjects;

public class Lesson {
    
    private String owner;
    private int time;

    public Lesson(String owner, int time){
        this.owner = owner;
        this.time = time;
    }

    public String getOwner() {
        return owner;
    }
    
    public int getTime() {
        return time;
    }
}
