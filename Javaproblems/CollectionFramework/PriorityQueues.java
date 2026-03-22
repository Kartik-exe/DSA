package Javaproblems.CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {

        //Stores elements and whenever we as for peek(), it gives us the smallest element!
        // That's why we call it Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(10);
        pq.offer(4);
        System.out.println(pq); // [1, 2, 3, 4]
        System.out.println(pq.peek()); // 1 (i.e. returns the head of the queue)
        pq.poll(); //  removes the head of this queue
        System.out.println(pq); // [2, 4, 3, 10]

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(0);
        p.offer(1);
        p.offer(5);
        p.offer(4);
        while (!p.isEmpty()) {
            System.out.println(p.peek());
            p.poll();
        }
//        output:
//        0
//        1
//        4
//        5
    }

}
