import java.util.*;
public class findmissing_num {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       int n = scan.nextInt();
       int[] arr = {10,9,6,4,2,3,5,7,0,1};
        Arrays.sort(arr);//Array Sorting syntax.
       for(int i=0; i<=n; i++){
            if (arr[i]!=i) {
                System.out.println(i);
                break;
            }
            
       }
    }
}
