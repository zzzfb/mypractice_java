package 数组中的逆序对;

public class InversePair {
    private int[] temp;
    public int getInversePairs(int[] a){
        if(a==null||a.length==0)
            return 0;
        temp=new int[a.length];
        return getInversePairsCore(a,0,a.length-1);
    }

    public int getInversePairsCore(int[] a,int lo,int hi){
        if(hi<=lo)
            return 0;
        int mid=lo+(hi-lo)/2;
        int left=getInversePairsCore(a,lo,mid);
        int right=getInversePairsCore(a,mid+1,hi);
        int count=getMergeCount(a,lo,mid,hi);
        return left+right+count;
    }

    public int getMergeCount(int[]a,int lo,int mid,int hi){
        for (int k=lo;k<=hi;k++){  //先把上次排完序的a赋值给temp，用排好序的temp再构建a
            temp[k]=a[k];
        }
        int i=mid;
        int j=hi;
        int index=hi;
        int count=0;
        while (i>=lo&&j>=mid+1){
            if(temp[i]>temp[j]){
                count+=(j-mid);
                a[index--]=temp[i--];
            }
            else {
                a[index--]=temp[j--];
            }
        }
        while (i<lo&&j>=mid+1&&index>=lo){
            a[index--]=temp[j--];
        }
        while (i>=lo&&j<mid+1&&index>=lo){
            a[index--]=temp[i--];
        }
        return count;
    }
}
