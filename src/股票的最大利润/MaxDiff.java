package 股票的最大利润;

public class MaxDiff {
    public int getMaxDiff(int[] array){
        if(array==null||array.length<2){
            return 0;
        }
        int min=array[0];
        int maxDiff=array[1]-array[0];
        for (int i=2;i<array.length;i++){
            if(array[i-1]<min){
                min=array[i-1];
            }
            int diff=array[i]-min;
            if(diff>maxDiff){
                maxDiff=diff;
            }
        }
        return maxDiff;
    }
}
