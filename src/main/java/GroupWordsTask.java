import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    private static Map.Entry<String, Integer> transform(Map.Entry<Character, List<String>> el) {

        int count = 0;
        for (int i = 0; i < el.getValue().toArray().length; i++) {
//            System.out.println(el.getValue().toArray()[i]);
            for (int j = 0; j < el.getValue().toArray()[i].toString().length(); j++) {
//                System.out.println(el.getValue().toArray()[i].toString().charAt(j));
                if (el.getValue().toArray()[i].toString().charAt(j) == el.getKey()) {
                    count ++;
                }
            }
        }

        return new AbstractMap.SimpleEntry<String, Integer>(el.getKey().toString(), count);
    }

    public static Map<String, Integer> groupIt(List<String> arr) {
        Map<String, Integer> map = arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .map(GroupWordsTask::transform)
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()));


        return map;
    }
}
