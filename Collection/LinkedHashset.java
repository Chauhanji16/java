//   same as hash set but it store the data sequencly
// duplication is not allow
import java.util.LinkedHashSet;
public class LinkedHashset {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Rahul");   // Duplicate
        System.out.println(names);

        // Check element
        System.out.println(names.contains("Amit"));

        // Remove element
        names.remove("Amit");

        // Print updated set
        System.out.println(names);
    }
}


