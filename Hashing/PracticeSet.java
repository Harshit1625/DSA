package Hashing;

import java.util.HashSet;
import java.util.Iterator;

//================================================================
//Given an integer array of size n , find all elements that appear more than n/3 times
// public class PracticeSet {
//     public static void MajorityElement(int nums[]) {
//         // Step 1:- Creating HashMap
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         int n = nums.length;

//         // Step 2:- using loop to form key-value pairs using elements
//         for (int i = 0; i < n; i++) {
//             if (hm.containsKey(nums[i])) {
//                 hm.put(nums[i], hm.get(nums[i]) + 1);
//             } else {
//                 hm.put(nums[i], 1);
//             }
//         }

//         for (int key : hm.keySet()) {
//             if (hm.get(key) > n / 3) {
//                 System.out.print(key + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1, 2, 2, 2, 2, 1 };
//         MajorityElement(nums);

//     }
// }

//================================================================
//Union of 2 Arrays(Using HashSet)
// public class PracticeSet {
//     public static void main(String[] args) {
//         int arr1[] = { 7, 3, 9 };
//         int arr2[] = { 6, 3, 9, 2, 9, 4 };
//         HashSet<Integer> hs = new HashSet<>();

//         for (int i = 0; i < arr1.length; i++) {
//             hs.add(arr1[i]);
//         }

//         for (int j = 0; j < arr2.length; j++) {
//             hs.add(arr2[j]);
//         }

//         // Iterator should be used after adding of elements
//         Iterator it = hs.iterator();
//         // System.out.print(hs.size());
//         System.out.println(it.next());
//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }
//     }

// }

// ================================================================
// Intersection of 2 Arrays(Using HashSet)

// public class PracticeSet {
//     public static int intersection(int arr1[], int arr2[]) {
//         HashSet<Integer> hs = new HashSet<>();
//         for (int i = 0; i < arr1.length; i++) {
//             hs.add(arr1[i]);
//         }

//         int count = 0;

//         // Suppose arr1 = {7, 3, 9} and arr2 = {7, 7, 7}.
//         // If we don’t use hs.remove, the element 7 in arr1 would be matched with all
//         // three occurrences of 7 in arr2, leading to an incorrect count of 3 instead of
//         // 1.
//         for (int j = 0; j < arr2.length; j++) {
//             if (hs.contains(arr2[j])) {
//                 count++;
//                 hs.remove(arr2[j]);
//                 System.out.println("The element is" + arr2[j]);
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr1[] = { 7, 3, 9, 4, 6, 5 };
//         int arr2[] = { 1, 2, 67, 78, 78, 5 };
//         System.out.println(intersection(arr1, arr2));

//     }

// }
// ================================================================
//Q:- Find Itinerary from Tickets :-
// Chennai -> Bengaluru
// Mumbai -> Delhi
// Goa -> Chennai
// Delhi -> Goa

/**
 * Result: - Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru
 */

public class PracticeSet {
    public static void main(String[] args) {

    }
}
