package CoreJavaPractise.HandsOn.java8practise.MultipleFiltersUsingPRedicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String []args){
        Consumer<String> stringConsumer = s->{
            if (!s.isEmpty()) {
                System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
            }
        };

        List list = Arrays.asList("java", "lambda", "consumer");
        list.forEach(stringConsumer);
    }
}
