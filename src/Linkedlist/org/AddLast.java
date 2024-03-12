package Linkedlist.org;

public class AddLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkeList{
        Node head = null;
        Node tail = null;

        public void addlast(int var){
            Node temp = new Node(var);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void dispaly(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkeList list = new LinkeList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);
        list.addlast(50);
        list.dispaly();
    }
}
