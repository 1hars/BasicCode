package Linkedlist.org;

public class SizeandPrint {
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
        int size = 0;
        public void addelement(int var){
            Node temp = new Node(var);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void size(){
            Node temp = head;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            System.out.println("LinkedList Size is = "+size);
        }
        public void dispaly(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addelement(10);
        list.addelement(20);
        list.addelement(30);
        list.addelement(40);
        list.addelement(50);
        list.size();
        list.dispaly();

    }
}
