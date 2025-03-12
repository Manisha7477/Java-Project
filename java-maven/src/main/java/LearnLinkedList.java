import java.util.LinkedList;

class LearnLinkedList {

    // class Node {
    //     String data;
    //     Node next;

    //     Node(String data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // Node head;

    // // Add at the beginning
    // public void addFirst(String data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }

    // // Add at the end
    // public void addLast(String data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }

    // // Print the linked list
    // public void printList() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     Node currNode = head;
    //     while (currNode != null) {
    //         System.out.print(currNode.data + " -> ");  
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL"); 
    // }

    public static void main(String[] args) {
    //     LearnLinkedList list = new LearnLinkedList();
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     list.addFirst("This");
    //     list.printList();  


    LinkedList<Integer> list = new LinkedList<Integer>();
    list.addFirst(2);
    list.addFirst(7);
    list.addLast(0);
    System.out.println(list.size());
    list.removeFirst();
System.out.println(list);

    }

}
