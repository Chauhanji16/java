  import java.util.Queue;
import java.util.LinkedList;
public class QueueA {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Rahul");
        queue.add("Amit");
        queue.add("Priya");
        System.out.println(queue);

        // View first element
        System.out.println(queue.peek());

        // Remove first element
        queue.poll();

        // Print updated queue
        System.out.println(queue);
    }
}


