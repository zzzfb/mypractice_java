package 二维数组中的查找;

public class TwoDimArray {
    public boolean find(int[][] a,int val){
        //顺序查找，错误解法
        /*if(a==null||row<=0||col<=0){
            return false;
        }
        int index=0;
        for (int i=0;i<row;i++){
            for (int j=index;j<col&&j>=0;j++){
                if(a[i][j]==val){
                    return true;
                }
                else if(a[i][j]<val){
                    if(i==0)
                        continue;
                    else
                        break;
                }
                else {
                    if(i==0){
                        index=j-1;
                        break;
                    }
                    else
                        return false;
                }
            }
        }
        return false;*/

        //两次二分查找，错误解法
        /*if(a==null){
            return false;
        }
        int row=a.length;
        int col=a[0].length;
        int index=0;
        int lo=0,hi=col-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[0][mid]==val)
                return true;
            else if(a[0][mid]<val)
                lo=mid+1;
            else
                hi=mid-1;
        }
        index=hi;
        lo=0;
        hi=row-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid][index]==val)
                return true;
            else if(a[mid][index]<val)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return false;*/

        //从右上角剔除
        if(a==null){
            return false;
        }
        int row=a.length;
        int col=a[0].length;
        int i=0,j=col-1;
        while (i<row&&j>=0){
            if(a[i][j]==val)
                return true;
            else if(a[i][j]<val)
                i++;
            else
                j--;
        }
        return false;
    }
}
