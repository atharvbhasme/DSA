package number_system;

import java.util.ArrayList;
import java.util.Scanner;

public class allDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int num = sc.nextInt();
        for (int i = 1; i < (num/2) + 1; i++) {
            if(num % i == 0){
                ans.add(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
