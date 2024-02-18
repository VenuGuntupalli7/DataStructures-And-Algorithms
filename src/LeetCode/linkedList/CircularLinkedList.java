package LeetCode.linkedList;

public class CircularLinkedList {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(7);
        list.display();


    }

    private Node head;
    private Node tail;

    private CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node1 = new Node(value);
        if(head == null){
            head = node1;
            tail = node1;
            return;
        }

        tail.next = node1;
        node1.next = head;
        tail = node1;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            while (temp != head);
        }
    }


    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
