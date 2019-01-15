package 排序.快速排序;

import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] a) {
        if (a == null || a.length <= 0)
            return;
        quickSortCore(a, 0, a.length - 1);
    }

    public void quickSortCore(int[] a, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = partation(a, lo, hi);
        quickSortCore(a, lo, mid - 1);
        quickSortCore(a, mid + 1, hi);
    }

    public int partation(int[] a, int lo, int hi) {
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

}

class QuickSortTest {
    public static void main(String[] args) {
        int[] a = {26, 3, 5, 85, 43, 22, 65, 48, 32, 19,43};
        QuickSort qs = new QuickSort();
        qs.quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}