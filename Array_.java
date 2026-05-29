import java.util.*;
public class Array_ {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.println("Enter array values :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array values are :");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
