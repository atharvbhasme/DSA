package Arrays_medium;

import java.util.Arrays;
import java.util.Scanner;

public class code2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        sortZerosOnesTwos(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void sortZerosOnesTwos(int[] arr){
        int findZeros = 0;
        int findOnes = 0;
        int findTwos = 0;
        int pointer = 0;
        int n = arr.length;
        while(findZeros<n){
            if(arr[findZeros] == 0){
                int temp = arr[findZeros];
                arr[findZeros] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
            findZeros++;
        }
        findOnes = pointer;
        while (findOnes < n) {
            if (arr[findOnes] == 1) {
                int temp = arr[findOnes];
                arr[findOnes] = arr[pointer];
                arr[pointer] = temp;
                pointer ++;
            }
            findOnes++;
        }
        findTwos = pointer;
        while (findTwos < n) {
            if(arr[findTwos] == 2){
                int temp = arr[findTwos];
                arr[findTwos] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
            findTwos++;
        }
    }
}