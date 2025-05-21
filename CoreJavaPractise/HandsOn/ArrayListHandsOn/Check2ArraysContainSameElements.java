package CoreJavaPractise.HandsOn.ArrayListHandsOn;

import java.util.stream.IntStream;

public class Check2ArraysContainSameElements {
    public static void main(String[] args){
        int[] array1 ={1,2,3,4,6};
        int[] array2 ={1,2,3,4,5};
        //Comparing using Java 8 features
        boolean b = IntStream.range(0,array2.length).allMatch(i->array1[i]==array2[i]);
        System.out.println("Arrays after comparing using java 8 features is-"+b);


    }
}
