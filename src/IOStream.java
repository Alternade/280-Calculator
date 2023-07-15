import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStream {
    public static void main(String[] args) {

        byte[] temp = new byte[100];
        try{
            FileInputStream input =new FileInputStream("C:/Users/Arpit/IdeaProjects/java280basics/src/input.txt");
//            InputStreamReader input = new InputStreamReader(file);


            input.read(temp);

            String s1 = new String(temp);
            System.out.println(s1);
//            int i = input.read();
//            while(i!= -1){
//                System.out.print((char)i);
//                i = input.read();
//            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
