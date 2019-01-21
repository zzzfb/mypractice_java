package 旋转数组最小数字;

public class MinInRotate {
    private boolean isValid=true;
    public int mimInRotate(int[] a){
        if(a==null||a.length==0){
            isValid=false;
            return 0;
        }
        int lo=0,hi=a.length-1;
        if(a[lo]<a[hi]){
            return a[lo];
        }
        while (hi-lo>1){
            int mid=lo+(hi-lo)/2;
            if(a[mid]==a[lo]&&a[mid]==a[hi]){
                return seqSearch(a,lo,hi);
            }
            else if(a[mid]>=a[lo]){
                lo=mid;
            }else if(a[mid]<=a[hi]){
                hi=mid;
            }
        }
        return a[hi];
    }

    public int seqSearch(int[] a,int lo,int hi){
        int min=lo;
        for (int i=lo+1;i<=hi;i++){
            if(a[i]<a[min])
                min=i;
        }
        return a[min];
    }
}
