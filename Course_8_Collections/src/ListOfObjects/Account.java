package ListOfObjects;

public class Account {
    
    private String owner;
    private int time;

    public Account(String owner, int time){
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
