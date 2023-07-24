public class Singleton {
    //object
    private static Singleton singleton_object = null;
    //parameter
    public String s ;
    //constructor
    private Singleton() {
        s = "Singleton object created";
    }
    public static Singleton createSingleton(){
        if(singleton_object == null){
            singleton_object = new Singleton();
        }
        return singleton_object;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "s='" + s + '\'' +
                '}';
    }
}

class SingletonInstance{
    public static void main(String[] args) {
        Singleton a = Singleton.createSingleton();
        System.out.println(a);
        Singleton b = Singleton.createSingleton();
        System.out.println(b);
    }
}
