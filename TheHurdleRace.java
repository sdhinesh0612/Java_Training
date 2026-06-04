import java.util.*;
class HurdleGame{
    public int heightJump(int[] arr, int k){
        Arrays.sort(arr);
        if (arr[arr.length-1]<k) {
            return 0;
        }
        return arr[arr.length-1]-k;
    }
}
public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int key = scan.nextInt();
        int[] arr = new int[size];
        HurdleGame obj = new HurdleGame();
        obj.heightJump(arr, key);
    }
}
