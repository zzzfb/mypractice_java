package 最长不含重复字符的子字符串;

public class LongestSubstringTest {
    public static void main(String[] args){
        String str="arabcsacfr";
//        String str="a";
//        String str="ar";
//        String str="abcde";

        LongestSubstring lstr=new LongestSubstring();
        System.out.println(lstr.getLongestSubstring(str));
    }
}
