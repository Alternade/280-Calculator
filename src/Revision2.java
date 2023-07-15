import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Revision2 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(29);
        a1.add(5);
        a1.add(5);
        System.out.println(a1.stream().reduce(a1.get(0),(i,j) -> Integer.min(i,j)));

    }

}
