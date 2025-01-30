# Arrays
**Arrays is data strcuture which containts similar type of data of given length**

maximum length of array = 10^6 (Inside main function)
for gloabllay = 10^7


**While in interview, you should start with brute force -> better -> optimal solutions**


### Problmes

1) Find the Larget Element in array
   
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

2) Find the second largest element in array
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

3) Check if array is sorted or not
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


4) Remove the duplicate from sorted array
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

5) Left Rotate array by one place [code](Arrays/code5.java)
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

6) Rotate Arrays to left by K places
   