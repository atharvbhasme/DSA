package number_system;

import java.util.Scanner;

public class countTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int copy = n;
        while(n>0){
            int digit = n%10;
            if(digit == 0){
                n = n/10;
                continue;
            }
            if(copy % digit == 0){
                count ++;
            }
            n = n/10;
        }
        sc.close();
    }
}
