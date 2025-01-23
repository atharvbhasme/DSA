package pattern;

import java.util.Scanner;

public class roatatedTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= 2*n-1; i++) {
            int star = i;
             if(i>n) star = 2*n-i;
             for(int j=1;j<=star;j++){
                 System.out.print("*");
             }
             System.out.println();
        }
        sc.close();
    }
}
