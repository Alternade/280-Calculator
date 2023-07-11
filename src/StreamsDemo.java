import java.util.ArrayList;


public class StreamsDemo {
    public static void main(String[] args) {

        ArrayList<Mobile> a1 = new ArrayList<>();
        Mobile m1 = new Mobile("Apple","14",100000);
        Mobile m2 = new Mobile("Realme","14",15000);
        Mobile m3 = new Mobile("Xiomi","Note9",20000);
        Mobile m4 = new Mobile("Vivo","51a",22000);
        Mobile m5 = new Mobile("Samsung","a30",17000);
        Mobile m6 = new Mobile("Oppo","m4",23000);
        Mobile m7 = new Mobile("Samsung","fold",110000);

        a1.add(m1);
        a1.add(m2);
        a1.add(m3);
        a1.add(m4);
        a1.add(m5);
        a1.add(m6);
        a1.add(m7);

        a1.stream().filter(i-> i.price>20000).forEach(i-> System.out.println(i));
                System.out.println();
    }
}
class Mobile{
    String brand;
    String model;
    int price;

    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
