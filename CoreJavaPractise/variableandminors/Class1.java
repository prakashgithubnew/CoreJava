package CoreJavaPractise.variableandminors;

public class Class1 extends Base{


    public Class1() {
        System.out.println("Inside Class1 class default contructor");
    }

    public Class1(int g) {
        System.out.println("Inside Class1 class argument contructor");
    }
    public static void main(String args[]){
        Class1 class1 = new Class1(10);

    }

    public void fun() {
        System.out.println("Base fun");
    }



}
