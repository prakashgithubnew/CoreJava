package CoreJavaPractise.IntegerOperations;

public class IntegerReverse {
    public static void main(String args[]) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}
