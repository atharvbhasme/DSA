# Arrays

1) Two Sum 
  Brute Force
  code
  ```java
  public static int[] twoSum(int[] arr, int k){
        int[] ans = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] ==  k){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }
  ```

  Better HashMap Solutions
  code
  ```java
  public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<>();
        ans[0] = ans[1] = -1;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(hs.containsKey(moreNeeded)){
                ans[0] = hs.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            hs.put(nums[i], i);
        }
        return ans;
    }
  ```

  Another two pointer approach but only work for if we want return true or false and array is needed to be sorted
  code
  ```java
  public int[] twoSum(int[] nums, int target) {
    int right = 0;
    int left = nums.length -1;
    Arrays.sort(nums);
    while(left < right){
        int sum = nums[right] + nums[left]
        if(sum == target){
            return true;
        }
        if(sum>target) right --;
        if(sum<target) left++;
    }
    return false;   
    }
  ```

2) Sort an array of 0s, 1s and 2s [code](Arrays_medium/code2.java)
   1) Brute Force Apporach
   Sort the array

   2) Better solution (Code is in my pattern)
   code
   ```java
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
   ```

3) Sort an array of 0s, 1s and 2s (DNF-Dutch National Flag algorithm) [code](Arrays_medium/code3.java)
    code
    ```java
     public static void sortZerosOnesTwos(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                mid++;
                low++;

            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
    ```
    Time Complexitiy: O(n)\
    Space Complexity: o(1)

4) Find the Majority Element that occurs more than N/2 times [code](Arrays_medium/code4.java)
    1) Brute Force method
    code
    ```java
     public static int findNumber(int[] arr){
        // Brute Force Method
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count >= arr.length/2){
                return arr[i];
            }
        }
        return 0;
    }
    ```

    max time complexity = O(n^2)\
    space complexity = O(1)

    2) Hash Array Method
    code
    ```java
     public static int findNumber(int[] arr){
        int n = arr.length;
        int[] hs = new int[n + 1];

        for (int i = 0; i < arr.length; i++) {
            hs[arr[i]] += 1;
        }
        System.out.println(Arrays.toString(hs));

        for (int i = 0; i < hs.length; i++) {
            if(hs[i] > n/2){
                return i;
            }
        }

        return 0;
    }
    ```

    Time Complexity: O(N*logN) + O(N), where N = size of the given array.\
    Space Complexity: O(N)

    3) Moores Voting algorithm
    code
    ```java
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
    ```
    Time Complexity: O(N) + O(N),-= O(N) where N = size of the given array.\
    Space Complexity: O(1)

    Moore’s Voting Algorithm is used to find the majority element in an array 

5) Kadane's Algorithm, maximum subarray sum [code](Arrays_medium/code4.java)
    1) Brute force

    2) Using Kaden Algirithm
    code
    ```java
     public static int findSumofMaxSubArray(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    ```
    **If you want to find the subarray instead of sum below code is IMP**

    code
    ```java
     public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
    ```

    Time Complexity: O(N)\
    Space Complexity: O(1)

6) Maximum Score from Subarray Minimums
   