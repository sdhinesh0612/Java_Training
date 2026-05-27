import java.util.*;
public class Reverse_number{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();;
        int Reverse =0;
        while(num>0){
            int Digit = num%10;
            Reverse=Reverse*10 + Digit;
            num = num/10;
        }
        System.out.println(Reverse);
        
    }
}