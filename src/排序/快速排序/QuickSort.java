package 排序.快速排序;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QuickSort {
    public void quickSort(int[] a) {
        if (a == null || a.length <= 0)
            return;
        quickSortCore1(a, 0, a.length - 1);
    }

    public void quickSortCore(int[] a, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = partation(a, lo, hi);
        quickSortCore(a, lo, mid - 1);
        quickSortCore(a, mid + 1, hi);
    }

    public void quickSortCore1(int[] a,int lo,int hi){  //非递归实现
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(lo);
        queue.offer(hi);
        while (!queue.isEmpty()){
            int left=queue.poll();
            int right=queue.poll(); //可能引起空指针异常
            int mid=partation(a,left,right);
            if(left<mid){        //left<mid-1更好
                queue.offer(left);
                queue.offer(mid-1);
            }
            if(right>mid){    //right>mid+1更好
                queue.offer(mid+1);
                queue.offer(right);
            }
        }
    }

    public int partation1(int[] a, int lo, int hi) {  //填坑法，交替赋值
        int val = a[lo];
        while (lo<hi) {
            while (lo<hi&&a[hi] >= val) {
                hi--;
            }
            a[lo]=a[hi];
            while (lo <hi && a[lo] <= val) {
                lo++;
            }
            a[hi]=a[lo];
        }
        a[lo]=val;
        return lo;
    }

    public int partation(int[] a,int lo,int hi){  //交换法
        int val=a[lo];
        int index=lo;
        while (lo<hi){
            while (lo<hi&&a[hi]>=val) //注意：先进行hi--，再lo++，这样最终lo和hi相等时，a[lo]的值小于val，交换不会出错
                hi--;                 //否则a[lo]的值大于val，交换后，造成数组左侧第一位大于val
            while (lo<hi&&a[lo]<=val)
                lo++;
            swap(a,lo,hi);
        }
        swap(a,index,lo);
        return lo;
    }

    public void swap(int[] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

}