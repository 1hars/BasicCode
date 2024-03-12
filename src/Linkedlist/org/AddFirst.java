package Linkedlist.org;

public class AddFirst {
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
        int count = 0;
        public void addFirst(int var){
            Node temp = new Node(var);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        public void display(){
            Node temp = head;
            if(head == null){
                System.out.print("List is Empty");
            }else {
                while (temp != null) {
                    System.out.print(temp.data + "\t");
                    temp = temp.next;
                }
            }
            System.out.println();
        }
        public int size(){
            Node temp = head;
            if(temp == null){
                System.out.print("List is empty");
            }else {
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
            }
            System.out.println(count);
            return count;
        }
        public void removeFirst(){
            Node temp = head;
            if(temp == null || temp.next == null){
                head = tail = null;
                System.out.println("List is empty");
            }else{
                head = head.next;
            }
        }
        public void getFirst(){
            Node temp = head;
            if(temp == null){
                System.out.println("List is Empty");
            }else{
                System.out.println(temp.data);
            }
        }
        public void getLast(){
            Node temp = tail;
            if(tail == null){
                System.out.println("List is Empty");
            }else{
                System.out.println(temp.data);
            }
        }
        public void getAt(int idx){
            Node temp = head;
            int pos = size();
            int var = 0;
            if(idx > pos || temp == null){
                System.out.println("List is Empty");
            }else{
                while(var != idx){
                    var++;
                    temp = temp.next;
                }
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();
        list.getAt(2);
        list.getFirst();
        list.getLast();
        list.display();

    }
}
