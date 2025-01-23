package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class factorailLessThanN {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        System.out.println(factorialNumbers(n));
        sc.close();
    }

    static void helperFunction(long n, long fact, int i, ArrayList<Long> result){
        if(fact > n){
            return;
        }
        result.add(fact);
        helperFunction(n, fact * (i+1), i+1, result);
    }
    
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> result = new ArrayList<Long>();
        
        helperFunction(n,1,1,result);
        
        return result;
    }
}
