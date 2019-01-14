package 树的遍历.后序遍历;

import 树的遍历.BinNode;

import java.util.Stack;

public class PostTrav {
    public void postTravRec(BinNode root){
        if(root==null)
            return;
        postTravRec(root.left);
        postTravRec(root.right);
        System.out.print(root.val+" ");
    }

    public void postTrav(BinNode root){
        if(root==null)
            return;
        Stack<BinNode> stack=new Stack<>();
        BinNode node=root;
        BinNode lastVisit=root;
        while (node!=null||!stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node=node.left;
            }
            node=stack.peek();
            if(node.right==null||node.right==lastVisit){
                System.out.print(node.val+" ");
                stack.pop();
                lastVisit=node;
                node=null;
            }else {
                node=node.right;
            }
        }
    }
}
