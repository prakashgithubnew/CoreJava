package CoreJavaPractise.HandsOn.IntegerHandsOn;

import java.util.Scanner;

public class CheckPrimeNumbers {

    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number to check");

        int number = myObj.nextInt();
        System.out.println(checkPrime(number));

    }

    private static String checkPrime(int number) {
        if(number == 0 || number == 1){
            return "Not a prime";
        }

        if(number==2){
            return "its a prime";
        }

        for(int n=2;n<number;n++){
            if(number%n == 0){
                return "Not a prime because its is divisible";
            }
        }
        return "it is a prime number";
    }
}
