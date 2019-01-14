package 前序中序序列重建二叉树;

import 树的遍历.BinNode;

public class BuildTree {
    public BinNode build(int[] pre,int[] mid){
        return buildCore(pre,mid,0,pre.length-1,0,mid.length-1);
    }

    public BinNode buildCore(int[] pre,int[] mid,int prelo,int prehi,int midlo,int midhi){
        if(pre==null||mid==null||pre.length==0||mid.length==0||pre.length!=mid.length)
            return new BinNode();
        int rootVal=pre[prelo];
        BinNode root=new BinNode(rootVal);
        int index=midlo;
        while(mid[index]!=rootVal){
            index++;
        }
        int subLength=index-midlo;
        root.left=buildCore(pre,mid,prelo+1,prelo+subLength,index-subLength,index-1);
        root.right=buildCore(pre,mid,prelo+subLength+1,prehi,index+1,midhi);
        return root;
    }
}
