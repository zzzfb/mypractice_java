package 树的遍历;

import 树的遍历.前序遍历.PreTrav;

public class TravTest {
    public static void main(String[] args){
        BinNode root=new BinNode(1);
        root.left=new BinNode(2);
        root.right=new BinNode(3);
        root.left.left=new BinNode(4);
        root.left.right=new BinNode(5);
        root.right.left=new BinNode(6);
        root.right.right=new BinNode(7);

        PreTrav pre=new PreTrav();
        pre.preTrav(root);
        System.out.println();
        pre.preTravRev(root);
    }
}
