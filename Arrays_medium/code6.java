package Arrays_medium;

public class code6 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        int ans = findSumofMaxSubArray(arr);
        System.out.println(ans);
    }    

    public static int findSumofMaxSubArray(int[] arr){
      int i = 0;
      int j = 1;
      int sum = 0;
      int n = arr.length;
      int maxi = Integer.MIN_VALUE;
      while(j<n){
        sum = arr[i] + arr[j];
        maxi = Math.max(sum, maxi);
        i++;
        j++;
      }
      return maxi;
    }
}
