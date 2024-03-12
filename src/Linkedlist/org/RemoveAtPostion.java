package Linkedlist.org;

public class RemoveAtPostion {
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
        void add(int var){
            Node temp = new Node(var);
            if(head == null){
                tail = head = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
        void remove(int idx){
            Node temp = head;
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.remove(2);
        list.display();
    }
}
