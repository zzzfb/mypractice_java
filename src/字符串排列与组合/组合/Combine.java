package 字符串排列与组合.组合;

import java.util.Stack;

public class Combine {
    public void combine(char[] chars) {
        if (chars == null || chars.length == 0)
            return;
        Stack<Character> stack = new Stack<>();
        for (int m = 1; m <= chars.length; m++) {
            combine(chars, 0, m, stack);
        }
    }

    public void combine(char[] chars, int begin, int m, Stack<Character> stack) {
        if (m == 0) {
            System.out.println(stack.toString());
            return;
        }
        if (begin == chars.length)
            return;
        stack.push(chars[begin]);
        combine(chars, begin + 1, m - 1, stack);
        stack.pop();
        combine(chars, begin + 1, m, stack);
    }
}

class CombineTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        Combine cb = new Combine();
        cb.combine(chars);
    }
}
