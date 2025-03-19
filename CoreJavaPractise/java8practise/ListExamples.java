package CoreJavaPractise.java8practise;

import java.util.List;

public class ListExamples {

    public static void main(String[] args){
        List<String> list = List.of("a","b","c");
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
