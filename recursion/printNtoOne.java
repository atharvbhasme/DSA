package recursion;

import java.util.Scanner;
// Print numbers from N to 1 (space separated) without the help of loops.

public class printNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        printNos(n);
    }
    
    public static void printNos(int N) {
        // code here
        if(N>0){
            System.out.print(N + " ");
            printNos(N-1);
        }else{
            return;
        }
    }
}
