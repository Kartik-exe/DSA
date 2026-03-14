package Javaproblems;

import java.util.Set;

/// TreeSet is an implementation of the Set interface that stores elements in a sorted order using a red-black tree.
/// The elements are sorted based on their natural ordering or a custom comparator.

public class TreeSet {

    public static void main(String[] args){
        Set<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Cat");
        treeSet.add("Dog");
        treeSet.add("Meow");
        treeSet.add("Bhow");

        System.out.println(treeSet);
    }
}
