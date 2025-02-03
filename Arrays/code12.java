package Arrays;
import java.util.Scanner;

public class code12 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findMissingNumber(arr, 6);
        System.out.println(ans);
        sc.close();
    }

    public static int findMissingNumber(int[] arr, int n){
        // Brute Force
        // for (int i = 1; i <= n; i++) {
        //     int flag = 0;
        //     for (int j = 0; j < n-1; j++) {
        //         if(arr[j] == i){
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0){
        //         return i;
        //     }
        // }
        // return -1;

        // Better Solution -> Use Hashing

        // prestore the data
        // int[] hs = new int[n + 1];
        // for (int i = 0; i <  arr.length; i++) {
        //     hs[arr[i]] += 1;
        // }

        // // fetch the data
        // for (int i = 1; i < n; i++) {
        //     if(hs[i] == 0){
        //         return i;
        //     }
        // }
        // return -1;

        // optimal solution
        // 1) Sum method
        int sumOfN = (n * (n + 1)) / 2;
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray = arr[i] + sumOfArray;
        }
        int ans = sumOfN - sumOfArray;
        return ans;
    }
}