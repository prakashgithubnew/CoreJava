package CoreJavaPractise.HandsOn.variableandminors;

public class VariablePrograms {
    int a=11;

    public static void main(String[] args){
        VariablePrograms variablePrograms = new VariablePrograms();
        variablePrograms.a=20;
        variablePrograms.show();
        System.out.println(variablePrograms.a);


    }

    private void show() {
        show1();

    }

    private void show1() {
        VariablePrograms variablePrograms = new VariablePrograms();
        System.out.println(a);
    }
}
