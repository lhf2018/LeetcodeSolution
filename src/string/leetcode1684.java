package string;

public class leetcode1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr=new int[130];
        int res=0;
        for(char c:allowed.toCharArray()){
            arr[c]=1;
        }
        OUTER:
        for(String word:words){
            for(char c:word.toCharArray()){
                if(arr[c]==0){
                    continue OUTER;
                }
            }
            res++;
        }
        return res;
    }
}
