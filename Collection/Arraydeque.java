    // arraydeque is use because we can add and remove element from both side
    import java.util.ArrayDeque;
public class Arraydeque {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.add("Rahul");
        deque.add("Amit");
        deque.add("Priya");

        // Add at first
        deque.addFirst("Ravi");

        // Add at last
        deque.addLast("Neha");

        // Print deque
        System.out.println(deque);

        // Remove first
        deque.removeFirst();

        // Remove last
        deque.removeLast();

        // Print updated deque
        System.out.println(deque);
    }
}


