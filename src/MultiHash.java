import java.util.HashMap;

public class MultiHash {
    public static void main(String[] args) {
//        Object10 o1 = new Object10("h","i","e");
//        Object10 o2 = new Object10("h","i","e");
//        Object10 o3 = new Object10("h","i","e");
//        Object10 o4 = new Object10("h","i","e");
//        Object10 o5 = new Object10("h","i","e");
//        Object10 o6 = new Object10("h","i","e");
//        Object10 o7 = new Object10("h","i","e");
//        Object10 o8 = new Object10("h","i","e");
//        Object10 o9 = new Object10("h","i","e");
//        Object10 o10 = new Object10("h","i","e");
        //this is not thread safe
        Object10 a = Object10.getObject10Instance("Arpit","10","Sahu");
        System.out.println(a);
        Object10 b = Object10.getObject10Instance("Kuldeep","20","Kumar");
        System.out.println(b);

        HashMap<String, Object10> h1 = new HashMap<>();
        HashMap<String, Object10> h2 = new HashMap<>();
        HashMap<String, Object10> h3 = new HashMap<>();

//        h1.put(o1.name,o1);
//        h1.put(o2.name,o2);
//        h1.put(o3.name,o3);
//
//        h2.put(o4.name,o4);
//        h2.put(o5.name,o5);
//        h2.put(o6.name,o6);
//        h2.put(o7.name,o7);
//
//        h3.put(o8.name,o8);
//        h3.put(o9.name,o9);
//        h3.put(o10.name,o10);

        HashMap<Integer, HashMap<String, Object10>> h4 = new HashMap<>();
        h4.put(1,h1);
        h4.put(2,h2);
        h4.put(3,h3);



    }





}
class Object10{
    String name;
    String age;
    String last;

    private Object10(String name, String age, String last) {
        this.name = name;
        this.age = age;
        this.last = last;
    }
    static Object10 object10Instance = null;

    public static Object10 getObject10Instance(String name, String age, String last) {
        if(object10Instance == null){
            Object10 object10Instance = new Object10(name,age,last);
            return object10Instance;
        }
        return object10Instance;
    }

    private static Object10 object10Instance(String name, String age, String last) {
        return  object10Instance;
    }


//    @Override
//    public String toString() {
//        return "Object10{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                ", last='" + last + '\'' +
//                '}';
//    }
}