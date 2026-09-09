// In result it give the value according to their priority
// the smallest element has  Higher priority
// duplication is not allow
import java.util.PriorityQueue;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(5);

        // Print first/highest priority element
        System.out.println(queue.peek());
        // Remove elements according to priority
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}


