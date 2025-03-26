package CoreJavaPractise.java8practise;

import java.util.ArrayList;
import java.util.List;

public class PassByRefExample {

    public static void main(String[] args){
       List list = new ArrayList<String>();
        list.add("prakash");
        new PassByRefExample().show(list);
        System.out.println(list);
    }

    private void show(List k) {
    k.remove("prakash");
    }
}
