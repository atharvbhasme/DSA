package recursion;

import java.util.Scanner;

public class sumOfNterms {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        int value = sumOfSeries(n);
        System.out.println(value);
    }

    public static int sumOfSeries(int n) {
        // code here
        if(n>0){
            return sumOfSeries(n-1) + (int)Math.pow(n, 3);
        }
        return 0;
    }
}
