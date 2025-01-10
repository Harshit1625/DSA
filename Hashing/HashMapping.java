package Hashing;

import java.util.*;

// HashMap is a data structure which basically stores values in the form of key-value pairs; (Key could be unique , but value isn't necessary)
//Same as HashSets , Hashmaps are undordered too

public class HashMapping {
    public static void main(String[] args) {
        // (keyType,valueType)
        HashMap<String, Integer> hm = new HashMap<>();

        // Add Operation
        hm.put("India", 12345);
        hm.put("Bangladesh", 34578);

        // Updation :- (We can use the put function again to update the corresponding
        // key)
        hm.put("India", 5678);

        // Search
        System.out.println(hm.containsKey("China")); // return a boolean ; result :- true

        // for Getting the value
        System.out.println(hm.get("India"));

        System.out.println(hm);
        System.out.println(hm.entrySet()); // returns hashMap as a set

        // ------------------------------------------------------------------------------------------------
        // Two types of for loops

        // int arr[] = {12 , 13 , 15};

        // //1st way:-
        // for(int i = 0 ; i < arr.length ; i++){
        // System.out.println(arr[i]);
        // }
        // System.out.println();

        // //2nd way(Especially for collections)
        // for(int val : arr){
        // System.out.println(val + " ");
        // }
        // System.out.println();

        // Delete
        // hm.remove("China");

        // ------------------------------------------------------------------------------------------------
        // Iteration in HashMaps

        // 1st way(recommended)
        // Map is a interface in Java ; used to represent the key-value pairs of a
        // particular Hashmap

        // entrySet means a set of key-value pairs
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 2nd way
        Set<String> keys = hm.keySet(); // returns the set of keys from a particular hashMap
        for (String key : keys) {
            System.out.println(key + " " + hm.get(key));
        }

    }
}
