public class CustomLinkedList {
    static class Node{
        int value;
        Node next;
        Node(int a){
            value = a;
            next = null;
        }
    }
    //currently null
    Node head;


//I have to mention the list where i am adding and i have to mention what i am adding
    public static CustomLinkedList insert(CustomLinkedList list ,int d){
        Node newNode = new Node(d);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void display(CustomLinkedList list){
        Node current = list.head;
        while(current !=null){
            System.out.println(current.value + "   ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList.insert(list1 , 10);
        CustomLinkedList.insert(list1 , 11);
        CustomLinkedList.insert(list1 , 23);
        CustomLinkedList.display(list1);
    }


}
