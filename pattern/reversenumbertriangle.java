package pattern;

import java.util.Scanner;

public class reversenumbertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
         }
         sc.close();
    }
}
