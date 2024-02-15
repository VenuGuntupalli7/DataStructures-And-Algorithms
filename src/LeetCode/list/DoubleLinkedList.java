package LeetCode.list;


public class DoubleLinkedList {
    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertValuesHead(10);
        list.insertValuesHead(20);
        list.insertValuesHead(30);
        list.insertValuesHead(40);
        list.insertLast(500);
        list.display();
        list.displayReverse();

        /*list.insertValuesTail(80);
        list.insertValuesTail(90);
        list.insertValuesTail(100);*/


    }

    public Node head;
    public Node tail;
    public int size;
    public void insertValuesHead(int value){
        Node node1 = new Node(value);
        node1.next = head;
        node1.prev = null;
        if(head != null){ //checking for null pointer
            head.prev = node1;
        }
        head = node1;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertValuesTail(int value){
        if(tail == null){
            insertValuesHead(value);
            return;
        }
        Node node1 = new Node(value);
        tail.next = node1;
        node1.prev = tail;
        tail = node1;
        size++;
    }

    public void display(){
        Node temp = head;
        System.out.print("The regular list: " );
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("The reverse list: " );
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
    }


    public void displayTail(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
    }


    public void insertLast(int value){
        Node node1 = new Node(value);
        Node temp = head;

        if (head == null){
            node1.prev = null;
            head = node1;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        node1.next = null;
        node1.prev = temp;
        temp.next = node1;

    }


    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
