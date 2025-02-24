package CoreJavaPractise.Stringoperations;

public class StringReverse {
    public static void main(String[] args){
        //Using String
        String str1 = "prakash";
        char cha1;
        String atr1="";
        for (int i = 0; i < str1.length(); i++) {
            cha1=str1.charAt(i);
            atr1 = cha1 + atr1;
        }
        System.out.println("Concatenating the string "+ atr1);

        //using String Builder
        StringBuilder str2 = new StringBuilder("prakash");
        System.out.println("Concatenating the string builder "+ str2.reverse());
    }
}
