package 树的遍历.层序遍历;

import 树的遍历.BinNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelTrav {
    public void levelTrav(BinNode root){
        if(root==null)
            return;
        Queue<BinNode> queue=new ArrayDeque<>();
        BinNode node=root;
        queue.offer(node);
        while (!queue.isEmpty()){
            node=queue.poll();
            System.out.print(node.val+" ");
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }

    public void levelTravByRow(BinNode root){
        if(root==null)
            return;
        ArrayDeque<BinNode> q=new ArrayDeque<>();
        BinNode node=root;
        BinNode lastNode=root;
        q.offer(node);
        while (!q.isEmpty()){
            node=q.poll();
            System.out.print(node.val+" ");
            if(node.left!=null)
                q.offer(node.left);
            if(node.right!=null)
                q.offer(node.right);
            if(node==lastNode){
                System.out.println();
                lastNode=q.peekLast();
            }
        }
    }
}
