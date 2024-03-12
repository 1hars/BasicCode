package Linkedlist.org;

public class GetFirstandLast {
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
        public void addelement(int var){
            Node temp = new Node(var);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int size(){
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        public void removeFirst(){
            Node temp = head;
            if(temp == null){
                System.out.println("List is Empty");
            }else{
                if(temp.next == null){
                    head = tail = null;
                }else{
                    head = temp.next;
                }
            }
        }
        public void getFirst(){
            Node temp = head;
            if(temp == null){
                System.out.println("Empty LinkedList");
            }else{
                System.out.println(temp.data);
            }
        }
        public void getLast(){
            Node temp = tail;
            if(temp == null){
                System.out.println("Empty LinkedList");
            }else{
                System.out.println(temp.data);
            }
        }
        public void getAt(int idx){
            Node temp = head;
            int pos = size();
            int count = 0;
            if(pos < idx){
                System.out.println("Invalid index");
            }else{
                while(idx != count){
                    count++;
                    temp = temp.next;
                }
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addelement(10);
        list.addelement(20);
        list.addelement(30);
        list.addelement(40);
        list.addelement(50);
        list.display();
        int ans = list.size();
        System.out.println(ans);
        list.removeFirst();
        list.display();
        list.getFirst();
        list.getLast();
        list.getAt(2);
        list.removeFirst();
        list.display();
    }

}
