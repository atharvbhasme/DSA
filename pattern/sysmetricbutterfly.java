package pattern;
import java.util.Scanner;

public class sysmetricbutterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();

        int spaces = 2*n - 2;

        for (int i = 1; i <= (n*2)-1; i++) {
            // stars for frist half
            int stars = i;

            // stars for second half
            if(i>n) stars = 2*n - i;
           
            // for priting stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // for priting spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // for priting stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                spaces -= 2;
            }else{
                spaces += 2;
            }
        }
    }   
}
