//   Vector is same as arraylist 
//but vector's method are synchronized 
// synchronized meas only one thread can access the block at a time
// for the sefty and privicy perpose
  import java.util.Vector;
public class VectorA {
public class Main {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        System.out.println(names);
        // Get element
        System.out.println("First: " + names.get(0));
        // Update element
        names.set(1, "Ravi");
        // Remove element
        names.remove(2);
        // Print updated Vector
        System.out.println(names);
    }
}
  
}
