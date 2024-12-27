package Linked_List;


//--------------------------------------------------------------------------------------
//Question : How to reverse a linked list? (constraint : no extra memory should be used)

public class ReverseList {
    // declaring head
    Node head;

    //toget the size of a linkedlist
    private int size;

    ReverseList(){
        this.size = 0;
    }

    //declaring node
    class Node{
        String data;
        Node next; //an object of the class Node

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-operation(add-first)
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return;
        }

        newNode.next = head; //pointing towards the next node
        head = newNode; //making the newNode as the new head

    }

    //add-operation(add-last)
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return;
        }
        
        Node currNode = head;
        while(currNode.next !=null){
           currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete-operation(delete-first)
    public void deleteFirst(){
        if(head == null){
         System.out.println("List is empty");
        }

        size--;
        head = head.next;
    }

    //delete-operation(delete-last)
    public void deleteLast(){
        if(head == null){
            System.out.println("list is Empty");
        }

        size--;
        //if there's present only one node
        if(head.next == null){
            head = null;
            return;
        }
       
       Node secondLast = head;
       Node lastNode = head.next;

       while(lastNode.next !=null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
       }

       secondLast.next = null;

    }

    //printing the list
    public void printList(){
        if(head == null){
            System.out.println("List is empty !!");
            return;
        }
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data + " -> ");
           currNode = currNode.next;
        }
        if(head !=null){
            System.out.print("Null ; ");
        }
    }

    //getting the size
    public int getList(){
        return size;
    }

    //fn to reversing the list (iterativeApproach)
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        //nextNode must be initialized inside because it must be changed on every iteration 
        Node nextNode;
        while(currNode != null){
            //connecting the node 
            nextNode = currNode.next;

            //update
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //fn to reversing the list (recursive approach)
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
         
        return newHead;
    }


//Iterative approach
//     public static void main(String[] args) {
//         ReverseList ll = new ReverseList();
//         ll.addFirst("3");
//         ll.addFirst("4");
//         ll.addFirst("6");
//         ll.addLast("8");
//         ll.printList();

//         ll.reverseIterate();
//        ll.printList();


// }

//-----------------------------------------------------------------------------------------------
//Recursive approachg

    public static void main(String[] args) {
        ReverseList ll = new ReverseList();
        ll.addFirst("3");
        ll.addFirst("4");
        ll.addFirst("6");
        ll.addLast("8");
        ll.printList();
        

       ll.head = ll.reverseRecursive(ll.head);
       ll.printList();
}
}


