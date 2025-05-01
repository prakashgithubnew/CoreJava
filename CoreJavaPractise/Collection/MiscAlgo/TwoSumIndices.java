package CoreJavaPractise.Collection.MiscAlgo;

import java.util.*;

public class TwoSumIndices {

    int target = 9;
    public static void main(String[] args) {
        int[] num = new int[]{3,1,4,5,6,9};
        List<Integer> list = new ArrayList<Integer>();
        System.out.println(Arrays.toString(new TwoSumIndices().check2(num)));

    }

    /**
     * Time complexity is O(n^2) due to nested loops
     * @param num
     * @return
     */
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

    /**
     * Optimized way to reduce time complexity to O(n)
     */

    private int[] check2(int[] num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement=target-num[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(num[i],i);
        }
        return null;
    }
}
