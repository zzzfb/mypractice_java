package 礼物的最大值;

public class MaxValueOfGift {
    public int getMaxValue(int[] a,int row,int col){
        if(a==null||a.length==0)
            return 0;
        int[] value=new int[col];
        int left=0,up=0;
        for (int i=0;i<row;i++){
            left=0;//换行时left应置为0，否则会使用上次保存的值
            for (int j=0;j<col;j++){
                if(i>0){
                    up=value[j];
                }
                if(j>0){
                    left=value[j-1];
                }
                value[j]=Math.max(left,up)+a[i*col+j];
            }
        }
        return value[col-1];
    }
}
