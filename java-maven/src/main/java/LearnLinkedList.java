class LearnLinkedList {

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add - first , add
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    

    public static void main(String[] args) {
        LearnLinkedList list = new LearnLinkedList();

    }
    
}
