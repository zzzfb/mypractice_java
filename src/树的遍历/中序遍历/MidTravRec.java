package 树的遍历.中序遍历;

import 树的遍历.BinTreeNode;

public class MidTravRec {
    public void midTravRec(BinTreeNode root){
        if(root==null)
            return;
        midTravRec(root.left);
        System.out.println(root.val);
        midTravRec(root.right);
    }
}
