import java.util.*;
public class Switchcase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Signal");
        String S = scan.nextLine();
        switch(S){
            case "Red":{
                System.out.println("Stop");
                break;
            }
            case "Yellow":{
                System.out.println("Ready");
                break;
            }
            case "Green":{
                System.out.println("Go");
                break;
            }
            default:{
                System.out.println("Not exixt");
            }
        }
    }
}
