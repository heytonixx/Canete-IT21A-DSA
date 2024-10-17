import java.util.LinkedList;
import java.util.Queue;

public class QueueIT20A {
     public static void main(String[] args) {
        // Creating a queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Apple");
        queue.add("Blueberry");
        queue.add("Banana");
        queue.add("cherry");
        queue.add("Strawberry");
         
        while(!queue.isEmpty()){
        System.out.println("Fruits: " + queue.poll() + " ");
}
     }
}