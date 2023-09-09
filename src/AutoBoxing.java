import java.util.Arrays;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        int i = 10;
        Integer x = i ; // Autoboxing


        Integer k = new Integer(20);
        int j = k ; // Auto Unboxing

        List<Integer> numbers = Arrays.asList(10,20,30); // Autoboxing to Integer from int
        int number = numbers.get(0);  // AutoUnboxing from Integer to int.

    }
}
