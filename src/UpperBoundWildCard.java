import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCard {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,20,30);
        List<Double> doubles = Arrays.asList(1.0,2.0,3.0);
        printNumbers(integers);
        printNumbers(doubles);
    }
    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
    }
}
