import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        ExceptionDemo e = new ExceptionDemo();
        //e.method1();
        try{
            e.method1();

        }catch(IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException i){
            i.printStackTrace();
        }
        System.out.println("Ending");

    }
    public void method1() throws IOException,ClassNotFoundException {
        //written any logic which may throw a checked exception to take caution we write throws keyword
        System.out.println("Hi");
        //some code which may throw exception
        throw new ClassNotFoundException("Custom Exception");    }
}
// it only handles checked exception
