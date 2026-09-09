//   same as hash maping but it store the data sequencly
// duplication is not allow
  import java.util.LinkedHashMap;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");
        System.out.println(students);

        // Get value
        System.out.println(students.get(101));

        // Update value
        students.put(102, "Ravi");

        // Remove element
        students.remove(103);

        // Print updated map
        System.out.println(students);
    }
}


