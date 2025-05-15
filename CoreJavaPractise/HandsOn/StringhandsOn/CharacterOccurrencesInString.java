package CoreJavaPractise.HandsOn.StringhandsOn;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrencesInString {

    /** Count each character occurrences in the string
     * Total Time Complexity of this program is O(n) because one for loop is
     * O(n) and another iterate over elements is O(n) whcih is total O(n)
     * @param args
     */
    public static void main(String[] args){
        String atr = "prakash";
        Map<Object, Integer> map = new HashMap<Object, Integer>();
        //Count occurrence of char in the string
        //Efficient one
        for(char ch:atr.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        map.forEach((key,value)->{
            System.out.println(key+"===="+value);
        });

    }

}
