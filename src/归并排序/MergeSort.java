package 归并排序;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] a={11,2,25,33,12,36,9,35};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a){
        if(a==null||a.length<=0)
            return;
        int[] temp=new int[a.length];
        mergeSort(a,0,a.length-1,temp);
    }

    public static void mergeSort(int[] a,int lo,int hi,int[] temp){
        if(hi<=lo)
            return;
        int mid=lo+(hi-lo)/2;
        mergeSort(a,lo,mid,temp);
        mergeSort(a,mid+1,hi,temp);
        merge(a,lo,mid,hi,temp);
    }

    public static void merge(int[] a,int lo,int mid,int hi,int[] temp){
        for(int k=lo;k<=hi;k++){
            temp[k]=a[k];
        }
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++){
            if(i>mid)
                a[k]=temp[j++];
            else if(j>hi)
                a[k]=temp[i++];
            else if(temp[i]<temp[j])//错写成a[i]<a[j],a已经被修改，不能用于比较
                a[k]=temp[i++];
            else
                a[k]=temp[j++];
        }
    }
}
