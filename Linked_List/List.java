package Linked_List;
import java.util.LinkedList;
import java.util.Scanner;

// -----------------------------------------------------------------------------------------------------------------------------------
//without COLLECTION-FRAMEWORK

// public class List {
//     //declaring head
//     Node head;

//     //toget the size of a linkedlist
//     private int size;

//     List(){
//         this.size = 0;
//     }

//     //declaring node
//     class Node{
//         String data;
//         Node next; //an object of the class Node

//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     //add-operation(add-first)
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//           head = newNode;
//           return;
//         }

//         newNode.next = head; //pointing towards the next node
//         head = newNode; //making the newNode as the new head

//     }

//     //add-operation(add-last)
//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//           head = newNode;
//           return;
//         }
        
//         Node currNode = head;
//         while(currNode.next !=null){
//            currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     //delete-operation(delete-first)
//     public void deleteFirst(){
//         if(head == null){
//          System.out.println("List is empty");
//         }

//         size--;
//         head = head.next;
//     }

//     //delete-operation(delete-last)
//     public void deleteLast(){
//         if(head == null){
//             System.out.println("list is Empty");
//         }

//         size--;
//         //if there's present only one node
//         if(head.next == null){
//             head = null;
//             return;
//         }
       
//        Node secondLast = head;
//        Node lastNode = head.next;

//        while(lastNode.next !=null){
//         lastNode = lastNode.next;
//         secondLast = secondLast.next;
//        }

//        secondLast.next = null;

//     }

//     //printing the list
//     public void printList(){
//         if(head == null){
//             System.out.println("List is empty !!");
//             return;
//         }
//         Node currNode = head;
//         while(currNode !=null){
//             System.out.print(currNode.data + " -> ");
//            currNode = currNode.next;
//         }
//         if(head !=null){
//             System.out.print("Null ; ");
//         }
//     }

//     //getting the size
//     public int getList(){
//         return size;
//     }

//     public static void main(String[] args) {
//         List ll = new List();
//         ll.addFirst("3");
//         ll.addFirst("4");
//         ll.addFirst("6");
//         ll.addLast("8");
//         ll.printList();
//         ll.deleteFirst();
//         ll.printList();
//         ll.deleteLast();
//         ll.printList();

//         System.out.println(ll.getList());

//     }

// }

// ---------------------------------------------------------------------------------------------------------------------------------
//with COLLECTION-FRAMEWORK
// public class List {
//   public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     list.addFirst("a");
//     list.addFirst("b");
//     list.addFirst("c");
//     list.addLast("d");
//     list.add("e"); //.add function directly adds the element in the last but to add first we have to call addFirst
//     System.out.println(list.size());

//     for(int i = 0; i < list.size(); i++){
//         System.out.print(list.get(i) + " -> ");
//     }
//     System.out.println("Null");

//     list.removeFirst();
//     System.out.println(list);

//     list.removeLast();
//     System.out.println(list);

//     list.remove(1); //by passing the index you can remove the desired element
// }
    
// }

// ---------------------------------------------------------------------------------------------------------------------------------
//Question1 : Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
//Question2 : Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

//Answer1

// class List {
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         int arr [] = {1, 5, 7, 3 , 8, 2, 3};

//         for(int i = 0; i < arr.length ; i++){
//             list.addLast(arr[i]);
//         }

//         for(int j = 0 ; j < list.size() ; j++){
//             System.out.print(list.get(j) + " -> ");
//         }

//         System.out.print("Null");

//     }
// }

//Answer2

class List{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        
        //entering values
        for(int i=0; i < 5 ; i++){
            int value = sc.nextInt();
            list.addLast(value);
        }
       
        //printing the entered list
        System.out.println("Entered List");
        for(int k=0; k < list.size() ; k++){
            System.out.print(list.get(k) + " -> ");
           }
           System.out.print("Null");
        
      //loop to remove the values greater than 25
        for(int i=0; i < list.size() ; i++){
            if(list.get(i) > 25){
                list.remove(i);
                i--;
            }
        }

        //printing after removing the elements
        System.out.println();
        System.out.println("Corrected List");
        for(int k=0; k < list.size() ; k++){
            System.out.print(list.get(k) + " -> ");
        }
        System.out.print("Null");
        sc.close();
    }
 }



