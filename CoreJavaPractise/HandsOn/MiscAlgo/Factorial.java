package CoreJavaPractise.HandsOn.MiscAlgo;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorial {

    public static void main(String args[]){
        int g=5,factorial=1;
        //Legacy way to dtermine the factorial
        for(int h=g;h>0;h--){
            factorial=factorial*h;
        }
        System.out.println(factorial);
        //Functional way to determine the factorial
        System.out.println(LongStream.rangeClosed(1,g).reduce(1,( k,  h)->k*h));

        //Functional way to add up all the numbers of target number.
        
        System.out.println(LongStream.rangeClosed(2,g).reduce(1,( k,  h)->k+h));
        //Prints all number by range
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        //Print square of each number in a range

        IntStream.rangeClosed(1,10).forEach(x->System.out.println(x*x));

    }





}