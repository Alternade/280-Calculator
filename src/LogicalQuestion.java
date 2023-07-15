public class LogicalQuestion {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;


        a = a+b; // a = 25 ; b  = 15
        b = a-b; // b = 10; a = 25
        a = a-b; //  a = 25 - 10 = 15

        b = b+c; // 10 + 20 = b = 30
        c = b-c; // 30 -20 = 10 = c
        b = b-c; // 30 -10 = b = 20
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
