import java.util.Stack;

public class PreStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}
