package CoreJavaPractise.Collection.IntegerHandsOn;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        int k=0,h=1,g;
        System.out.println(k);
        System.out.println(h);
        for(int j=1;j<targetNumber;){
            g=k+h;
            System.out.println(g);
            k=h;
            h=g;
            j++;
        }
    }
}
