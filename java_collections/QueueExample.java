import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("somehting ");

        System.out.println(queue.poll()); // Task1 (removed)
        System.out.println(queue);
    }
}
