import java.util.*;
public class ArrayReverse {
    public static int[] reverse(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        return arr;
          
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(reverse(arr));
    }
}
