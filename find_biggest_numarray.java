import java.util.*;
public class find_biggest_numarray {
    public static void main(String[] args){
        /*int[] arr = {76,83,55,36};
        int temp=0;
        for(int i=0; i<arr.length; i++ ){
            if (temp<arr[i]) {
                temp = arr[i];
            }  
        }
        System.out.println(temp); */
        int[] arr = {76,83,55,36};
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);

    }
}
