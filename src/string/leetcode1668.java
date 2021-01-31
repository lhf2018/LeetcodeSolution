package string;

public class leetcode1668 {
    public int maxRepeating(String sequence, String word) {
        int max=0;
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        while(sequence.contains(sb.toString())){
            sb.append(word);
            max++;
        }
        return max;
    }
    //动态规划
    public int maxRepeating2(String sequence, String word) {
        int[] arr=new int[sequence.length()+1];
        int len=word.length();
        int max=0;
        for(int i=len;i<=sequence.length();i++){
            if(sequence.substring(i-len,i).equals(word)){
                arr[i]=arr[i-len]+1;
                max=Math.max(max,arr[i]);
            }
        }
        return max;
    }
}
