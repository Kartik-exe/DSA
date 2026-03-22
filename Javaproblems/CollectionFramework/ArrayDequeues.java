package Javaproblems.CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeues {

    public static void main(String[] args) {
        //FIFO: First In first out!!!
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        System.out.println(ad); // [1, 2, 3, 4]
        ad.poll(); // removes the first element pushed into queue! i.e [1]
        System.out.println(ad);  //[2, 3, 4]
        System.out.println(ad.peek()); // prints the first element pushed into the queue!
        // 2

        ad.offerLast(10);
        System.out.println(ad); // [2, 3, 4, 10]
        ad.addFirst(100);
        System.out.println(ad); // [100, 2, 3, 4, 10]
    }
}
