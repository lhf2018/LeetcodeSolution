package backtracking;

/**
 * 使用回溯和递归，只有在满足条件的情况下才会继续递归
 */
public class leetcode526 {
    private int result=0;
    private boolean[] used;
    public int countArrangement(int N) {
        used=new boolean[N+1];
        helper(N,1);
        return result;
    }
    //index是第index位数字
    private void helper(int N, int index){
        if(index>N){
            result++;
            return;
        }
        for(int i=1;i<=N;i++){
            if(!used[i]&&(i%index==0||index%i==0)){
                used[i]=true;
                helper(N,index+1);
                used[i]=false;
            }
        }
    }
}
