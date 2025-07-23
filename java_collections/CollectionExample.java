import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();
        Collection<Integer> userIds = new LinkedList<>();
        Collection<String> setExample = new HashSet<>();
        
        fruits.add("Apple");
        userIds.add(1);

        System.out.println("-"+ fruits + "---" + userIds);
    }
}
