package 二叉树的下一个节点;

import 树的遍历.BinNode;

public class NextNode {
    public BinNode findNextNode(BinNode x){
        if(x==null)
            return null;
        BinNode node=x;
        if(node.right!=null){
            node=node.right;
//            if(node.left==null) //多此一举
//                return node;
            while (node.left!=null){
                node=node.left;
            }
            return node;
        }else {
            /*if(node.parent==null){
                return null;
            } else {
                if(node.parent.left==node){
                    return node.parent;
                }else {
                    return null;
                }
            }*/


//            if(node.parent!=null&&node.parent.left==node){ //忘判断node.parent!=null，导致node.parent空指针异常
//                return node.parent;
//            }else {
            //多此一举
                while (node.parent!=null&&node.parent.left!=node){
                    node=node.parent;
                }
                return node.parent;
//            }
        }
    }
}
