package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque
{
    public static void main(String [] args )
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(4);
        dq.offer(5);
        dq.offerFirst(100); // set first position element
        dq.offerLast(6);    // set last position element
        System.out.println(dq); // print all program



    }
}
