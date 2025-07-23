import java.util.*;

public class InterfaceVsImplementation {
    public static void main(String[] args) {
        // Using interface as reference type
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new LinkedList<>();
        list2.add("Carrot");
        list2.add("Date");

        System.out.println("ArrayList: " + list1);
        System.out.println("LinkedList: " + list2);
    }
}
