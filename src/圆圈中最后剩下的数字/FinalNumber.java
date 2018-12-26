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

    public void remove(Node node){
        node.val=node.next.val;
        node.next=node.next.next;
    }

    public int getFinalNumber(int n,int m){
        if(n<=0||m<=0){
            return -1;
        }
        for (int i=0;i<n;i++){
            this.add(i);
        }
        Node node=head;
        while (node.next!=node){  //不应用head.next！=head判断
            for (int i=0;i<m-1;i++){ //m-1，当前开始数，本身算一个
                node=node.next;
            }
            remove(node);
        }
        return node.val;
    }

    public int getFinalNumberQuick(int n,int m){  //创新解法，利用映射
        if(n<=0||m<=0){
            return -1;
        }
        int last=0;
        for (int i=2;i<=n;i++){
            last=(last+m)%i;
        }
        return last;
    }
}
