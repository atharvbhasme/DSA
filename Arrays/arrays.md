# Arrays
**Arrays is data strcuture which containts similar type of data of given length**

maximum length of array = 10^6 (Inside main function)
for gloabllay = 10^7


**While in interview, you should start with brute force -> better -> optimal solutions**


### Problmes

1) Find the Larget Element in array\
   
   Brute Force Apporach:
   Sort the arrya and find the last index element which will be largest

   Optimal Apporach:
   ```Java
   int max = arr[0]//assign max to frist element
   for(int i=0;i<arr.length;i++){
      if(arr[i]>=max){//check if element is larger than max or not
        max = arr[i] //if not then assign it to max
      }
   }
   return max;
   ```

2) Find the second largest element in array \
   Brute Force Apporach:
   Sort the array in asecnding order and find the second last element in array

   Optimal Apporach:
   ```java
   int largest = -1;
   int secondLargest = -1;
   for(int i=0;i<arr.length;i++){
    if(arr[i]>largest){
        secondlargest = largest;
        largest = arr[i]
    }else if(arr[i]>secondLargest && arr[i]<largest){
        secondLargest = arr[i];
    }
   }
   return secondLargest;
   ```

3) Check if array is sorted or not\
   Brute Force Apporach
   ```java
   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i])
          return false;
      }
    }

    return true;
   ```

   Optimal Apporach
   ```java
   for (int i = 0; i < n-1; i++) {
    if(arr[i]>arr[i+1]){
        return false;
    }
   }
   return true;
   ```


4) Remove the duplicate from sorted array \
   Brute Force Apporach (Will take more time and space)
   ```java
   HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
   ```

   Optimal Apporach [Code](Arrays/removeDuplicate.java)
   ```java
   int i = 0;
   for(int j=0;j<arr.length;j++){
    if(arr[i]!=arr[j]){
        i++;
        arr[i] = arr[j];
    }
   }
   return i+1; //this will return the index with array that are not asorted see code for better understading 
   ```

5) Left Rotate array by one place [code](Arrays/code5.java)\
   Optimal Apporach
   ```java
   public static void leftRotate(int[] arr){
        int n = arr.length;
        if(n==1|| n==0) return ; //egde cases
        int lastElement = arr[n-1]; // assign last element
        for (int i = n -1; i >= 0; i--) {
            if (i == 0) {//check for last element
                arr[i] = lastElement;
            } else {
                arr[i] = arr[i-1]; // or assign the next element
            }
        }
    }
   ```

6) Reverse Array [Code](Arrays/code7.java)\
   Optimal Apporach
   ```java
    public static void reverseArray(int[] arr){
        int start = 0; // take start element
        int end = arr.length -1; // take end element
        while(start<=end){//if start is greater than end then exit the loop
            int temp = arr[start]; //swap the start element with end element
            arr[start] = arr[end];
            arr[end] = temp;
            start++; //increase start by one
            end--; //decrease the end by one
        }
    }
   ```


7) Rotate the array to left by k elements [code](Arrays/code6.java) \
   brute force apporach (Using a temp array)
   steps:
   1. Copy the last k elements into the temp array.
   2. Shift n-k elements from the beginning by k position to the right
   3. Copy the elements into the main array from the temp array.
   code 
   ```java
   public static void Rotatetoright(int[] arr, int n, int k) {
    if (n == 0) 
      return;
    k = k % n;  //if given number is freater than length of array
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = arr[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      arr[i + k] = arr[i];
    }
    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }
   }
   ```

   Optimal Apporach
   steps:
   1. Reverse the last k elements of the array
   2. Reverse the last n-k elements of the array.
   3. Reverse the whole array.
   code
   ```java
    public static void leftRotateByK(int[] arr, int k){
        int n = arr.length;
       reverseArray(arr, 0, k -1);
       reverseArray(arr, k, n-1);
       reverseArray(arr, 0, n-1);
    }
   ```

   For right rotate
   steps
   1. Reverse the whole array
   2. reverse the o to k-1 element array
   3. reverse the k to n-1 element array
   code
   ```java
   public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || n == 1 ) return;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k -1);
        reverse(nums, k, n -1);
    }
   ```

8) Move zeros to end [code](Arrays/code8.java)\
   Brute Force
   steps
   1. move all non zero elements in arraylist
   2. replace all array element with arraylist elelemt until size of arralist
   3. assign all remanaing array element with 0.
   code
   ```java
   public static void moveZeroToEnd(int[] arr){
        ArrayList<Integer> nonZero = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                nonZero.add(arr[i]);
            }
        }

        int listSize = nonZero.size();
        for (int i = 0; i < arr.length; i++) {
            if(i<listSize){
                arr[i] = nonZero.get(i);
            }else{
                arr[i] = 0;
            }
        }
    }
   ``` 
   Time Complexity = O(n + n) = O(n) \
   Space Complexity = O(n) as we are taking extra arraylist

   optimal apporach (Two Pointer approach)
   steps
   1. Find the first zero element and assign one pointer to it.
   2. Then find pointer + 1 to n-1 and swap it with non zero element 
   code
   ```java
   public static void moveZeroToEnd(int[] arr){
        // Two Pointer appraoch
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == 0){
                i = j;
                break; // Don't Fogot the break
            }
        }
        
        if(i == -1) return;

        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
   ```

9) Find the frist occurrence of element in array [code](Arrays/code9.java)\
   code
   ```java
   public static int findOccurrence(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
   ```

