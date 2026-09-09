    // arraylist use dynamic memory to store the elemet
    // it work on asynchronized 
    // / Asynchronized meas multiple thread thread can access the same block at a time
    import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        // Add elements
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        System.out.println(names);

        // Get element
        System.out.println(names.get(0));

        // Update element
        names.set(1, "Ravi");

        // Remove element
        names.remove(2);

        // Print updated list
        System.out.println(names);
    }
}


