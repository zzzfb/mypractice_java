package 数字在排序数组中出现的次数;

public class CountInSortedArray {
    public int getCount(int[] a,int k){
        if(a==null||a.length==0)
            return 0;
        int left=0,right=-1;//保证没有查到数字时，right-left+1的值为0
        int lo=0,hi=a.length-1;
        //查找最左边的k
        while (lo<=hi){
            int mid=lo+((hi-lo)>>1);//mid要在循环内更新
            if(a[mid]<k){
                lo=mid+1;
            }
            else if(a[mid]>k){
                hi=mid-1;
            }
            else {
                if(mid==lo||a[mid-1]!=k){//漏加条件mid==lo，此时mid-1会越界
                    left=mid;//不是left=mid-1
                    break;//忘加break
                }else {
                    hi=mid-1;
                }
            }
        }

        lo=0;    //lo和hi需要重置
        hi=a.length-1;

        //查找最右边的k
        while (lo<=hi){
            int mid=lo+((hi-lo)>>1);
            if(a[mid]<k){
                lo=mid+1;
            }
            else if(a[mid]>k){
                hi=mid-1;
            }
            else {
                if(mid==hi||a[mid+1]!=k){
                    right=mid;
                    break;
                }else {
                    lo=mid+1;
                }
            }
        }
        return right-left+1;
    }
}
