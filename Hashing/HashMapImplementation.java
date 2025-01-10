package Hashing;

import java.util.*;

//================================================================
//in Java , we can make HashMap using ArrayOfLinkedList
//Hashing means converting a form of a particular data into another form 
//================================================================

public class HashMapImplementation {
    // we use generics for type safety ; like if someone created an instance with
    // key as integer and value as String then every value will be added in that way
    static class HashMap<K, V> {

        // Node for LL , every node contains a key-value pair
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of nodes
        private int N; // no of buckets
        private LinkedList<Node> buckets[]; // declaring an arrayOfLinkedList

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // 4 is the size of the array

            // adding empty LL initially ; LL should be there else we cant put data in it
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // ================================================================
        // hashFunction to get the bucket index ; at which bucket the pair should be
        // inserted
        private int hashFunction(K key) {
            int bucketIndex = key.hashCode(); // inbuilt function in java that returns a positive or negative value
            // but we need positive value only , and it should be below the length of
            // bucket (like here it should be less than N);
            // Math.abs returns a positive of a number and (% N) will ensure that the value should be below N
            return Math.abs(bucketIndex) % N;
        }

        // search function linked list to get the index at which the key is present
        public int searchInLL(K key, int bucketIndex) {
         
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int linkedlistIndex = searchInLL(key, bucketIndex); // checking if the key is already present or not

            // -1 means the key is not present
            if (linkedlistIndex == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++; // if a new node is inserted , n's value should be increased
            } else {
                Node data = buckets[bucketIndex].get(linkedlistIndex);
                data.value = value;
            }

            // Rehashing :- means as the nodes increase , we have to increase the array size
            // too; to maintain the complexity
            double lambda = (double) n / N; // lambda refers to the size of linkedlist (i.e ; lambda = n/N)
            if (lambda > 2.0) {

            }

        }

        public boolean containsKey(K key) {
            return false;
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }

        public boolean isEmpty() {
            return false;
        }
    }
}
