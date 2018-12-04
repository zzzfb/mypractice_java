package myADT.优先队列_堆实现;

class MaxPQTest{
    public static void main(String[] args){
        MaxPQ<Integer> pq=new MaxPQ<>(8);
        pq.push(6);
        pq.push(3);
        pq.push(5);
        pq.push(9);
        pq.pop();
        pq.pop();

    }
}

public class MaxPQ<T extends Comparable<T>> {
    private T[] arr;
    private int N=0;

    public MaxPQ(int n){
        arr= (T[])new Comparable[n+1];
    }

    public void push(T val){
        arr[++N]=val;
        swim(N);
    }

    public T pop(){
        T Max=arr[1];
        arr[1]=arr[N];
        arr[N--]=null;
        sink(1);
        return Max;
    }

    private void swim(int k){
        while (k>1&&arr[k].compareTo(arr[k/2])>0){
            T temp=arr[k];
            arr[k]=arr[k/2];
            arr[k/2]=temp;
            k/=2;
        }
    }

    private void sink(int k){
        /*
        int i=2*k;
        if(i+1<N&&arr[i].compareTo(arr[i+1])<0){
            i++;
        }
        while (2*k+1<N&&arr[k].compareTo(arr[i])<0){
            T temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            k=i;
        }*/
        while (2*k<=N){
            int i=2*k;
            if(i+1<=N&&arr[i].compareTo(arr[i+1])<0){
                i++;
            }
            if (arr[k].compareTo(arr[i])<0){
                T temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k=i;
            }else {
                break;
            }
        }

    }
}
