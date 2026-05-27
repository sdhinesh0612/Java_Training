import java.util.*;
public class dowhile {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int Secret = 10;
        int Guess;
        do {
            Guess = scan.nextInt();
            if (Guess<Secret) {
                System.out.println("Lower");
            }
            else if (Guess>Secret) {
                System.out.println("Higher");
            }

        }while(Guess != Secret);
        System.out.println("Guess is correct");
    }
}
