package 最小的k个数;

import java.util.Arrays;

public class MinK {

    public static void main(String[] args){
        int[] a={66,32,23,19,28,33};
        //int[] res=minK_par(a,2);
        int[] res=minK_heap(a,2);
        System.out.println(Arrays.toString(res));
    }

    //基于快速排序中的partation实现
    public static int[] minK_par(int[] a,int k){
        if(a==null||a.length<k)
            return new int[0];

        int lo=0,hi=a.length-1;
        int mid=partation(a,lo,hi);

        while(mid!=k){
            if(mid<k){
                lo=mid+1;
                mid=partation(a,lo,hi);
            }else {
                hi=mid-1;
                mid=partation(a,lo,hi);
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=a[i];
        }
        return res;
    }

    public static int partation(int[] a,int lo,int hi){
        int val=a[lo];
        while (lo<hi){
            while (lo<hi&&a[hi]>=val){
                hi--;
            }
            a[lo]=a[hi];
            while (lo<hi&&a[lo]<=val){//是否有等号? 有
                lo++;
            }
            a[hi]=a[lo];
        }

        a[lo]=val;
        return lo;
    }

    //基于最大堆实现
    public static int[] minK_heap(int[] a,int k){
        if(a==null||a.length<k)
            return new int[0];

        int[] kNum=new int[k];
        for(int i=0;i<k;i++){
            kNum[i]=a[i];
        }
        createHeap(kNum);
        for (int j=k;j<a.length;j++){
            if(a[j]<kNum[0]){
                kNum[0]=a[j];
                sink(kNum,0);
            }
        }
        return kNum;
    }

    public static void createHeap(int[] a){
        int i=a.length/2-1;
        while (i>=0){
            sink(a,i);
            i--;
        }
    }

    public static void sink(int[] a,int i){
        while (2*i+1<=a.length-1){
            int left=2*i+1;
            int right=left+1;
            int max=left;
            if(right<=a.length-1&&a[max]<a[right]){
                max=right;
            }
            if(a[i]<a[max]){
                swap(a,i,max);
                i=max;
            }else
                break;
        }
    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
