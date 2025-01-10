package Hashing;
import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> hs = new java.util.HashSet<>();

        // Add
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);

        // Size
        System.out.println(hs.size());

        // Search - "contains" function is used check whether a value is present in
        // HashSet or not;
        if (hs.contains(1)) {
            System.out.println("yes");
        }

        // Delete
        // hs.remove(1);
        // System.out.println(hs);

        // Iterator
        Iterator it = hs.iterator(); // .iterator fn returns an iterator

        // Iterator has mainly two function :- next() , hasNext()
        // next() (initially it will point to null)
        // System.out.println(it.next()); // returns 1
        // System.out.println(it.next()); // returns 2
        // System.out.println(it.next()); // returns 3

        // hasNext() returns a boolean ; if present returns true ; if not returns false;
        // (returns true for null too)
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // IMPORTANT :- You dont have to add it++ coz it iterates automatically;

        // IMPORTANT :- Suppose we called it.next() untill all the elementsa are counted
        // ; after that if we call hasNext() it will return false ; as the iterator is
        // at the end.

        // IMPORTANT :- HashSet is an unordered set ; there's no gurantee that when you
        // fetch all the elements from it that it will give you them in order ;
    }
}
