package 树的遍历.中序遍历;

import 树的遍历.BinTreeNode;

import java.util.Stack;

public class MidTrav {
    public void midTrav(BinTreeNode root){
        if(root==null)
            return;

        Stack<BinTreeNode> binTreeNodeStack=new Stack<>();
        BinTreeNode node=root;

        while (node!=null||!binTreeNodeStack.isEmpty()){
            while (node!=null){
                binTreeNodeStack.push(node);
                node=node.left;
            }
            if(!binTreeNodeStack.isEmpty()){
                node=binTreeNodeStack.pop();
                System.out.println(node.val);
                node=node.right;
            }
        }
    }
}
