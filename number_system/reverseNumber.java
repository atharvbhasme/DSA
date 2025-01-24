package number_system;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int num2 = 0;;
        while(x>0){
            int digit = x % 10;
            num2 = (num2 * 10) + digit;
            x = x/10;
        }
        System.out.println("reversed number is "+ num2);

        sc.close();
    }
}