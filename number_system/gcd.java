package number_system;

import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        while(num1> 0 && num2 > 0){
            if(num1>num2){
                num1 = num1%num2;
            }else{
                num2 = num2%num1;
            }
        }
        if(num1 == 0){
            System.out.println(num2);
        }else{
            System.out.println(num1);
        }
        sc.close();
    }
}