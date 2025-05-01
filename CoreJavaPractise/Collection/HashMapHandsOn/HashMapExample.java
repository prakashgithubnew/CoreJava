package CoreJavaPractise.Collection.HashMapHandsOn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four1");
        map.put("Null","four3");
        //Simple Interation of Map elements
        map.forEach((key,value)->{
            System.out.println("key-"+key+"-and-value-"+value);
        });

        //Check if any specific key exist then print its value
        map.forEach((key,value)->{
            if(key.equals("3")){
                System.out.println(value);
            }
        });

        // Put new key if does not exist
        map.putIfAbsent("5", "five");
        map.forEach((key,value)->{
            System.out.println("key-"+key+"-and-value-"+value);
        });

        System.out.println("Iteration elements");
        map.entrySet().stream()
                .forEach(System.out::println);

        //Append each value in hashmap by 10
        HashMap<String, Integer> map1 = new HashMap<>() {{
            put("apple", 1);
            put("banana", 2);
        }};

        map1.forEach((key, value)-> {
            System.out.println("key-" + key + "-and-value-" + (value+10));
        });

        System.out.println(map1.containsKey("apple"));
        System.out.println(map1.containsValue(1));

        //delete specific key from hashmap
        if(map1.containsKey("apple")){
            map1.remove("apple");
        }

        map1.forEach((key, value)-> {
            System.out.println("key-" + key + "-and-value-" + (value+10));
        });

        //Identify if there is any duplicate value exist for any key then display key of it.
        Map<String, Integer> map2  = new HashMap<String, Integer>(){{
            put("one",1);
            put("two",2);
            put("three",1);
            put("four",4);
            put("five",5);
        }};
        Map<String, Integer> map3  =new HashMap<String, Integer>();

        for(Integer i:map2.values()){
            map3.put(String.valueOf(i),map3.getOrDefault(String.valueOf(i), 0)+1);
        }
        map3.forEach((key,value)->{
            System.out.println("key-" + key + "-and-value-" + value);
        });
        List<Integer> list = map3.values().stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list.get(0));
    }
}
