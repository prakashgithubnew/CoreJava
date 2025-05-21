package CommonHandsOn;

public class Sam implements Interface2,Interface1{

    public static void main(String[] args){

    }

    @Override
    public void show() {
        Interface1.super.show();
    }
}
