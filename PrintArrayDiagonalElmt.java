import java.util.Scanner;
public class PrintArrayDiagonalElmt {
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
     
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i][i]+" ");
        
        }
    }
}

