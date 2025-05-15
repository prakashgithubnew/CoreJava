package CoreJavaPractise.HandsOn.ExceptionHandling;

public class ChildA extends ParentA{

    public void show() {

        System.out.println("Child A show method");
    }

    public static void main(String[] args) throws Exception {

        new ChildA().show();
    }
}
