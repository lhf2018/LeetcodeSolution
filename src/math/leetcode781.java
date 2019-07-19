package math;

/**
 * 思路：
 * 前提：不同数的兔子肯定不是一种颜色，不然自相矛盾
 * 假设所有answer中的兔子尽可能配对，一个2，和另外两个2可以是一种颜色，这三个兔子都可以称“还有两个相同颜色的兔子”
 * 统计各种说法的数量，比如说2的有5个，那么每（2+1）个兔子一组（对应一组颜色），可以组成一组，余两个，那么就还有一个兔子没有露面
 * 算是没露面的兔子，总共可以构成两种颜色
 * 时间：2ms
 */
public class leetcode781 {
    public int numRabbits(int[] answers) {
        int[] rab=new int[1000];
        for(int num:answers){
            rab[num]++;
        }
        int res=rab[0];
        for(int i=1;i<rab.length;i++){
            if(rab[i]%(i+1)!=0){
                res+=(rab[i]/(i+1)+1)*(i+1);
            }else{
                res+=rab[i];
            }
        }
        return res;

    }
}
