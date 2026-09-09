 import java.util.ArrayList;
import java.util.List;
public class ListA {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");

        // Print list
        System.out.println(names);

        // Get an element
        System.out.println(names.get(0));

        // Remove an element
        names.remove("Amit");

        // Print updated list
        System.out.println(names);
    }
}
// this is the method of the list
// names.add("Raj");        // Add
// names.get(0);            // Get element
// names.set(0, "Ravi");    // Update
// names.remove(0);         // Remove
// names.size();            // Number of elements
// names.contains("Ravi");  // Check element
// names.clear();           // Remove all elements


 