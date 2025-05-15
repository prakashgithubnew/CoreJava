package CoreJavaPractise.HandsOn.ArrayListHandsOn;

public class Check2ArraysContainSameElements {
    public static void main(String[] args){
        int[] array1 ={1,2,3,4};
        int[] array2 ={1,2,3,4,5};
        if(array1.length == array2.length){
            for(int i=0;i<array1.length;i++){
                if(array1[i]==array2[i]){
                    continue;
                } else {
                    return;
                }
            }
            System.out.println("Arrays are same");
        }
        System.out.println("Arrays are not same");
    }
}
