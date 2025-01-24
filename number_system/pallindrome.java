package number_system;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int num1 = x;
        int num2 = 0;;
        while(x>0){
            int digit = x % 10;
            num2 = (num2 * 10) + digit;
            x = x/10;
        }
        System.out.println(num2);
        if(num2 == num1){
            System.out.println("true");
        }else{
            System.out.println("false");
        } 
        sc.close();
    }
}