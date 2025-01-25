package number_system;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                count++;
                if(num / i != i){
                    count = count + 1;
                }
            }
        }
        if(num == 2){
            System.out.println(true);
        }
        if(count == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close();
    }
}
