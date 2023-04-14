package ListOfObjects;

public class AluraClass {
    
    private String owner;
    private int time;

    public AluraClass(String owner, int time){
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
