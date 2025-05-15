package CoreJavaPractise.HandsOn.StringhandsOn;

public class RemoveSpaceFromString {
    public static void main(String args[]){
        String str = "prakash sharma";
        StringBuffer str1 = new StringBuffer();
        for(char ch:str.toCharArray()) {
            if(ch==' '){
            } else {
                str1.append(String.valueOf(ch));
            }
        }
        System.out.print(str1);
    }
}
