//  Map work on (key, value)
// all values has specific hashcode 
 import java.util.HashMap;
import java.util.Map;

public class MapA {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // Add data
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");

        // Print map
        System.out.println(students);

        // Get value using key
        System.out.println(students.get(101));

        // Remove data
        students.remove(102);

        // Check key
        System.out.println(students.containsKey(103));

        // Size
        System.out.println(students.size());
    }
}

 