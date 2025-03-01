package Arrays_medium;

// import java.util.Arrays;

// import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of the array: ");
        // int s = sc.nextInt();

        int[] arr = {4,4,2,4,3,4,4,3,2,4};

        // System.out.println("Enter the elements of the array: ");
        // for (int i = 0; i < s; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int ans = findNumber(arr);
        System.out.println(ans);
        // sc.close();
    }

    public static int findNumber(int[] arr){
       int ele = -1;
       int cnt = 0;
       int n = arr.length;
       for (int i = 0; i < n; i++) {
         if(cnt == 0){
            cnt = 1;
            ele = arr[i];
         }else if(ele == arr[i]){
            cnt++;
         }else{
            cnt--;
         }
       }
       int maxcnt = 0;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i] == ele){
            maxcnt++;
        }
       }
       if(maxcnt > n/2){
        return ele;
       }else{
        return -1;
       }
    }
}


// Brute Force Method
// for (int i = 0; i < arr.length; i++) {
//     int count = 0;
//     for (int j = i; j < arr.length; j++) {
//         if(arr[i] == arr[j]){
//             count++;
//         }
//     }
//     if(count >= arr.length/2){
//         return arr[i];
//     }
// }
// return 0;


//hash array solution
// int n = arr.length;
// int[] hs = new int[n + 1];

// for (int i = 0; i < arr.length; i++) {
//     hs[arr[i]] += 1;
// }
// System.out.println(Arrays.toString(hs));

// for (int i = 0; i < hs.length; i++) {
//     if(hs[i] > n/2){
//         return i;
//     }
// }

// return 0;