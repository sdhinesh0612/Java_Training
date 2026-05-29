import java.util.Scanner;
public class AddNumIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] =sc.nextInt(); 
        }
        System.out.println();
        } 
        int Sum;
        for(int i=0; i<arr.length;i++){
            Sum = 0;
            for(int j=0; j<arr.length; j++){
             Sum = Sum+arr[i][j];
        }
        System.out.println(Sum+" ");
        }
    }
}
