package reservoir_sampling;

/**
 * 采用蓄水池抽样，网上有相关的证明
 */
public class leetcode382 {
    private ListNode first;
    private ListNode node;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public leetcode382(ListNode head) {
        first=head;
        node=head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int res=0;
        first=node;
        int count = 1;
        //遍历链表
        while(first!=null){
            if(Math.random()<(1.0/ count)){
                res=first.val;
            }
            count++;
            first=first.next;
        }
        return res;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
