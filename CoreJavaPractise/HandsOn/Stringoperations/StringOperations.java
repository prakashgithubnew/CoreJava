package CoreJavaPractise.HandsOn.Stringoperations;

public class StringOperations {
    public static void main(String[] args){
        String atr="prakash";
        atr="sharma";
        System.out.println(atr);
        String str2 = atr.concat("prakash");
        System.out.println(str2);

        // Equals Operations


        String string1 = "prakash1";
        String string2 = "prakash1";
        System.out.println("Euality Check via equals operator===="+(string1 == string2));

        String string3 = new String("prakash2");
        String string4 = new String("prakash2");
        String string6 = string3;
        String string5 = "prakash2";
        String string7 = string5;

        System.out.println("Euality Check via equals operator===="+(string3 == string4));
        System.out.println("Euality Check via equals operator111===="+(string3 == string5));
        System.out.println("Euality Check via equals operator===="+(string3 == string6));
        System.out.println("Euality Check via equals operator===="+(string5 == string6));
        System.out.println("Euality Check via equals operator===="+(string5 == string7));

        System.out.println("String Intern Operations");
        String string8 = new String("Vikas").intern();
        String string9 = "Vikas";
        System.out.println("Euality Check via equals intern operator===="+(string8==string9));



    }
}
