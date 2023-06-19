import java.util.ArrayList;
import java.util.List;

public class DataStructureDemo {
    public static void main(String[] args) {
        Actors a1 = new Actors("Shahrukh Khan" ,"Pathan", "Fan" , "mumbai" , 50, 97  );
        Actors a2 = new Actors("Akshay Kumar", "Gabbar", "Many", "Canada" , 100, 120);
        //hash value of the address
        List<Actors> l1 = new ArrayList<Actors>();
        // in list l1 what type of object will be stored? actors type we have to create actor objects
        l1.add(a1);
        l1.add(a2);
        System.out.println(l1);


    }
}
//why custom object
class Actors{
    String name;
    String popularMovie;
    String flopMovie;
    String location;
    int movies;
    int age;
    Actors (String n , String p , String f , String l , int m , int a){
        this.name = n;
        this.popularMovie = p;
        this.flopMovie = f;
        this.location = l;
        this.movies = m;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", popularMovie='" + popularMovie + '\'' +
                ", flopMovie='" + flopMovie + '\'' +
                ", location='" + location + '\'' +
                ", movies=" + movies +
                ", age=" + age +
                '}';
    }
}
//Data structure is a way to store and organize data
// custom data structure
// linked list , ciircular linked list, doubly linked list, doubly circular linked list, stack , queue Alogorithms of these , Hashmaps ; Java 8 features