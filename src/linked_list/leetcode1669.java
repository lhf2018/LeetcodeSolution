package linked_list;

public class leetcode1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list1_temp1=list1;
        for(int i=1;i<a;i++){
            list1_temp1=list1_temp1.next;
        }
        ListNode list1_temp2=list1;
        for(int i=0;i<=b;i++){
            list1_temp2=list1_temp2.next;
        }
        list1_temp1.next=list2;
        ListNode list2_temp=list2;
        while(list2_temp.next!=null){
            list2_temp=list2_temp.next;
        }
        list2_temp.next=list1_temp2;
        return list1;
    }
}
