class one{
    String name;
    int age;

     one(String a, int b){
        name = a ;
        age = b;
        System.out.print("Name : "+name+"\nAge : "+age);
     }
}
public class Constructors {
    public static void main(String[] args) {
        one obj = new one("Dhinesh",21);
    }
}
 