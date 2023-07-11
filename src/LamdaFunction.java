import java.util.SortedMap;

public class LamdaFunction {
    public static void main(String[] args) {
        //we are converting our code to functional programming
        FunctionalInterfaceDemo f1;
        f1 = (x , y)->{
            return x+y ;
        };
        System.out.println(f1.calculate(10,20));
        System.out.println(f1);
    }
    public static void f1(){
    }
    public static void calculate(Integer i){
        System.out.println(i);
    }
}

@FunctionalInterface
interface FunctionalInterfaceDemo{
    int a = 10 ;
    int calculate(int a , int b);

}