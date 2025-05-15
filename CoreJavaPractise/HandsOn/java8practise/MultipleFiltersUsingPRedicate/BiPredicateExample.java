package CoreJavaPractise.HandsOn.java8practise.MultipleFiltersUsingPRedicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // BiPredicate that checks if sum of two numbers is greater than 10
        BiPredicate<Integer, Integer> isSumGreaterThan10 = (a, b) -> (a + b) > 10;

        // Test cases
        System.out.println(isSumGreaterThan10.test(5, 6)); // true
        System.out.println(isSumGreaterThan10.test(4, 5)); // false
    }
}
