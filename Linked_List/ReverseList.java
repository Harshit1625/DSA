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

    //reversing the list 
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        //nextNode must be initialized inside
        Node nextNode;
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }



    public static void main(String[] args) {
        ReverseList ll = new ReverseList();
        ll.addFirst("3");
        ll.addFirst("4");
        ll.addFirst("6");
        ll.addLast("8");
        ll.printList();

        ll.reverseIterate();
       ll.printList();


}
}
