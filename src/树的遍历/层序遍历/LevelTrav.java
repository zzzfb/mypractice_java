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
}
