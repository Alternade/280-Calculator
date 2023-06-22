public class CustomLinkedList2 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
class List2{
    public static void main(String[] args) {
        CustomLinkedList2 list1 = new CustomLinkedList2();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.display();
    }
}
