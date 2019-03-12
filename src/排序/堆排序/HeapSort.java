package 排序.堆排序;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args){
        int[] a={1,3,5,8,6,23,11,35};
        heapSort2(a);
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

    public static void heapSort2(int[] a){
        if(a==null||a.length<=1)
            return;
        createHeap2(a);
        for(int i=0;i<a.length;i++){  //第一个始终是是最小元素，每次置于尾部，换后从头开始下沉
            //缺少步骤
            sink2(a,i);
        }
    }

    public static void createHeap2(int[] a){
        int mid=a.length>>1;
        for (int i=mid;i>=0;i--){
            sink2(a,i);
        }
    }

    public static void sink2(int[] a,int i){   //长度每次少1，没控制边界
        while (2*i+1<a.length){
            int maxIndex=2*i+1;
            if(2*i+2<a.length&&a[2*i+1]<a[2*i+2]){
                maxIndex=2*i+2;
            }
            if(a[i]>a[maxIndex]){
                swap(a,i,maxIndex);
                i=maxIndex;
            }
        }
    }
}
