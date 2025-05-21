package CoreJavaPractise.HandsOn.Stringoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrencesInStringExample {
    public static void main(String[] args){
        String input = "prakash";
        Map<Character, Long> charOccurrences = input.chars()
                .mapToObj(c -> (char) c)  // Convert each int to a char
                // Step 2: Group characters and count occurrences
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                // Step 3: Filter out characters with only one occurrence

        // Step 5: Output the result
        System.out.println("Characters Occurrences " + charOccurrences);

        //Count all characters in string

        String input2 = "Example";
        Map<Character, Long> duplicateChars2 = input2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println("Count of characters==="+duplicateChars2);
        System.out.println(findKeysWithDuplicateValues(duplicateChars2));


}

    public static List<String> findKeysWithDuplicateValues(Map<Character, Long> map) {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<Character, Long> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                keys.add(String.valueOf(entry.getKey()));
            }
        }
        return keys;
    }
}
