package 树的遍历.中序遍历;

import 树的遍历.BinNode;

import java.util.Stack;

public class MidTrav {
    public void midTrav(BinNode root){
        if(root==null)
            return;

        Stack<BinNode> stack=new Stack<>();
        BinNode node=root;

        while (node!=null||!stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node=node.left;
            }
            if(!stack.isEmpty()){
                node=stack.pop();
                System.out.println(node.val);
                node=node.right;
            }
        }
    }

    public void midTravRec(BinNode root){
        if(root==null)
            return;
        midTravRec(root.left);
        System.out.println(root.val);
        midTravRec(root.right);
    }
}
