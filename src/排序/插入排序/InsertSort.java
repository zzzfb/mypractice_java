package 排序.插入排序;

public class InsertSort {
    public void insertSort(int[] a){
        if(a==null||a.length==0)
            return;
        for (int i=1;i<a.length;i++){
            for (int j=i;j>0&&a[j]<a[j-1];j--){
                int tmp=a[j];
                a[j]=a[j-1];
                a[j-1]=tmp;
            }
        }
    }
}
