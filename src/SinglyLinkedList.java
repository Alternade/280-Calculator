public class SinglyLinkedList {
    class Node{
        int value;
        Node next;
        Node(int d){
            this.value = d;
        }
    }
    Node head;

    public void add(int d){
        Node current ;
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            newNode.next = null;
        }else{
            current = head;
            while(current.next != null){
                current= current.next;
            }
            current.next = newNode;
        }
    }

    public void addSpecific(int d , int p){
        Node current ;
        Node newNode= new Node(d);
        current = head;
        for(int i = 1 ; i < p-1 ;i++ ){
            current= current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(){
        if(head == null){
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        }
        Node current = head;

        while(current.next.next != null ){
            current = current.next;
        }
        current.next = null;
    }

    public void display(){
        if(head == null){
            System.out.println("Our list is empty");
        }else{
            Node current = head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public void search(int v){
        Node current = head;
        int counter = 1;
        int place = 0;
        while(current != null){
            if ( v == current.value){
                place = counter;
                break;
            }
            current = current.next;
            counter++;
        }
        if(place == 0) {
            System.out.println("Element not found");
        }else {
            System.out.println("Element is found in "+ place + " position");
        }
    }

}
class ListOfNumbers{
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.add(100);
        list1.add(150);
        list1.add(200);
        list1.add(500);
        list1.add(1000);
        list1.add(10000);
        //list1.display();
        list1.addSpecific(104, 2);
        list1.display();
        list1.search(500);


    }
}
