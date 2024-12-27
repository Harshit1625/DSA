package Linked_List;

//------------------------------------------------------------------------------------------------------
//Q1 :- Find the nth node from last  
class PracticeSet {
    ListNode head;

    class ListNode {
        int val; // val means data which we are passing
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        // size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        // deletion of the node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1; // Start from 1 since prev is already at head
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

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

    // Helper method to add nodes to the list
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
        list.addNode(4);
        list.addNode(5);
        
        System.out.println("Original List:");
        list.display();

        // Removing the 2nd node from the end
        list.head = list.removeNthFromEnd(list.head, 2);

        System.out.println("List after removing 2nd node from the end:");
        list.display();
    }
}

//------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------
//Q2 :- Check if the Linked list is palindrome or not?

