package 两个栈实现队列;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public void push(int val){
        stack1.push(val);
    }
    public void pop(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                //int temp=stack1.pop();
                //stack2.push(temp);
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();//不用判断stack2为空，内部pop方法会抛出异常
    }
}
