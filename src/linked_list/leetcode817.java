package linked_list;

import java.util.HashSet;
import java.util.Set;

/**
 * 使用flag记录当前是否处在一个组件中,false证明不在，true证明在
 * 使用hashset匹配是否是在G中
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class leetcode817 {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set=new HashSet<>();
        //放入hashset
        for(int i=0;i<G.length;i++){
            set.add(G[i]);
        }
        int num=0;
        boolean flag=false;
        while(head!=null){
            if(set.contains(head.val)){
                flag=true;
            }else{
                if(flag){
                    num++;
                }
                flag=false;
            }
            head=head.next;
        }
        //最后再检查一下是否最后在组件中
        if(flag)num++;
        return num;
    }
}
