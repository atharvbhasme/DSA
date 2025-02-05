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
