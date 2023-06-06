import java.util.Scanner;

public class logicQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ratio 1");
        int a = sc.nextInt();
        System.out.println("Enter the ratio 2");
        int b = sc.nextInt();
        System.out.println("Enter the number to check");
        int c = sc.nextInt();
        if (c %(a+b) == 0 ){
            System.out.println("The entered number is in ratio of 7:3");
        }else {
            System.out.println("The entered number is not in ratio of 7:3");
        }
    }
}
