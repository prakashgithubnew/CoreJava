package CoreJavaPractise.HandsOn.IntegerHandsOn;

public class NumberSwapWithOutUsingThirdVariable {

    public static void main(String args[]){

        int a=10,b=15;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}
