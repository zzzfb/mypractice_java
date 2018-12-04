import java.util.Arrays;

public class Test {
    private static int[] temp;

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a) {
        if (a == null || a.length <= 0)
            return;
        temp = new int[a.length];
        mergeSortCore(a, 0, a.length - 1);
    }

    public static void mergeSortCore(int[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSortCore(a, lo, mid);
        mergeSortCore(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {  //错写成k<a.length
            temp[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = temp[j++];
            else if (j > hi)
                a[k] = temp[i++];
            else if (a[j] < a[i])
                a[k] = temp[j++];
            else
                a[k] = temp[i++];
        }
    }
}