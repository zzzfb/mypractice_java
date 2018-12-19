package 翻转单词顺序;

public class ReverseWordsTest {
    public static void main(String[] args){
        ReverseWords rw=new ReverseWords();
        System.out.println(rw.reverseWord("I am a student."));
        System.out.println(rw.reverseWord("student"));
        System.out.println(rw.reverseWord(null));
        System.out.println(rw.reverseWord(""));
        System.out.println(rw.reverseWord("  "));
    }
}
