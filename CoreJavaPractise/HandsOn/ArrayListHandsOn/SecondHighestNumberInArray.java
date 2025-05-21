package CoreJavaPractise.HandsOn.ArrayListHandsOn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class SecondHighestNumberInArray {

    public static void main(String[] args){
        int[] array = {1,2,3,5,6,7,8,0,18};
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int h:array){
            set.add(h);
        }
        set.stream().forEach(System.out::println);
        Iterator<Integer> descendingIterator = set.descendingIterator();
        descendingIterator.next();
        System.out.println("The second highest is=="+descendingIterator.next());

        //Second Highest in Java 8
        System.out.println("Second Highest Using Java 8==" + findSecondHighest(array));
    }

    public static int findSecondHighest(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .distinct() // Ensure distinct values
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(1) // Skip the highest value
                .findFirst() // Get the second highest
                .orElse(Integer.MIN_VALUE); // Return minimum value if no second highest exists
    }
}
