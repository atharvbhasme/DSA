package Arrays_medium;

public class code5 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = findSumofMaxSubArray(arr);
        System.out.println(ans);
    }    

    public static int findSumofMaxSubArray(int[] arr){
        // Brute Force Solutions
       int sum = 0;
       int maxi = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];

           if(sum > maxi){
              maxi = sum;
           }

           if (sum < 0) {
            sum = 0;
        }
       }

       return sum;
    }
}

// Brute Force Solutions
// int maxSum = 0;
// int n = arr.length;
// for (int i = 0; i < n; i++) {
//     int sum = 0;
//     for (int j = i; j < n; j++) {
//         sum += arr[j];
//         maxSum = Math.max(maxSum, sum);
//     }
// }
// return maxSum;
