import java.util.*;
class User{
    String Name;
    long Phone;
    String Address;
    User(String Name, long Phone, String Address){
        this.Name=Name;
        this.Phone=Phone;
        this.Address=Address; 
    }
    void display(){
        System.out.println("Name : "+Name+"\nPhone : "+Phone+"\nAddress : "+Address);
    }
    
}
class Swiggy extends User{
    Swiggy(String Name, long Phone, String Address){
        super(Name,Phone,Address);
    }
    void FoodOrder(){
        System.out.println();
        super.display();
        System.out.println("Your Order Confirmed...");
    }
}
public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Details");
        System.out.println("Enter your Name :");
        String n = sc.nextLine();
        System.out.println("Enter your Mobile Number");
        long p = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Address");
        String a = sc.nextLine();

        Swiggy sw = new Swiggy(n,p,a);
        sw.FoodOrder();
    }
}
   