package LeetCode.linkedList;

public class DeleteSingleList {
    public static void main(String[] args) {
        DeleteSingleList list = new DeleteSingleList();
   /*     list.insertValues(100);
        list.insertValues(200);
        list.insertValues(300);
        list.insertValues(400);*/
        list.reverseOrder(100);
        list.reverseOrder(200);
        list.reverseOrder(300);
        list.reverseOrder(400);

        System.out.print("The original List : ");
        list.display();
        System.out.println();
        System.out.print("After deletion of first and last element : ");

        list.deleteFirst();
        list.deleteLast();
        list.display();


    }
    Node head;
    Node tail;
    int size;
    public void insertValues(int values){
        Node node1 = new Node(values);
        node1.next = head;
        head= node1;

        if(tail == null){
            tail = head;
        }

        size ++;
    }

    public void reverseOrder (int values){
        if(tail == null){
            insertValues(values);
            return;
        }
        Node node = new Node(values);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    public Node get(int index ){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp =  temp.next;
        }
        return temp;
    }

    public void deleteLast(){
        Node node = get(size -2);
        tail = node;
        node.next = null;
        size--;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data =data;
            this.next=next;
        }
    }
}
