#### What is Hashing
it is nothing but the combination of the steps, pre-storing, and fetching.

#### Problems that are require hashing
- Number that are appears in array how many time ?
- Characters appears in string ?

#### Hashing 

We will assign the hashing array to number and increase it value if it appears again

**code**
```
import java.util.*;

class tUf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}
```

##### Character Hashing 
We are using ASCII
ASCII is a 7-bit character set containing 128 characters.
It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.
The character sets used in modern computers, in HTML, and on the Internet, are all based on ASCII.

case 1: If string contains only lower case character
 corresponding value = given character - 'a'

For example, if the given character is ‘f’, we will get the value as (‘f’ - ‘a’) = (102-97) = 5.  Here, we can easily observe that the maximum value can be 25.

```
  // s is giver array
 char[] hash = new char[26];
        for (int i = 0; i < n; i++) {
            hash[s[i] - 'a'] += 1;
        }
```

case 2: Array contains only uppercase letters
we will make hash array of size 256

```
//precompute:
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
```

