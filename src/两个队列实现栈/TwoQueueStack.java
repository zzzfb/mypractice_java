package 两个队列实现栈;

import java.util.ArrayDeque;

public class TwoQueueStack {
    ArrayDeque<Integer> aq1=new ArrayDeque<>();
    ArrayDeque<Integer> aq2=new ArrayDeque<>();
    public void offer(int val){
        aq1.offer(val);
    }
    public void poll(){
        while (!aq1.isEmpty()||!aq2.isEmpty()){
            while (aq1.size()>1){
                aq2.offer(aq1.poll());
            }
            if(!aq1.isEmpty()){
                aq1.poll();
                return;
            }
            while (aq2.size()>1){
                aq1.offer(aq2.poll());
            }
            if(!aq2.isEmpty()){
                aq2.poll();
                return;
            }
        }
    }
}
