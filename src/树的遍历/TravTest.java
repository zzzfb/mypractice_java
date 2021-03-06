package 树的遍历;

import 前序中序序列重建二叉树.BuildTree;
import 树的遍历.前序遍历.PreTrav;
import 树的遍历.后序遍历.PostTrav;
import 树的遍历.层序遍历.LevelTrav;

public class TravTest {
    public static void main(String[] args) throws Exception {
        BinNode root = new BinNode(1);
        root.left = new BinNode(2);
        root.right = new BinNode(3);
        root.left.left = new BinNode(4);
        root.left.right = new BinNode(5);
        root.right.left = new BinNode(6);
        root.right.right = new BinNode(7);

//        PreTrav pre = new PreTrav();
//        pre.preTrav(root);
//        System.out.println();
//        pre.preTravRec(root);
//        System.out.println();
//
//        PostTrav post = new PostTrav();
//        post.postTrav(root);
//        System.out.println();

        LevelTrav level = new LevelTrav();
        level.levelTravByRow(root);

        BuildTree build = new BuildTree();
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 1};
        BinNode broot = build.build(a, b);
    }
}