10) Union of two sorted arrays (Only return distinct element from both arrays) [code](Arrays/code10.java)\
    Brute Force Approach
    1. use set to store array element of both arrays
    2. then use add those set element to ans aray
    ```java
     public static Integer[] unionArrays(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        int m = arr1.length;
        int n = arr2.length;
        for (int i = 0; i < m; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            hs.add(arr2[i]);
        }
        Integer[] ans = hs.toArray(new Integer[0]);
        return ans;
    }
    ```
    Time Compleixty : O( (m+n)log(m+n) )\
    Space Complexity : O(m+n)

    Optimal Solution (Two Pointer)
    code
    ```java
    public static int[] unionArrays(int[] arr1, int[] arr2){
        // Two Pointer method
        int i = 0;
        int j = 0;
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i<n1 && j<n2){ // it is similiar to merge sort pattern
            if(arr1[i] <= arr2[j]){
                if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr1[i]){
                    ansList.add(arr1[i]);
                }
                i++;
            }else{
                if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr2[j]){
                    ansList.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n1) {
            if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr1[i]){
                ansList.add(arr1[i]);
            }
            i++;
        }

        while (j<n2) {
            if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr2[j]){
                ansList.add(arr2[j]);
            }
            j++;
        }

        int[] ans = new int[ansList.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = ansList.get(k);
        }
        return ans;
    }
    ```
    Time Complexity: O(m+n)\
    Space Complexity : O(m+n)


11) Intersection of two Arrays [code](Arrays/code11.java)\
   better solution
   ```java
   public static int[] intersectionArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]){
                if(arr1[i] == arr2[j]){
                    ansList.add(arr1[i]);
                }
                i++;
            }else{
                if(arr1[i] == arr2[j]){
                    ansList.add(arr2[j]);
                }
                j++;
            }
        }

        int[] ans = new int[ansList.size()];
        for (int index = 0; index < ansList.size(); index++) {
            ans[index] = ansList.get(index);
        }
        return ans;
    }
   ```

   optimal solution\
   code
   ```java
     public static ArrayList < Integer > intersectionOfArrays(int[] A, int[] B) {
        // Declare ans array.
        ArrayList < Integer > ans = new ArrayList < > ();
        int i = 0, j = 0;
        // to traverse the arrays
        while (i < A.length && j < B.length) {
            //if current element in i is smaller
            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                //both elements are equal
                ans.add(A[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
   ```

12) Find the missing numbers if givien array of n numbers. [code](Arrays/code12.java)\
  Brute Force
  code
  ```java
  public static int findMissingNumber(int[] arr, int n){
        // Brute Force
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
  ```
  Time Complexity: O(n^2)\

  Better Solution
  code
  ```java
   public static int findMissingNumber(int[] arr, int n){
        // Better Solution -> Use Hashing
        // prestore the data
        int[] hs = new int[n + 1];
        for (int i = 0; i <  arr.length; i++) {
            hs[arr[i]] += 1;
        }

        // fetch the data
        for (int i = 1; i < n; i++) {
            if(hs[i] == 0){
                return i;
            }
        }
        return -1;
    }
  ```
  Time Complexity: O(n+n) ~= O(n)
  Space Complexity: O(n) 

  Optimal Solution \
  There will be two optimal solutions
  1) Sum method
  code
  ```java
   public static int findMissingNumber(int[] arr, int n){
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
  ```

  2) XOR method (Bit manupulation watch when bit manipulation videos)

  3) Also I think there is another cyclic array method watch kunal kushwaha cyclic array video of java

13) Count Maximum Consecutive One's in the array [code](Arrays/code13.java)\
  Optimal Apporach
  code
  ```java
  public static int findConsecutiveOne(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
  ```

14) Find the number that appears once, and the other numbers twice [code](Arrays/code14.java)\
   1) Hash apporach for non negative numbers
   code
   ```java
   int n = arr.length;
        int[] hs = new int[n + 1];
        // pre store
        for (int i = 0; i < n; i++) {
            hs[arr[i]] += 1;
        }

        int ans = 0;
        for (int i = 0; i < hs.length; i++) {
            if (hs[i] == 1) {
                ans = i;
            }
        }
        return ans;
    }
   ```

   2) Hash Apporach for negative numbers also
   code
   ```java
   public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element that appears only once
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1; // Should never reach here for valid input
    }
   ```

   3) XOR apporach (Learn bit manipulation)
   code
   ```java
    int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicates
        }
        return result;
   ```

15) Longest Subarray with given Sum K(Positives) [code](Arrays/code15.java)\
   Brute Force
   code
   ```java
    public static int findLogestSubArray(int[] arr, int k){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxSum = 0;
            for (int j = i; j < arr.length; j++) {
                maxSum += arr[j];
                if(maxSum == k){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
        
    }
   ```

   Better HashMap
   code
   ```java
   public static int findLogestSubArray(int[] arr, int k){
        HashMap<Integer, Integer> hs = new HashMap<>();
        int len = 0;
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                len = Math.max(len, i+1);
            }

            int rem = sum - k;

            if(hs.containsKey(sum)){
                int currentLen = i - hs.get(rem);
                len = Math.max(len, currentLen);
            }

            if(!hs.containsKey(rem)){
                hs.put(sum, i);
            }
        }
        return len;
    }
   ```

   Optimal Solution Two pointer method (but does not handle negative numbers)
   code
   ```java
   public static int findLogestSubArray(int[] arr, int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;
        while(right<arr.length){
            sum += arr[right];
            
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++; 
        }
        return maxLen;
    }
   ```