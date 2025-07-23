import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 90);
        marks.put("Bob", 85);

        System.out.println(marks.get("Bob")); // 85

    }
}
