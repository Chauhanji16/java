//   in treeset the value is return in sorted form 
// because it treeset is used binary search tree to soting the element 
  import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);   // Duplicate
        System.out.println(numbers);
        // Get first element
        System.out.println("First: " + numbers.first());
        // Get last element
        System.out.println("Last: " + numbers.last());
        // Remove element
        numbers.remove(20);
        // Print updated set
        System.out.println(numbers);
    }
}


