import java.util.Arrays;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Name 1", "Name 2");
        printList(names);
        List<Integer> numbers = Arrays.asList(0,1,2,3,4,5);
        printList(numbers);
    }

    private static void printList(List<?> list) {
        list.forEach(System.out::println);
//        list.add(6); // This will not work, because compiler will not be sure about the type.
//        list.add("Name 3"); // This will not work
    }
}
