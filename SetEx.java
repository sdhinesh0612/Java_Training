import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        int[] arr = {1,2,3,11,2,3};
        System.out.println("Duplicate values are : ");
        int count =0;
        for(int i=0; i<arr.length; i++){
            if (s.contains(arr[i])) {
                System.out.print(arr[i]+" ");
                count++;
            }
            else{
                s.add(arr[i]);
            }
        }
        System.out.println("\nPrimitive value count : "+s.size()+"\nNon Primitive value count : "+count+"\n"+s);
        
    }
}
