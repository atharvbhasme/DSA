package Arrays;
import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to find");
        int k = sc.nextInt();
        int ans = findOccurrence(arr, k);
        System.out.println(ans);
        sc.close(); 
    }

    public static int findOccurrence(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
