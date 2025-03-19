**Time Complexity of sample programs**
--------------------------------------

Program 1
----------

public class Program1 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>(3);//O(1)
        list.add("a");//O(1)
        list.add("b");//O(1)
        list.add("c");//O(1)
        System.out.println(list.size());//O(1)
    }
}

Overall complexity is O(1)

If we make one Change to make size from 3 to 1 like below
List<String> list = new ArrayList<>(1);//O(1)
then adding more than 1 elements will need resize and then in that case would be O(n)

then over all complexity would be O(n)





 