package array;

/**
 * 使用变量end表明之前的中毒状态结束的时间，判断下一次的攻击是否在中毒状态中，分别做不同的算术
 */
public class leetcode495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0)return 0;
        int end=timeSeries[0]+duration;
        int res=duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]<end){
                res+=timeSeries[i]+duration-end;
            }else{
                res+=duration;
            }
            end=timeSeries[i]+duration;
        }
        return res;
    }
}
