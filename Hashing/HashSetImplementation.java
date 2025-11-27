package Hashing;
import java.util.*;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //add() : to add the element to the set
        set.add("Java");
        set.add("Python");
        set.add("Cpp");
        set.add("Java"); //will not add into the set : duplicate value

        //remove() : remove the element from the set
        set.remove("Python");


        //contains() : check if the elemenet is present or not
        System.out.println(set.contains("Java"));


         //size() : returns the size of the set
        System.out.println(set.size());

         //isEmpty() : check if the set if empty or not
        System.out.println(set.isEmpty());

 

         //print the set
        for(String s : set){
            System.out.println(s);
        }

        //print the entire set
        System.out.println(set);

        
    }
}
