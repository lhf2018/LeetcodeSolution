package dynamic_programming;

public class No5686 {
    public int[] minOperations(String boxes) {
        int[] res=new int[boxes.length()];
        int[] left=new int[boxes.length()];
        int[] right=new int[boxes.length()];
        int temp1=boxes.charAt(0)-'0';
        int temp2=boxes.charAt(boxes.length()-1)-'0';
        for(int i=1;i<boxes.length();i++){
            left[i]=left[i-1]+temp1;
            right[boxes.length()-1-i]=right[boxes.length()-i]+temp2;
            temp1+=boxes.charAt(i)-'0';
            temp2+=boxes.charAt(boxes.length()-i-1)-'0';
        }
        for(int i=0;i<res.length;i++){
            res[i]=left[i]+right[i];
        }
        return res;
    }
}
