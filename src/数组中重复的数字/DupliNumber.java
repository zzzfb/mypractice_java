package 数组中重复的数字;

public class DupliNumber {
    boolean isValid=false;
    public int getDupliNumber(int[] a){
        if(a==null||a.length==0){
            return 0;
        }
        for (int i=0;i<a.length;i++){
            while (a[i]!=i){
                if(a[i]!=a[a[i]]){
                    int temp=a[i];
                    a[i]=a[temp];
                    a[temp]=temp;
                }else {
                    isValid=true;
                    return a[i];
                }
            }
        }
        return 0;
    }

    //不改变数组
    public int getDupliNumberNotChange(int[] a){
        if(a==null||a.length==0){
            return 0;
        }
        int lo=1,hi=a.length-1;
        while (lo<hi){
            int mid=lo+(hi-lo)/2;
            int count=0;
            for(int i=0;i<a.length;i++){
                if(a[i]<=mid){
                    count++;
                }
            }
            if(count>mid){
                hi=mid;
            }else {
                lo=mid+1;;
            }
        }
        return lo;
    }
}
