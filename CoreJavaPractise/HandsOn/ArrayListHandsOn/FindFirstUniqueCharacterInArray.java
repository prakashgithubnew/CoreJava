package CoreJavaPractise.HandsOn.ArrayListHandsOn;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class FindFirstUniqueCharacterInArray {
    public static Character findFirstUniqueChar(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        String input = "iFollowMilindMehta";
        Character firstUnique = findFirstUniqueChar(input);
        System.out.println(firstUnique);
    }
}
