package 两个队列实现栈;

public class TwoQueueStackTest {
    public static void main(String[] args) {
        TwoQueueStack stack = new TwoQueueStack();
        stack.offer(1);
        stack.offer(2);
        stack.offer(3);
        stack.poll();
        stack.offer(4);
        stack.offer(5);
        stack.poll();
    }
}
