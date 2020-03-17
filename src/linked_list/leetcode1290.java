package linked_list;

/**
 * 位运算
 */
public class leetcode1290 {
    class Solution {
        public int getDecimalValue(ListNode head) {
            int res=0;
            while(head!=null){
                res=(res<<1);
                res=(res|head.val);
                head=head.next;
            }
            return res;
        }
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
