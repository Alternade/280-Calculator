public class CustomQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    CustomQueue(int size){
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }


    public boolean isFull() { return rear == capacity-1;}

    public void enqueue(int i){
        if (isFull()){
            System.out.println("Queue is filled");
        }else {
            if( isEmpty()){
                front = 0;
            }
            rear ++;
            arr[rear] = i;
            System.out.println("Element inserted");
        }

    }

    public void dequeue(){

        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            if(front == rear){
                System.out.println("Removed element = " + arr[rear]);
                front = -1;
                rear = -1;
                System.out.println("Last element removed");
            }
            else {
                System.out.println("Removed element = " + arr[front]);
                front ++;
                System.out.println("Element removed");
            }
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for (int i = front ; i <= rear ; i++ ){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomQueue queue1 = new CustomQueue(6);
        queue1.enqueue(10);
        queue1.enqueue(11);
        queue1.enqueue(12);
        queue1.enqueue(13);
        queue1.enqueue(14);
        queue1.display();
        queue1.dequeue();
        queue1.display();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
    }
}
//Assignment 29-6-23 =- Write a custom queue which have the capability to add a student and remove a student.Student is custom datatype -roll NAme  age phn no email . Add 10 students to your queue and remove 6 student from the queue after adding your students. Display all the remaining students name and phone number.crud operations
