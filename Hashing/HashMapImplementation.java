package Hashing;

import java.util.LinkedList;
import java.util.ArrayList;

//================================================================
//in Java , we can make HashMap using ArrayOfLinkedList
//Hashing means converting a form of a particular data into another form 
//================================================================
//in worst case the complexity will be O(n) , in avg case it will be O(1);
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
            // Math.abs returns a positive of a number and (% N) will ensure that the value
            // should be below N
            return Math.abs(bucketIndex) % N;
        }

        // search function linked list to get the index at which the key is present
        public int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;

        }

        // rehashing function
        @SuppressWarnings("unchecked")
        private void rehashingFn() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2]; // we have created a new bucket , so we have to add LL initially

            // adding LL initially
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // fetching the elements from the old bucket and inserting it in the new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
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
            double lambda = (double) n / N; // lambda basically refers to the size of linkedlist (i.e ; lambda = n/N)
            // as the number no of nodes increase , lambda will increase ; and if it
            // increseas it will affect the complexity ; so to fix that we set a constant ,
            // value like here it is 2.0 ; and if lambda become greater than that we will
            // rehash;
            if (lambda > 2.0) {
                rehashingFn();
            }

        }

        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int linkedlistIndex = searchInLL(key, bucketIndex); // checking if the key is already present or not

            // -1 means the key is not present
            if (linkedlistIndex == -1) {
                return false;
            } else {
                return true;
            }
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int linkedlistIndex = searchInLL(key, bucketIndex); // checking if the key is already present or not

            // -1 means the key is not present
            if (linkedlistIndex == -1) {
                return null;
            } else {
                Node data = buckets[bucketIndex].remove(linkedlistIndex);
                n--;
                return data.value;
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int linkedlistIndex = searchInLL(key, bucketIndex); // checking if the key is already present or not

            // -1 means the key is not present
            if (linkedlistIndex == -1) {
                return null;
            } else {
                Node data = buckets[bucketIndex].get(linkedlistIndex);
                return data.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("Pakistan", 130);
        hm.put("China", 140);
        System.out.println(hm.get("India"));
        System.out.println(hm.keySet());

        ArrayList<String> keys = hm.keySet();

        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + hm.get(keys.get(i)));
        }

    }
}
