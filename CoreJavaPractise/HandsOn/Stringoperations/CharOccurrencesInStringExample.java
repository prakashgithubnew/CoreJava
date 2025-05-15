package CoreJavaPractise.HandsOn.Stringoperations;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrencesInStringExample {
    public static void main(String[] args){
        String input = "prakash";
        Map<Character, Long> duplicateChars = input.chars()
                .mapToObj(c -> (char) c)  // Convert each int to a char
                // Step 2: Group characters and count occurrences
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                // Step 3: Filter out characters with only one occurrence
                .entrySet().stream()
                // Step 4: Collect the results into a Map
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        // Step 5: Output the result
        System.out.println("Duplicate Characters: " + duplicateChars);
    }
}
