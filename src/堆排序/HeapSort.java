package 堆排序;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args){
        int[] a={1,3,5,8,6,23,11,35};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void heapSort(int[] a){
        if(a==null||a.length<=0)
            return;
        createHeap(a);
        int hi=a.length-1;
        while (hi>0){
            swap(a,0,hi--);
            sink(a,0,hi);
        }
    }

    private static void createHeap(int[] a){
        int i=a.length/2-1;
        while(i>=0){     //错写成i>0,i=0也要下滤
            sink(a,i,a.length-1);
            i--;
        }
    }

    private static void sink(int[] a,int k,int hi){

        while (2*k+1<=hi){    //堆排序每次交换完最大值，堆容量减1，传入hi作为边界值，而不是用a.length-作边界值
            int left=2*k+1;
            int right=left+1;
            int max=left;
            if(right<=hi&&a[max]<a[right]){
                    max=right;
            }
            if(a[k]<a[max]){
                swap(a,k,max);
                k=max;         //错写成k=left
            }
            else
                break;
        }
    }

    private static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
