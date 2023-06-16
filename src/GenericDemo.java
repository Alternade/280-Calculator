public class GenericDemo {
    public static void main(String[] args) {
        Name<String, String> t1 = new Name<String , String>("Arpit" , "Sahu");
        System.out.println(t1.returnBirthName());
        System.out.println(t1.returnTitle());
    }
}
//place holder object
class Name<BirthName , Title>{
//The T is the type of class name
    BirthName newT;
    Title newS;
    //What is the type of newT
    Name(BirthName newT , Title newS){
        this.newT = newT;
        this.newS = newS;
    }
    BirthName returnBirthName(){
        return  newT;
    }
    Title returnTitle(){
        return  newS;
    }
}