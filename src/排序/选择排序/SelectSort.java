package 排序.选择排序;

public class SelectSort {
    public void selectSort(int[] a){
        if(a==null||a.length==0)
            return;
        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;
        }
    }
}
