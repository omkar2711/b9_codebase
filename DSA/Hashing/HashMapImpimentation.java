package DSA.Hashing;

import java.util.HashMap;

public class HashMapImpimentation 
{
    public static void main(String[] args)
    {
        HashMap<String , Integer> map=new HashMap<>();
        //Add element (pair) to the hashmap we have to use .put method like map.put()
        map.put("apple",120);
        map.put("mango",180);
        map.put("orange",100);


        //acces element in the hash map  use .get  method like map.get
        System.out.println(map.get("apple"));
        System.out.println(map.get("orange"));


        //print the all hashmap
        for(HashMap.Entry<String , Integer> e: map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(String key: map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }
    
}
