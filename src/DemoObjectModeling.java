public class DemoObjectModeling {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println(i);
        CustomInteger i1 = new CustomInteger(10);
        System.out.println(i1);
    }
}

class CustomInteger{
    int a;
    //Parameterized Constructor
    CustomInteger(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "Our integer is " +
                 + a ;
    }
}
//we can modify our data whatever we like