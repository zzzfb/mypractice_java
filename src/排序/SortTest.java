package 排序;

import 排序.冒泡排序.BubbleSort;
import 排序.快速排序.QuickSort;
import 排序.插入排序.InsertSort;
import 排序.选择排序.SelectSort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args){
        int[] a={12,3,6,5,1,25};
        System.out.println(Arrays.toString(a));

        BubbleSort bubble=new BubbleSort();
        bubble.bubbleSort(a);
        System.out.println(Arrays.toString(a));

        SelectSort select=new SelectSort();
        select.selectSort(a);
        System.out.println(Arrays.toString(a));

        InsertSort insert=new InsertSort();
        insert.insertSort(a);
        System.out.println(Arrays.toString(a));

        QuickSort quick=new QuickSort();
        quick.quickSort(a);
        System.out.println(Arrays.toString(a));

    }
}
