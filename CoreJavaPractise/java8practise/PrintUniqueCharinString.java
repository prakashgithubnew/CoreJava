package CoreJavaPractise.java8practise;


import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharinString {

    public static void main(String[] args){
        String str = "prakash";
        Set<Character> hash_Set = new HashSet<Character>();

        //Print all char in string
        for(char ch: str.toCharArray()){
            System.out.println(ch);
        }

        //Print all unique char in string
        for(char ch: str.toCharArray()){
            hash_Set.add(ch);
        }
        System.out.println(hash_Set);

        //print length if longest substring with non-repeated char
        String str1 = "prakashi";
        Set<Character> set1 = new HashSet<Character>();
        for(int i=0;i<str1.length();i++){
            set1.add(str1.charAt(i));
        }
        System.out.println(set1);
    }

    //Longest Palindromic substring
    String str1 = "ababc";

}
