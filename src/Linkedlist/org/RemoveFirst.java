package Linkedlist.org;

public class RemoveFirst {
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
        public void add(int var){
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
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
        public void removeFirst(){
            Node temp = head;
            if(temp == null) {
                System.out.print("Chutiye LinkedList khali hai");
            }else{
                if (temp.next == null) {
                    head = tail = null;
                }else{
                    head = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.removeFirst();
        list.removeFirst();
        list.display();
        list.removeFirst();
        list.display();
        list.removeFirst();

    }
}
