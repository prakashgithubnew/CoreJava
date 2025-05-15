package CoreJavaPractise.HandsOn.ArrayListHandsOn;

import java.util.Arrays;
import java.util.List;

public class SortingNumber {

    public static void main(String[] args){
        List<Integer> list= Arrays.asList(11,3,15,20,3,5);

        //Sorting useing java 8
        List<Integer> list2 = list.stream().sorted().toList();
        list2.forEach(System.out::println);

        //sorting using own logic
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println(list);
    }
}
