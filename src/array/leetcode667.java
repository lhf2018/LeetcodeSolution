package array;

/**
 * 思路
 *
 * 1.首尾各设置一个指针，再设置一个数组的指针
 * 2.从首末两端依次取值，取k个值，依次放入结果数组（k个值对应k-1个差值，且这k-1个差值均不相同）
 * 3.最后再从最后一个被取的值那里开始，以1为差值的依次存入结果数组，
 * 因为前k-1个值是从最大减去最小开始计算的，所以到了第k-1个差值时，肯定也会>1，所以加上这个1，总共就是k个不同的数
 */
public class leetcode667 {
    public int[] constructArray(int n, int k) {
        int result=0;
        int[] res=new int[n];
        int start=1;
        int end=n;
        boolean flag=false;
        while(result<k){
            if(!flag){
                res[result++]=start;
                start++;
                flag=!flag;
            }else{
                res[result++]=end;
                end--;
                flag=!flag;
            }
        }
        if(flag){
            for(int i=start;i<=end;i++){
                res[result++]=i;
            }
        }else{
            for(int i=end;i>=start;i--){
                res[result++]=i;
            }
        }
        return res;
    }
}
