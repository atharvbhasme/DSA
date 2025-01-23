package recursion;
import java.util.Scanner;

public class printOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        printN(n);
        sc.close();
    }

    public static void printN(int n){
        if(n>0){
            printN(n-1);
        }
        System.out.print(n + " ");
    }
}