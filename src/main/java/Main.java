import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrForMapping = Arrays.asList("1", "abc", "2", "3");
        System.out.println(MapTask.mapping(arrForMapping));

        List<String> arrForFlatting = Arrays.asList("abc", "def", "ghj");
        System.out.println(FlattingTask.flattingStrings(arrForFlatting));

        System.out.println(FizzBuzzTask.fizzBuzzIt(100));

        List<String> arrForGrouping = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(GroupWordsTask.groupIt(arrForGrouping));

    }
}
