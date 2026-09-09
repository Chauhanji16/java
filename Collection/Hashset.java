// Its provide a hashcode to elemet that make the elemen unique identity
// duplication not allow in this 
// data store randomly 
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        // Add elements
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Rahul");   // Duplicate
        System.out.println(names);

        // Check element
        System.out.println(names.contains("Amit"));

        // Remove element
        names.remove("Priya");

        // Print updated set
        System.out.println(names);
    }
}


