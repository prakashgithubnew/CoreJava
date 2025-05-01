package CoreJavaPractise.Collection;


import java.util.Set;

public class SetExample {

    public static void main(String[] args){
        Set<String> set = Set.of("California", "Chicago", "New York");
        //iterate each elements of Set
        set.stream().forEach(System.out::println);
    }
}
