import java.util.*;
public class Reversearr_values {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int a = scan.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter Array Values : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println();
        for(int i=a-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
