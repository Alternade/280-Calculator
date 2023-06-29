import java.util.PriorityQueue;
import java.util.Queue;
//is not a class we cannot create a direct queue object

public class PredefinedQueue {
    public static void main(String[] args) {
        Queue<Integer> list1 = new PriorityQueue<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.poll();
        System.out.println(list1);
    }
}
