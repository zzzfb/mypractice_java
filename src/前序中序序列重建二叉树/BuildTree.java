package 前序中序序列重建二叉树;

import 树的遍历.BinNode;

public class BuildTree {
    public BinNode build(int[] pre, int[] mid) throws Exception {
        if (pre == null || mid == null || pre.length == 0 || mid.length == 0 || pre.length != mid.length)
            return new BinNode();
        return buildCore(pre, mid, 0, pre.length - 1, 0, mid.length - 1);
    }

    public BinNode buildCore(int[] pre, int[] mid, int prelo, int prehi, int midlo, int midhi) throws Exception{

        if (prelo > prehi || midlo > midhi) {          //没加递归退出条件
            return null;
        }

        int rootVal = pre[prelo];
        BinNode root = new BinNode(rootVal);

        if(prelo==prehi){                              //前序与中序不匹配
            if(midlo==midhi&&pre[prelo]==mid[midlo])
                return root;
            else
                throw new Exception("Invalid input");
        }

        int index = midlo;
        while (index < mid.length && mid[index] != rootVal) {    //易忘判断index < mid.length
            index++;
        }

        if(index==mid.length-1&&mid[index] != rootVal) //找不到根节点的值
            throw new Exception("Invalid input");

        int subLength = index - midlo;
        //root.left=buildCore(pre,mid,prelo+1,prelo+subLength,index-subLength,index-1);
        root.left = buildCore(pre, mid, prelo + 1, prelo + subLength, midlo, index - 1);
        root.right = buildCore(pre, mid, prelo + subLength + 1, prehi, index + 1, midhi);
        return root;
    }
}
