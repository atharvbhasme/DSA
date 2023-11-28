import java.util.Scanner;
import java.io.*;

public class nforest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 0; i <= in; i++) {
            for(int j=0; j <= in; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}