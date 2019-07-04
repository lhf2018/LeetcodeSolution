package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 思路：先判断所在层数，再计算属于上一行的第几个，返回上一个节点的节点值，具体的细节自己画图可以理解
 */
public class leetcode1104 {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> res=new ArrayList<>();
        if(label==1){
            res.add(1);
            return res;
        }
        while(label>1){
            res.add(label);
            label=helper(label);
        }
        res.add(1);
        Collections.reverse(res);
        return res;
    }
    public int helper(int label){
        int n=1;
        while(true){
            if((int)(Math.pow(2,n))<=label&&label<(int)(Math.pow(2,n+1))){
                break;
            }
            n++;
        }
        int row_start=(int)(Math.pow(2,n));//该层的起始值
        int dis=label-row_start;//目标值距离起始值的位置
        int num=dis/2+1;//位于第几个节点
        return row_start-num;//返回这个值所属于的父节点
    }
}
