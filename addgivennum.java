import java.util.*;
public class addgivennum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number :");
        int num = scan.nextInt();
        int sum = 0;
        int R;
        while(num>0) {
             R = num%10;
             sum = sum+R;
             num = num/10;         
        }
        System.out.println("The Sum of given Number is :"+sum);
    }
}
