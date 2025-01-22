package recursion;

import java.util.Scanner;

public class printGFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        printgfg(n);
    }

    public static void printgfg(int n){
        if(n-1>0){
            printgfg(n-1);
        }
        System.out.print("GFG ");
    }
}
