package myADT.栈_链表实现;

public class stack<T> {
    private int N;
    private Node head;

    private class Node {
        T elem;
        Node next;
    }

    public void push(T elem) {
        Node oldNext = head;
        head = new Node();
        head.elem = elem;
        head.next = oldNext;
        N++;
    }

    public T pop() {
        T oldElem = head.elem;
        head = head.next;
        N--;
        return oldElem;
    }


    public static void main(String[] args) {
        stack<String> s = new stack<>();
        s.push("a");
        String temp = s.pop();
    }
}
