package Hashing;

import java.util.HashSet;
import java.util.HashMap;
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
//Q:- Find Itinerary from Tickets :- (FAANG)
// Chennai -> Bengaluru
// Mumbai -> Delhi
// Goa -> Chennai
// Delhi -> Goa

/**
 * Result: - Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru
 */

// public class PracticeSet {
// // 1st Step : to find the start point
// public static String getStart(HashMap<String, String> map) {
// HashMap<String, String> revMap = new HashMap<>();
// for (String key : map.keySet()) {
// revMap.put(map.get(key), key);
// }

// for (String key : map.keySet()) {
// if (!revMap.containsKey(key)) {
// return key;
// }
// }
// return null;

// }

// public static void main(String[] args) {
// HashMap<String, String> map = new HashMap<>();
// map.put("Chennai", "Bengaluru");
// map.put("Mumbai", "Delhi");
// map.put("Goa", "Chennai");
// map.put("Delhi", "Goa");
// String start = getStart(map);

// while (map.containsKey(start)) {
// System.out.print(start + " -> ");
// start = map.get(start);
// }
// System.out.print(start);

// }
// }
// ================================================================
// Q:- Subarray sum equal to K :- (FAANG)
/*
 * arr ={10,2,-2,-20,10} ,
 * prefix sum array =
 * {10 ,10+2 ,10+2+(-2) ,10+2+(-2)+(-20) ,10+2+(-2)+(-20)+10 }
 * k is some constant value
 * basically we have to find, sum(k) - k which will be eqaul to sum(i-1)
 * and the number of times sum(k) - k is present will be the ans
 */

// If the difference between two prefix sums equals K, then the elements between
// those two indices form a subarray with sum K.

// We add the frequency of a prefix sum in the HashMap to account for all the
// possible subarrays that might end at a particular index and have the desired
// sum K

public class PracticeSet {
    public static void main(String[] args) {
        // Input array
        int arr[] = { 10, 2, -2, -20, 10 };

        // Create a HashMap to store <Prefix Sum, Frequency> pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize the map with sum 0 having frequency 1
        // This accounts for cases where the subarray starts from the beginning
        map.put(0, 1); // Represents an "empty subarray"

        int sum = 0; // Variable to store the current prefix sum
        int ans = 0; // Variable to count subarrays with the desired sum
        int K = -10; // The target subarray sum

        // Iterate over the array to calculate prefix sums
        for (int j = 0; j < arr.length; j++) {
            // Update the prefix sum with the current element
            sum = sum + arr[j];

            // Check if (sum - K) exists in the map
            // If it exists, it means there is a subarray with sum K
            if (map.containsKey(sum - K)) {
                // Add the frequency of (sum - K) to the result
                ans += map.get(sum - K);
            }

            // Update the frequency of the current prefix sum in the map
            // basically storing sum in the prefix order means sum(i-1) indirectly
            if (map.containsKey(sum)) {
                // If the sum already exists, increment its frequency
                map.put(sum, map.get(sum) + 1);
            } else {
                // If the sum doesn't exist, add it with frequency 1
                map.put(sum, 1);
            }
        }

        // Print the total count of subarrays with sum K
        System.out.println(ans);
    }
}
