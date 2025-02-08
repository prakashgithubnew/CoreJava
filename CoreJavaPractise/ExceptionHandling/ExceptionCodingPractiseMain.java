package CoreJavaPractise.ExceptionHandling;

import java.io.IOException;

public class ExceptionCodingPractiseMain {

    public static void main(String[] args){
        try {

            System.out.println("In try block");
            throw new IOException("eeee");
        }
        catch(IOException e){

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("In finally Block");
        }
    }
}
