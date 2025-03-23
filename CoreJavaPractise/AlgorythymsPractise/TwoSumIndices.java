package CoreJavaPractise.AlgorythymsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumIndices {

    int target = 7;
    public static void main(String[] args) {
        int[] num = new int[]{3,1,4};
        List<Integer> list = new ArrayList<Integer>();
        //return the numbers which adds up to the target
        System.out.println(Arrays.toString(new TwoSumIndices().check(num)));

    }

    private int[] check(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i,j};
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
