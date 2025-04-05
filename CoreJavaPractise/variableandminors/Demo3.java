package CoreJavaPractise.variableandminors;

public class Demo3 extends Demo2 {

    protected Demo3(){

    }
    public static void main(String[] args){

        int g='A';
        new Demo3().show22();
    }

    private void show22() {
        System.out.println(g);
    }

    @Override
    void show2() {

    }

    @Override
    void show1() {

    }
}
