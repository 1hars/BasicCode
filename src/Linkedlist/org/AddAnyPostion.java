package Linkedlist.org;

public class AddAnyPostion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void addLast(int var){
            Node temp = new Node(var);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        void addPosition(int idx, int var){
            Node temp = new Node(var);
            Node first = head;
            for(int i = 1; i < idx; i++){
               first = first.next;
            }
            temp.next = first.next;
            first.next = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();
        list.addPosition(2,50);
        list.display();

    }
}
