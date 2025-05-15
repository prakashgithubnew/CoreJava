package CoreJavaPractise.HandsOn.ArrayListHandsOn;

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
    }
}
