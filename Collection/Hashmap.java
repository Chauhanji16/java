//    It store data in key value form(a value have a specific key)
// duplication is not allowsd
// data arrange randomaly
   import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");

        // Print HashMap
        System.out.println(students);

        // Get value using key
        System.out.println(students.get(101));

        // Update value
        students.put(102, "Ravi");

        // Remove element
        students.remove(103);

        // Print updated HashMap
        System.out.println(students);
    }
}


