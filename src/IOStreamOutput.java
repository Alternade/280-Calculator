import java.io.FileOutputStream;


public class IOStreamOutput {
    public static void main(String[] args) {
        String s1 = " Hello I am Arpit and i teach java ";
        try {
            FileOutputStream output = new FileOutputStream("C:/Users/Arpit/IdeaProjects/java280basics/src/output.txt");

            byte[] temp = s1.getBytes();
            output.write(temp);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
