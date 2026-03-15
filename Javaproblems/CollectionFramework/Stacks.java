package Javaproblems.CollectionFramework;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args){

        // LIFO -- Last in first out
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s); // [1, 2, 3, 4, 5]
        System.out.println(s.peek());  // prints the last element pushed into the stack!
        s.pop(); // pop's or removes the last element pushed
        System.out.println(s); //[1, 2, 3, 4]
        System.out.println(s.peek()); //Output: 4, because 5 was removed and in array list it shows 4
//        [1, 2, 3, 4]
//         4
    }

}
