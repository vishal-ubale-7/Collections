package Queue;


import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue
{
     public static void main(String []args)
     {
         Queue<Integer> pq = new java.util.PriorityQueue<>(Comparator.reverseOrder());// set priority using comparator


         pq.offer(10);
         pq.offer(20);
         pq.offer(30);
         pq.offer(40);
         pq.offer(50);
         System.out.println(pq);

         pq.poll();
         System.out.println(pq); // remove the priority element 10

         pq.peek();
         System.out.println(pq); // tell the who next element


     }
}
