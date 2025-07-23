import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Red"); // Duplicate ignored
 
       System.out.println(colors); // [Red, Green] (order may vary)
    }
}
