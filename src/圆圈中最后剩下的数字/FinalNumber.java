package 圆圈中最后剩下的数字;

public class FinalNumber {
    private Node head;

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void add(int val) {
        if (head == null) {
            head = new Node(val);
            head.next = head;
        } else {
            Node node=head;
            while (node.next!=head){
                node=node.next;
            }
            node.next=new Node(val);
            node.next.next=head;
        }
    }

    public int getFinalNumber(int n,int m){
        if(n<=0||m<=0){
            return -1;
        }
        for (int i=0;i<n;i++){
            this.add(i);
        }
        Node node=head;
        while (head.next!=head){
            for (int i=0;i<m;i++){
                node=node.next;
            }
        }
    }
}
