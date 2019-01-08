package 从尾到头打印链表;

public class FromTailToHead {
    class Node{
        int val;
        Node next;
    }
    public void Reverse(Node head){
        if(head==null)
            return;
        Node cur=head;
        Node curNext=cur.next;
        cur.next=null;
        while (curNext!=null){
            Node tmp=curNext.next;
            curNext.next=cur;
            cur=curNext;
            curNext=tmp;
        }
        head=cur;

        //打印链表
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
}
