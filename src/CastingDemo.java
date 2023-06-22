public class CastingDemo {
    public static void main(String[] args) {
        //Upcasting
        int i = 10 ;
        Double d = (double) i;
        //Explicit upcasting
        System.out.println(d);
        int i3 = d.intValue() ;
        Integer i2 =d.intValue();
        //Explict conversion of upper value to lower value
        System.out.println(i2);
        System.out.println(i3);
    }
}
//type casting
