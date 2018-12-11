package 两个链表的第一个公共节点;

public class FirstCommonNode {
    private class ListNode {
        int val;
        ListNode next;
    }

    public ListNode getFirstCommonNode(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return null;
        int length1 = 0, length2 = 0;
        ListNode temp1 = l1, temp2 = l2;
        while (temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }
        temp1 = l1;
        temp2 = l2;
        if (length1 > length2) {
            int k = length1 - length2;
            for (int i = 0; i < k; i++) {
                temp1 = temp1.next;
            }
        } else {
            int k=length2-length1;
            for (int i=0;i<k;i++){
                temp2=temp2.next;
            }
        }
        while (temp1!=null&&temp2!=null){
            if(temp1==temp2)
                return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}
