package arrayLists;

import java.util.ArrayList;

public class ForLoopArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int grade1 = 10;
        int grade2 = 9;

        list.add(grade1);
        list.add(grade2);

        for(int i = 0; i < list.size(); i++){
            System.out.println("The Current grade is: " + list.get(i));
        }

    }
}
