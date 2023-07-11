import java.lang.reflect.Array;
import java.util.ArrayList;

public class LamdaDemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        for(Integer i : l1){
            System.out.println(i);
        }
        System.out.println(l1);
        l1.forEach((j)-> System.out.println(j));

    }
}
