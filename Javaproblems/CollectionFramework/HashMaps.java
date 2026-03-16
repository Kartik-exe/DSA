package Javaproblems.CollectionFramework;

import java.util.HashMap;

public class HashMaps {

         public static void main(String[] args){

             // (Key , Value)
             //Does not stores the keys in sorted order
             HashMap<Integer, String> hm = new HashMap<>();
             hm.put(1, "Steve");
             hm.put(2, "Grok");
             hm.put(3, "Kartik");

             System.out.println(hm); //{1=Steve, 2=Grok, 3=Kartik}
             System.out.println(hm.size()); // returns the size of HashMap i.e. 3
             System.out.println(hm.get(2)); // prints the KEY ki VALUE (Matlab key 2 hai toh Grok value print karega) Output: Grok

             hm.remove(1);
             System.out.println(hm); //{2=Grok, 3=Kartik}
             System.out.println(hm.get(4)); //null
         }
}
