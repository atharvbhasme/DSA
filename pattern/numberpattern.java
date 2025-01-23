package pattern;

import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number N!");
        int n = sc.nextInt();
        for (int i = 0; i < (n*2)-1; i++) {
            for (int j = 0; j < (n*2)-1; j++) {
                int top = i;
                int bottom = j;
                int left = (2*n - 2) - i;
                int right = (2*n - 2) - j;
                System.out.print(n- Math.min(Math.min(top, bottom),Math.min(left, right)));
            }
            System.out.println();
        }  
        sc.close();  
    }
}