package CoreJavaPractise.HandsOn.Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String args[]){
        //Sorting a hashmap
        Map<String, Integer> hashMap  = new HashMap<String, Integer>() {{
            put("z", 1);
            put("a", 0);
            put("c", 2);
        }};

        hashMap.forEach((key,value)->{
            System.out.println(key+" "+value);
        });


        //Treemap sorting by keys
        Map<String, Integer> treeMap  = new TreeMap<String, Integer>();

        treeMap.putAll(hashMap);

        treeMap.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

        //Sorting Hashmap by value
        //new HashMapExample().SortHashMapByValue(hashMap);

    };


}
