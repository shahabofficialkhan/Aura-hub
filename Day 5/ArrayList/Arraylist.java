import java.util.ArrayList;

public class Arraylist {
public static String sum (ArrayList<String> task){
        for (String n : task){
            System.out.println(n);
        }
        return "Done";
    }
    public static void main(String[] args) {
        
        ArrayList <String> task= new ArrayList<String>();

        task.add("Study");
        task.add("Gym");
        for (String n : task){
            System.out.println(n);
        }
        sum(task);

    }

    
}
