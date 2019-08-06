package dfs;

import java.util.List;

/**
 * 使用深度搜索
 */
public class leetcode638 {
    //最小花费
    private int min=Integer.MAX_VALUE;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int[] buy=new int[needs.size()];//buy数组记录已经购买商品的数量
        dfs(buy,price,special,needs,0,0);
        return min;
    }
    public void dfs(int[] buy,List<Integer> price, List<List<Integer>> special, List<Integer> needs,int index,int cost){
        for(int i=index;i<special.size();i++){
            List<Integer> list=special.get(i);
            boolean flag=true;
            for(int j=0;j<list.size()-1;j++){
                //如果超出了需要的量就跳出
                if(buy[j]+list.get(j)>needs.get(j)){
                    flag=false;
                    break;
                }
            }
            //如果购买这个套餐是可行的,继续深搜
            if(flag){
                //修改已购买数量
                for(int j=0;j<list.size()-1;j++){
                    buy[j]+=list.get(j);
                }
                //深搜
                dfs(buy,price,special,needs,index,cost+list.get(list.size()-1));
                //把数组改回原来的数
                for(int j=0;j<list.size()-1;j++){
                    buy[j]-=list.get(j);
                }
            }
        }
        //在购买套餐的过程中查看单独购买的金额
        for(int i=0;i<buy.length;i++){
            if(buy[i]>needs.get(i)){
                return;
            }else{
                cost+=price.get(i)*(needs.get(i)-buy[i]);
            }
        }

        min=Math.min(min,cost);
    }
}
