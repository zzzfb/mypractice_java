package 股票的最大利润;

public class MaxDiff {
    public int getMaxDiff(int[] a){
        if(a==null||a.length<2){
            return 0;
        }
        int min=a[0];
        int maxDiff=a[1]-a[0];
        for (int i=2;i<a.length;i++){
            if(a[i-1]<min){
                min=a[i-1];
            }
            int diff=a[i]-min;
            if(diff>maxDiff){
                maxDiff=diff;
            }
        }
        return maxDiff;
    }
}
