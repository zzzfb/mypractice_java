package 链表中倒数第k个节点;

public class KthToTail {
    class Node {
        int val;
        Node next;
    }

    public Node getKthToTail(Node head, int k) {
        if (head == null||k<=0)//忘记判断k<=0
            return null;
        Node pre = head;
        Node behind = head;
        for (int i = 1; i < k; i++) {
            if (pre.next == null)  //不是pre==null，会导致while循环中的pre.next空指针异常
                return null;
            else
                pre = pre.next;
        }

        while (pre.next != null) {
            pre = pre.next;
            behind = behind.next;
        }
        return behind;
    }
}
