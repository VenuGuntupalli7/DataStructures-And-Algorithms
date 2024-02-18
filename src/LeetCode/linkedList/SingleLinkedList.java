package LeetCode.linkedList;

public class SingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertValues(40);
        list.insertValues(50);
        list.insertValues(60);
        list.insertMiddle(77,2);
        list.insertMiddle2(500,1);
      /*  list.display();
        list.deleteFirst();
        list.display();*/

        SingleLinkedList list2 = new SingleLinkedList();
        list2.insertLast(40);
        list2.insertLast(50);
        list2.insertLast(60);
        list2.insertLast(70);


        list2.deleteLast();
        list2.display();


    }

    private  Node head;
    private  Node tail;
    public   int size;
    // when we add new value of an element which is node1 and node1.next should be the head bc node1 is a new entry and next to the new entry is the head
    public void insertValues(int data){
        Node node1 = new Node(data);
        node1.next = head;
        head= node1; // we have rule that first element should be head and that's why we are assigning node1 vale tpo head

        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insertLast(int data){
        if(tail == null){
          insertValues(data);
          return;
        }

        Node node1 = new Node(data);
        tail.next = node1;
        tail = node1;

        size++;
    }

    public void insertMiddle2(int data, int index){

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node3 = new Node(data, temp.next);
        temp.next = node3;
        size++;
    }

    public void insertMiddle(int data, int index){
        if(index == 0){
            insertValues(data);
            return;
        }
        if(index == size){
            insertLast(data);
        }
        Node temp = head; //start temp node at head as initial point
        for (int i=1; i<index; i++){
            temp = temp.next; //move temp node to nearest insertion point
        }
        Node node1 = new Node(data, temp.next); //create a new node with the value you're looking at add and this node1 will store the address of next node
        temp.next = node1;
        size++;
    }

    public void display (){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

    }

    public int deleteFirst(){
        int value = head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;
    }

    public Node getIndex(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
          node = node.next;
        }
        return node;
    }

    public int deleteLast(){
     if(size <=1){
         return deleteFirst();
     }

     Node secondLast = getIndex(size-2);
     int val = tail.data;
     tail = secondLast;
     tail.next = null;

     return val;
    }

    public class Node{
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
