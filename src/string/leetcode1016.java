package string;

public class leetcode1016 {
    public boolean queryString(String S, int N) {
        for(int i=1;i<=N;i++){
            String num=Integer.toBinaryString(i);
            if(!S.contains(num)){
                return false;
            }
        }
        return true;
    }
}
