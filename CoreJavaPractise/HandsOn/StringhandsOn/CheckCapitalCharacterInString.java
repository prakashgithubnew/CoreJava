package CoreJavaPractise.HandsOn.StringhandsOn;

import java.util.HashMap;
import java.util.Map;

public class CheckCapitalCharacterInString {

    static int upperCaseCount = 0;
    static int lowerCaseCount = 0;

    public static void main(String[] args) {
        String str = "PrakashHG";
        Map<Character, String> map = new HashMap<Character, String>();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                map.put(ch, "UpperCase");
                upperCaseCount++;
            } else {
                map.put(ch, "LowerCase");
                lowerCaseCount++;
            }
        }
        System.out.println("UpperCase Latters are =" + upperCaseCount);
        System.out.println("lowerCaseCount Latters are =" + lowerCaseCount);
    }
}
