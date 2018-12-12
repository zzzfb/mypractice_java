package 二叉搜索树的第k小节点;

import java.util.Stack;

public class MinKOfBST {
    private class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public BinaryTreeNode getMinK(BinaryTreeNode root,int k){
        if(root==null||k<=0)
            return null;

        Stack<BinaryTreeNode> binaryTreeNodeStack=new Stack<>();
        BinaryTreeNode node=root;

        while (node!=null||!binaryTreeNodeStack.isEmpty()){  //node！=null,不是root!=null
            while (node!=null){
                binaryTreeNodeStack.push(node);
                node=node.left;
            }
            if(!binaryTreeNodeStack.isEmpty()){
                node=binaryTreeNodeStack.pop();
                k--;
                if(k==0){
                    return node;
                }
                node=node.right;
            }
        }
        return null;
    }
}
