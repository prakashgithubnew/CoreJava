package CoreJavaPractise.HandsOn.StringhandsOn;

public class DetermineVowelsInString {

    public static void main(String args[]){
        String str = "prakash";
        System.out.println(str.matches(".*[aeiou].*"));
        if(str.matches(".*[aeiou].*")){
        for(char ch:str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("vowel found==" + ch);
            }
        }
        }
    }
}
