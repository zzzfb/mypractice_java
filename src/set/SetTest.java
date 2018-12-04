package set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Set<Integer> ints = new HashSet<>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        while (!in.hasNext("#")) {  //用标志位作为结束的标志
            String word = in.next();
            long startTime = System.currentTimeMillis();
            System.out.println(startTime);
            words.add(word);//10万次该操作大约需要十几ms，用nanoTime()可测出一次操作的时间（ns）
            /*for (int i = 0; i < 1000000; i++) {
                ints.add(i);
            }*/
            long endTime = System.currentTimeMillis();
            System.out.println(endTime);
            totalTime += (endTime - startTime);
        }

        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(words.size());
        System.out.println(totalTime);
    }
}
