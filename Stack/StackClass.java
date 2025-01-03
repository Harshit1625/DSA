package Stack;

import java.util.*;

//-------------------------------------------------------------
//Stacks can be implemented with Array , ArrayList , LinkedList :-
//Nut we generally not use Array because it is not dynamic , so we use ArrayList and LinkedLIst  

// ---------------------------------------------------------------------------------------------------
// Implementation using Linked List

// public class StackClass {
//     public static class Node{
//         int data;
//         Node next; //Pointer which points to the next node

//        public Node(int data){
//             this.data = data;
//             next = null;
//         }
//     }

//     //declaring the stack class
//     static class Stack {
//      public static Node head;

//      //function to check if the stack is empty or not
//      public static boolean isEmpty(){
//         return head == null;
//      }

//      //function to push the data
//      public static void push(int data){
//       Node newNode = new Node(data);

//        if(isEmpty()){
//        head = newNode;
//        return;
//        }

//        //updation
//        newNode.next = head;
//        head = newNode;
//      }

//   function to pop the data
//      public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top = head.data;
//         head = head.next;
//         return top;
//      }

//      //function to peek a stack
//      public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top = head.data;
//         return top;
//      }
//     }

//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(0);
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);

//         while(!st.isEmpty()){
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }

// }

// ---------------------------------------------------------------------------------------------------
// Implementation using ArrayList

// public class StackClass {
//     static class Stack {
//         ArrayList<Integer> list = new ArrayList<>();

//         // fn to check list is empty or not
//         public boolean isEmpty() {
//             return list.size()== 0;
//         }

//         // push
//         public void push(int data) {
//             list.add(data);
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // peek
//         public int peek() {
//             int top = list.get(list.size() - 1);
//             return top;
//         }
//     }

//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(7);
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);

//         while(!st.isEmpty()) {
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }

// }

// ---------------------------------------------------------------------------------------------------
// Implementation using Collection Framework
class StackClass{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while(!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
