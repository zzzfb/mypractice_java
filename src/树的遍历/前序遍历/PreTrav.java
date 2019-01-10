package 树的遍历.前序遍历;

import 树的遍历.BinNode;

import java.util.Stack;

public class PreTrav {
    public void preTrav(BinNode root){
        if(root==null)
            return;
        Stack<BinNode> stack=new Stack<>();
        BinNode node=root;
        while (node!=null||!stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                System.out.print(node.val+" ");
                node=node.left;
            }
            if(!stack.isEmpty()){
                node=stack.pop().right;
            }
        }
    }

    public void preTravRev(BinNode root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        preTravRev(root.left);
        preTravRev(root.right);
    }
}
