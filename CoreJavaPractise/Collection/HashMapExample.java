package CoreJavaPractise.Collection;

import java.util.HashMap;
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

    }
}
