package CoreJavaPractise.HandsOn.variableandminors;

public class MethodOverridingProgram extends Parent{

    public static void main(String[] args){
        show();
    }

    public static void show(){
        System.out.println(new MethodOverridingProgram().h);
        System.out.println("Inside Show method in Child");
    }
}
