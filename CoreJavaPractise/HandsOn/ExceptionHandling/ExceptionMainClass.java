package CoreJavaPractise.HandsOn.ExceptionHandling;

public class ExceptionMainClass {
    public static void main(String[] args)  {
        int i=10;

        try {
            if (i == 10) {
                throw new WrongFileNameException("sing");
            }
        }
        catch(WrongFileNameException d){
           System.out.println("Invaid value");
        }
    }
}
