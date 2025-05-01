package CoreJavaPractise.Collection.MiscAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MinCoinsForPurchase {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        int purchase = 9;
        List<Integer> sortedList = list.stream().distinct().sorted(Comparator.reverseOrder()).
                collect(toList());
        System.out.println(sortedList);
        for(int j=0;j<sortedList.size();j++) {
            for (int x = j+1; x < sortedList.size(); x++) {
                if (sortedList.get(j) + sortedList.get(x) == purchase) {
                    System.out.println("The elements are=" + sortedList.get(j) + " = & =" + sortedList.get(x));
                    break;
                } else {
                    continue;
                }
            }
            break;
        }

        ////another way

        IntStream.range(0, list.size())
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, list.size())
                        .filter(j -> list.get(i) + list.get(j) == purchase)
                        .mapToObj(j -> "(" + list.get(i) + ", " + list.get(j) + ")"))
                .forEach(System.out::println);
    }
}
