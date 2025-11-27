package Hashing;
import java.util.*;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();


        //Add the elements (Pair) to the hashMap - map.put();
        map.put("Apple", 120 );
        map.put("Banana" , 60);
        map.put("Mango" , 140);
        map.put("mango" , 120);
        map.put("kiwi", 125);

    

        //Access the element in the hashMap - map.get();
        System.out.println(map.get("Apple"));
        System.out.println(map.get("Banana"));

        // print the hashMap - 1

        System.out.println("Entry Set : ");
        for(HashMap.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println();


        System.out.println("Keyset : ");
        //print the hashMap
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        // print only values
        for(Integer value : map.values()){
            System.out.println(value);
        }

        //Print using for each
        map.forEach((key,value) ->System.out.println(key + " " + value));


        // //Print all the elements in the map
        System.out.println(map);

        // //update the values in the 
        // ////overwrite the value for the key present in the map
        map.put("Apple" , 130); 

        // //replace() : replace the value present of the entered key in the map
        map.replace("Apple", 135); 

        // //replace( , , ) : replace only if old value matches
        map.replace("Apple" , 135 , 140); 


        // //ContainsKey() : Check if the key if present or not in the map
        System.out.println(map.containsKey("Apple"));

        // //ContainsValue() : Check of the value is present or not in the map
        System.out.println(map.containsValue(120));

        // //remove() : to remove the pair present in the map
        System.out.println(map.remove("Apple"));


    }
}
