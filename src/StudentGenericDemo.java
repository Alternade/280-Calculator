public class StudentGenericDemo {
    public static void main(String[] args) {
        GenericStudent<String , String , Integer , Integer> s1 = new GenericStudent<>("Arpit", "Sahu", 1, 211111111);
        System.out.println(s1);
    }
}
class GenericStudent<FirstName ,LastName ,RollNo, PhoneNumber>{
    private final FirstName f;
    private final LastName l;
    private final RollNo r;
    private final PhoneNumber p;
    GenericStudent(FirstName f , LastName l , RollNo r , PhoneNumber p){
        this.f = f;
        this.l = l;
        this.r = r;
        this.p = p;
    }

    public FirstName getFirstname() {
        return f;
    }

    public LastName getLastname() {
        return l;
    }

    public PhoneNumber getPHoneNumber() {
        return p;
    }

    public RollNo getRollno() {
        return r;
    }

    @Override
    public String toString() {
        return "Name: "+ f + ", title: " + l + ", RollNo:  " + r + ", Phone Number: " + p  ;
    }
}
//We generally don't use generic classes

//Create a car generic class with 5 parameters : Car brand , Car type , Car name , Price , Color ; Assignment create with encapsulated classes and override the string function