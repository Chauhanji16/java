// linkedlist store the elements in sequence 
// becacuse each element of linkedlist is known as nodes
  import java.util.LinkedList;
  public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add elements
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");

        // Print list
        System.out.println(names);

        // Add at first
        names.addFirst("Ravi");

        // Add at last
        names.addLast("Neha");

        // Remove first
        names.removeFirst();

        // Remove last
        names.removeLast();

        // Print updated list
        System.out.println(names);
    }
}


