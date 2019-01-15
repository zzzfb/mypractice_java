package 排序.冒泡排序;

public class BubbleSort {
    public void bubbleSort(int[] a){
        if(a==null||a.length==0)
            return;
        for (int i=0;i<a.length;i++){         //也可以是i<a.length-1
            for (int j=0;j<a.length-1-i;j++){   //j<a.length-1-i,随着i增加，比较次数减少
                if(a[j]>a[j+1]){             //a[j]与a[j+1]相邻两个数比较
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    }
}
