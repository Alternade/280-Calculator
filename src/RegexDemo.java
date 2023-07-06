import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[+](91)-[6-9][0-9]{9}$");
        Matcher m1 = pattern.matcher("+91-7978214560");
        Matcher m2 = pattern.matcher("bye");
        Matcher m3 = pattern.matcher("See You");
        Matcher m4 = pattern.matcher("home");
        Matcher m5 = pattern.matcher("Road");
        System.out.println(m1.find());
        System.out.println(m2.find());
        System.out.println(m3.find());
        System.out.println(m4.find());
        System.out.println(m5.find());


    }
}
