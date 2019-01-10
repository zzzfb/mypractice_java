package 二叉树的深度;

import 树的遍历.BinNode;

public class TreeDepth {
    public int treeDepth(BinNode root){
        if(root==null)
            return 0;
        /*if(root.left==null&&root.right==null){  //不需要额外判断
            return 1;
        }*/
        return 1+Math.max(treeDepth(root.left),treeDepth(root.right));//忘记+1
    }
}
