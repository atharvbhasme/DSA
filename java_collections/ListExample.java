import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> exmpale = new ArrayList<>();
        exmpale.add("one");
        exmpale.add("two");
        exmpale.add("three");// Duplicate

        System.out.println("Get the element"+ exmpale.get(1));
        System.out.println("Print whole list"+ exmpale);
    }
}
