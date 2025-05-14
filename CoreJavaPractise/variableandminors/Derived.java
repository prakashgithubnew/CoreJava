package CoreJavaPractise.variableandminors;

class Derived extends Base3 {
    private void fun() {
        System.out.println("Derived fun");
    }
    public static void main(String[] args) {
        Base3 obj = new Derived();
        //obj.fun(); //fun method is of type Base whose private method cannot be accessed outside
    }
}
