package CoreJavaPractise.Stringoperations;

public class MiscString {
    public static void main(String[] strings){

        //Index of example
        String mainString = "prakash";
        String subString = "kash";
        System.out.println(mainString.indexOf(subString));
        System.out.println(mainString.indexOf(subString,0));
        System.out.println(mainString.indexOf(subString,4));
        System.out.println(mainString.indexOf(subString,1));
        System.out.println("=====================");
        //LastIndex of example
        String mainString2 = "prakash";
        String subString2 = "kash";
        System.out.println(mainString2.lastIndexOf(subString2));
        System.out.println(mainString2.lastIndexOf(subString2,0));
        System.out.println(mainString2.lastIndexOf(subString2,4));
        System.out.println(mainString2.lastIndexOf(subString2,1));

    }
}
