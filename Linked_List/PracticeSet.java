package Linked_List;

//------------------------------------------------------------------------------------------------------
//Q1 :- Find the nth node from last  
// class PracticeSet {
//     ListNode head;

//     class ListNode {
//         int val; // val means data which we are passing
//         ListNode next;

//         ListNode(int val) {
//             this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }

//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if (head.next == null) {
//             return null;
//         }

//         // size
//         int size = 0;
//         ListNode curr = head;
//         while (curr != null) {
//             curr = curr.next;
//             size++;
//         }

//         if (n == size) {
//             return head.next;
//         }

//         // deletion of the node
//         int indexToSearch = size - n;
//         ListNode prev = head;
//         int i = 1; // Start from 1 since prev is already at head
//         while (i < indexToSearch) {
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return head;
//     }

// -----------------------------------------------------
//Why Return head?
// Preserving the Starting Point of the List:

// The head variable represents the starting point of the linked list.
// Even if the function modifies the list (e.g., by deleting a node), the rest of the structure depends on the head remaining intact.
// If you don't return head, the caller won't know where the updated list starts.
// Handling Edge Cases:

// In cases where the head itself is removed (e.g., when n == size), the function updates head to point to head.next.
// Returning this updated head ensures the caller gets the new starting point of the list.
// Consistency:

// In most linked list operations, the function that manipulates the list returns the updated head to indicate the new state of the list.
// This is a standard convention in linked list algorithms to maintain clarity and usability.


// ------------------------------------------------

    // Helper method to add nodes to the list from the last
//     public void addNode(int data){
//         ListNode newNode = new ListNode(data);
//         if(head == null){
//           head = newNode;
//           return;
//         }
        
//         ListNode currNode = head;
//         while(currNode.next !=null){
//            currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     // Helper method to display the list
//     public void display() {
//         ListNode temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         PracticeSet list = new PracticeSet();

//         // Adding nodes to the list
//         list.addNode(1);
//         list.addNode(2);
//         list.addNode(3);
//         list.addNode(4);
//         list.addNode(5);
        
//         System.out.println("Original List:");
//         list.display();

//         // Removing the 2nd node from the end
//         list.head = list.removeNthFromEnd(list.head, 2);

//         System.out.println("List after removing 2nd node from the end:");
//         list.display();
//     }
// }

//------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------
//Q2 :- Check if the Linked list is palindrome or not?
// class PracticeSet {
//         ListNode head;
    
//         class ListNode {
//             int val; // val means data which we are passing
//             ListNode next;
    
//             ListNode(int val) {
//                 this.val = val;
//             }
    
//             ListNode(int val, ListNode next) {
//                 this.val = val;
//                 this.next = next;
//             }
//         }
        //function to find middleNode
        //:- we can find the middleNode by two approaches , first is we can calculate the size of the list amd then divide it by two ,the second approach is turtle-hare approach
        //:- turtle and hare are basically two pointers in which hare jumps 2 steps but tutrtle jumps for 1 step , and when hares next step becomes equal to null we return the 
        //   turtle position and that will be the middle pf the list.(they must start alongside from the head)
//         public ListNode middleNodeFinder(ListNode head){
//             ListNode hare = head;
//             ListNode turtle = head;

//             while(hare.next != null && hare.next.next !=null){
//                 hare = hare.next.next;
//                 turtle = turtle.next;
//             }
//             return turtle;
//         }

//         //function to reversetheSecondHalf
//         public ListNode reverseSecondHalf(ListNode head){
//             ListNode prevNode = null;
//             ListNode currNode = head;
//             ListNode nextNode;

//             while(currNode != null){
//               nextNode = currNode.next;

//               //updation
//               currNode.next = prevNode;
//               prevNode = currNode;
//               currNode = nextNode;
//             }
//             return prevNode;
//         }

//         //function to check LL if is palindrome or not
//         public boolean isPalindrome(ListNode head){
//          if(head == null || head.next == null){
//             return true;
//          }   

//          ListNode middleNode = middleNodeFinder(head);
//          ListNode secondHalfStart = reverseSecondHalf(middleNode.next);
//          ListNode firstHalfStart = head;
//          while(secondHalfStart != null){
//             if(firstHalfStart.val != secondHalfStart.val){
//                 return false;
//             }
//            firstHalfStart = firstHalfStart.next;
//            secondHalfStart = secondHalfStart.next;
//          }

//          return true;
//         }


//      //  Helper method to add nodes to the list from the last
//     public void addNode(int data){
//         ListNode newNode = new ListNode(data);
//         if(head == null){
//           head = newNode;
//           return;
//         }
        
//         ListNode currNode = head;
//         while(currNode.next !=null){
//            currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     // Helper method to display the list
//     public void display() {
//         ListNode temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         PracticeSet list = new PracticeSet();

//         // Adding nodes to the list
//         list.addNode(1);
//         list.addNode(2);
//         list.addNode(3);
//         list.addNode(2);
//         list.addNode(1);
        
//         System.out.println("Original List:");
//         list.display();
//        boolean result = list.isPalindrome(list.head);
//        System.out.println(result);
//     }

// }

//Note :- Hare Turtle approach is also known as Floyd's algorithm.
//------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------
//Q3 :- Detect a cycle in a linked list ( means last node is pointing towards any other node not null) + how we can remove it
//watch anuj bhaiya's video for this

class PracticeSet {
    ListNode head;

    class ListNode {
        int val; // val means data which we are passing
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to check if a cycle is present and return the meeting node
    public ListNode hasCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return hare; // Return the meeting point
            }
        }
        return null; // No cycle detected
    }

    // Function to detect the start of the cycle and remove it
    public ListNode detectStartCycleNodeAndRemove(ListNode head) {
        ListNode meetingNode = hasCycle(head);
        if (meetingNode == null) {
            return null; // No cycle detected
        }

        // Find the start of the cycle
        ListNode currNode = head;
        while (currNode != meetingNode) {
            currNode = currNode.next;
            meetingNode = meetingNode.next;
        }

        // Remove the cycle
        ListNode temp = currNode;
        while (temp.next != currNode) {
            temp = temp.next;
        }
        temp.next = null; // Break the cycle

        return currNode; // Return the start of the cycle
    }

     // Helper method to add nodes to the list from the last
     public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
          head = newNode;
          return;
        }
        
        ListNode currNode = head;
        while(currNode.next !=null){
           currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Helper method to display the list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PracticeSet list = new PracticeSet();

        // Adding nodes to the list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        
        System.out.println("Original List:");
        list.display();
       
    }
}






