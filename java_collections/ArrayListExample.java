// Backed by array
// fast get operaton
// Slow insert delete opeartion
// resizable


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> example = new ArrayList<>();

        // methods of java
        // add
        example.add("one");
        example.add("two");
        example.add("three");

        // remove
        example.remove(0);

        // get
        System.out.println("Print the first index "+ example.get(0));

        // size of arraylist
        System.out.println("Size of arraylist "+ example.size());

        // contains check if input is exist in arraylist or not
        boolean check = example.contains("three");
        System.out.println("exists " + check);

        // clear to remove all elements
        example.clear();

        System.out.println("checking if this realt works "+ example);
    }
}
