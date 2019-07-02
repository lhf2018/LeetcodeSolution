package math;
/**
 * 313. 超级丑数
 *
 * 假设素数的个数是nums，那么就分配nums个指针，它们的属性是primes[i]，使得每个指针对应它们指向第k个素数。初始时刻所有指针都指向1，第0个素数。
 * 下一个丑数必然是这nums个指针指向的数分别乘以它们的属性，然后在nums个数字中取最小值min。
 * 这些指针中,所有计算结果等于min的都必须向后移动一个单位，否则下一次计算就会小于当前得到的丑数。
 */
public class leetcode313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] pointer=new int[primes.length];//指向哪一个
        int[] dp=new int[n];
        dp[0]=1;
        int count=1;
        while(count<=n-1){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<primes.length;i++){
                min=Math.min(min,dp[pointer[i]]*primes[i]);
            }

            for(int i=0;i<primes.length;i++){
                if(min==dp[pointer[i]]*primes[i]){
                    pointer[i]++;
                }
            }
            dp[count++]=min;
        }
        return dp[n-1];
    }
}
