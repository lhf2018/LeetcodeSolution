package string;

public class leetcode1111 {
    /**
     * 方法一：第一遍遍历求最大深度，第二遍遍历深度大于最大深度一半的赋给B，小于最大深度一半的赋给A
     * @param seq
     * @return
     */
    public int[] maxDepthAfterSplit1(String seq) {
        int deep=0;
        int len=seq.length();
        int[] answer=new int[len];
        int max=0;
        for(int i=0;i<len;i++){
            if(seq.charAt(i)=='('){
                deep++;
            }else{
                deep--;
            }
            max=Math.max(deep,max);
        }
        max=max/2;
        deep=0;
        for(int i=0;i<len;i++){
            if(seq.charAt(i)=='('){
                deep++;
                if(deep<=max){
                    answer[i]=0;
                }else{
                    answer[i]=1;
                }
            }else{
                if(deep<=max){
                    answer[i]=0;
                }else{
                    answer[i]=1;
                }
                deep--;
            }

        }
        return answer;
    }

    /**
     * 方法二：奇数层赋给B，偶数层赋给A
     * @param seq
     * @return
     */
    public int[] maxDepthAfterSplit(String seq) {
        int deep=0;
        int len=seq.length();
        int[] answer=new int[len];
        for(int i=0;i<len;i++){
            if(seq.charAt(i)=='('){
                deep++;
                answer[i]=deep%2;
            }else{
                answer[i]=deep%2;
                deep--;
            }
        }
        return answer;
    }
}
