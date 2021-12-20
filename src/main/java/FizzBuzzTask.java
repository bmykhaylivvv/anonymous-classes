import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<Object> fizzBuzzIt(int n) {
        return IntStream.range(1, n).mapToObj(x -> {
            if (x % 15 == 0) {
                return "Fizz Buzz";
            } else if (x % 3 == 0) {
                return "Fizz";
            } else if (x % 5 == 0) {
                return "Buzz";
            } else {
                return x;
            }
        }).collect(Collectors.toList());
    }
}
