import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {
        return arr.stream().filter(x -> x.matches("\\d+")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
    }
}
