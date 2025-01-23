package recursion;
import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = 0;

        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        reverseArrayP(arr);
        sc.close();
    }

    public static void helper(int arr[], int fristCounter,int secondCounter, int[] resultArr){
        if(fristCounter < arr.length){
            resultArr[fristCounter] = arr[secondCounter];
            helper(arr, fristCounter + 1, secondCounter -1, resultArr);
        }
        return;
    }

    public static void reverseArrayP(int arr[]) {
        // code here
        int[] resultArr = new int[arr.length];
        int fristCounter = 0;
        int secondCounter = arr.length - 1;
        helper(arr,fristCounter ,secondCounter, resultArr);
        System.out.println(Arrays.toString(resultArr));
    }
}
