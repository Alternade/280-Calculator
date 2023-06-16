import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Hetrogeneous datatypes because it creates more complexities to store data
        //why homogeneous
        //generics - data types to classes and objects
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(2);
        a1.add(1);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        System.out.println(a1);
    }
}

//add is predefined method inside the arraylist class which is used to add elements
//clear is used to remove all elements in array list
//isEmpty is used to check the arraylist is empty or not
//contains is used to check an element is present inside an array list or not
//remove(index value) to remove the specific element
