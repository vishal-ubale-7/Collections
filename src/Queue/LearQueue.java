package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearQueue {
    public static void main(String[] args) {
        // FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);  //offer methods use add elements
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

        queue.poll();  // remove the element
        System.out.println(queue);

        queue.peek();  // Tell next element
        System.out.println(queue);

    }
}