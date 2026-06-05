import java.util.*;

public class Testing {
    public static int singleNumber(int[] arr){
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(!(s.add(arr[i]))){
                s.remove(arr[i]);
            }
            else{
                s.add(arr[i]); 
            }
        }
        return s.get(0); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));
    }
}
   