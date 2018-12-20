package 滑动窗口最大值;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows_err(int[] a, int k){
        ArrayList<Integer> array=new ArrayList<>();
        if(a==null||a.length==0||k<=0||k>a.length){
            return array;
        }
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offer(0);
        for (int i=1;i<a.length;i++){
            if(i>=k-1){     //先判断会少加一个元素，后判断会多加一个元素
                array.add(a[dq.getFirst()]);
            }
            int last=dq.getLast();
            while (a[i]>a[last]){  //while循环过于复杂
                dq.removeLast();
                if(!dq.isEmpty()){
                    last=dq.peekLast();
                }else {
                    break;
                }
            }
            if(!dq.isEmpty()&&(i-dq.getFirst())>=k-1){
                dq.removeFirst();
            }
            dq.offerLast(i);
            /*if(i>=k-1){     //先判断会少加一个元素，后判断会多加一个元素
                array.add(a[dq.getFirst()]);
            }*/
        }
        return array;
    }

    public ArrayList<Integer> maxInWindows(int[] a, int k){
        ArrayList<Integer> array=new ArrayList<>();
        if(a==null||a.length==0||k<=0||k>a.length){
            return array;
        }
        Deque<Integer> dq=new ArrayDeque<>();
        for (int i=0;i<k;i++){  //先把窗口填满，解决上面方法中if无法在适当位置判断的问题
            while (!dq.isEmpty()&&a[i]>a[dq.getLast()]){
                dq.removeLast();
            }
            dq.offerLast(i);
        }
        for (int i=k;i<a.length;i++){
            array.add(a[dq.getFirst()]);
            while (!dq.isEmpty()&&a[i]>a[dq.getLast()]){  //先判断是否为空，若先判断后者getLast可能抛异常
                dq.removeLast();
            }
            if(!dq.isEmpty()&&(i-dq.getFirst())>=k){  //不是>=k-1
                dq.removeFirst();
            }
            dq.offerLast(i);
        }
        array.add(a[dq.getFirst()]);//最后还需添加一次
        return array;
    }
}
