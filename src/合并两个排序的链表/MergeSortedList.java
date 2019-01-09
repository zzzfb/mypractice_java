package 合并两个排序的链表;

public class MergeSortedList {
    class Node{
        int val;
        Node next;
    }
    public Node merge(Node head1,Node head2){
        if(head1==null&&head2!=null){  //无需判断head2，直接返回head1即可
            //head1.next=head2;  //错误思路
            //return head1;
            return head2;
        }
        if(head2==null&&head1!=null){  //无需判断head1，直接返回head2即可
            //head2.next=head1;
            //return head2;
            return head1;
        }
        //if(head1!=null&&head2!=null){ //无需判断
        if(head1.val<head2.val){
            head1.next=merge(head1.next,head2);
            return head1; //在此需要返回
        }
        else {
            head2.next=merge(head1,head2.next);
            return head2; //在此需要返回
        }
    }
}
