class DoublyLinkedChain{
    class Node{
        int item;
        Node previous;
        Node next;
        public Node(int item){
            this.item = item;
        }
    }
    Node head, tail = null;
    public void addNode(int item){
        Node newNode = new Node(item);
        if(head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void printNodes(){
        Node current = head;
        while(current != null){
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        DoublyLinkedChain dl_List = new DoublyLinkedChain();
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);
        System.out.println("Nodes of doubly linked chain:");
        dl_List.printNodes();
    }
}