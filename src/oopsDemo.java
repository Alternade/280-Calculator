public class oopsDemo {
    public static void main(String[] args) {
      Animal3 a1 = new Animal3();
      System.out.println(Animal2.Animal21.l);
      a1.breathe();
      System.out.println(Animal2.Animal21.l);
    }
}
//Why parameterized constructor is required?
//we need to create and destroy objects only during runtime

class Animal3{

    //declaration will be resolved during runtime and all the values to be set
    int l = 170;
    public void breathe(){
        System.out.println("Animal 1 is breathing");
    }
}
//when you write static it makes it exist
class Animal2{
    class Animal21 {
        static int l = 140;
        public static void breathe() {
            l = 10;
            String type;
            System.out.println("Animal21 is breathing");
        }
        void b1(){
            l = 1;
            System.out.println(l);
        }

    }
}
