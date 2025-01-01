// ---------------------------------------
//Queue :- follows FIFO rule , which means first-in-first-out ; in which elements are pushed from the back and extracted from the front.
//Operations :- Add(Enque) , Dequeue(Remove) , Front(Peek)
//-----------------------------------------------------------------------------------------------
//Implementation using Array

// public class QueueClass {
//     static class Queue {
//       int arr[];
//       int size;
//       int rear = -1;

//       Queue(int size){
//         arr = new int[size];
//         this.size = size;
//       }

//       //isEmpty fn
//       public boolean isEmpty(){
//         return rear == -1;
//       }

//       //enqueue
//       public void add(int data){
//         if(rear == size - 1){
//             System.out.println("Queue is full !!");
//             return;
//         }
//         rear++;
//         arr[rear] = data;
//       }

//       //dequeue
//       public int remove(){
//         if(rear == -1){
//             System.out.println("Queue is already empty!!");
//             return -1;
//         }
//      //as it follows FIFO so we have to traverse the array first and in the remove the element on which rear is pointing
//       int front = arr[0];
//       for(int i=0 ; i< rear ; i++){
//         arr[i] = arr[i+1];
//       }
//       rear--;
//       return front;
//       }

//       //front
//       public int peek(){
//         if(rear == -1){
//             System.out.println("Queue is already empty!!");
//             return -1;
//         }
//         return arr[0];
//       }

//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(4);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()){
//          System.out.println(q.peek() + " ");
//          q.remove();
//         }

//     }
// }
//-----------------------------------------------------------------------------------------------
//Circular Queue Implementation using Array (using array coz complexity is O(1) in all the operations)

// public class QueueClass {
//     static class Queue {
//         int arr[];
//         int size;
//         int rear = -1;
//         int front = -1;

//         Queue(int size) {
//             arr = new int[size];
//             this.size = size;
//         }

//         // isEmpty fn
//         public boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         // isFull fn
//         public boolean isFull() {
//             return (rear + 1) % size == front; // in circular queues we have to use : (rear+1)%size to take it the 0th index initially 
//         }

//         // enqueue
//         public void add(int data) {

//             if (isFull()) {
//                 System.out.println("Queue is full !!");
//                 return;
//             }
//             //first element add
//             if(front == -1){
//                 front = 0;
//             }
//             rear = (rear + 1)%size;
//             arr[rear] = data;
//         }

//         // dequeue
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty!!");
//                 return -1;
//             }

//             if (isFull()) {
//                 System.out.println("Queue is full !!");
//                 return -1;
//             }
//             int result = arr[front];

//             //single element condition
//             if(rear == front){
//                 rear = front = -1;
//             }else{
//                 front = (front +1)%size; //have to move front too
//             }
//             return result;

//         }

//         // front
//         public int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty!!");
//                 return -1;
//             }

//             return arr[front];
//         }

//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(4);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek() + " ");
//             q.remove();
//         }

//     }
// }

//-----------------------------------------------------------------------------------------------
//Queue Implementation using Linked List
// class QueueClass {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             next = null;
//         }
//     }

//     static class Queue {
//         Node head = null;
//         Node tail = null;

//         public boolean isEmpty() {
//             return head == null & tail == null;
//         }

//         public void add(int data) {
//             Node newNode = new Node(data);
//             if (tail == null) {
//                 tail = head = newNode;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             // single-element
//             if (head == tail) {
//                 tail = null;
//             }
//             int front = head.data;
//             head = head.next;

//             return front;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return head.data;
//         }

//         public static void main(String[] args) {
//             Queue q = new Queue();
//             q.add(1);
//             q.add(2);
//             q.add(3);
//             q.add(4);

//             while (!q.isEmpty()) {
//                 System.out.println(q.peek() + " ");
//                 q.remove();
//             }

//         }
//     }

// }
//-----------------------------------------------------------------------------------------------
//Queue Implementation using Collection Framework
// import java.util.*;

// class QueueClass{
//     public static void main(String[] args) {
//         //why linkedList is here? coz Queue is interface in java ; we can implement it using LinkedList and ArrayDeque;
//         Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


