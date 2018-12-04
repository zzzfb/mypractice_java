package 最长不含重复字符的子字符串;

public class LongestSubstring {
    public int getLongestSubstringLength(String str){
        if(str==null||str.length()==0)
            return 0;
        if(str.length()==1)
            return 1;
        int length=1;
        int maxLength=0;
        String subStr=null;
        String resStr=null;
        int lo=0;
        for(int i=1;i<str.length();i++){
            subStr=str.substring(lo,i);
            String goal=str.substring(i,i+1);
            if(subStr.contains(goal)){
                length=subStr.length()-subStr.indexOf(goal);
                lo=i-length+1;
            }
            else {
                length++;
            }
            if(length>maxLength){
                maxLength=length;
                resStr=str.substring(i-length+1,i+1);
            }
        }
        return maxLength;
    }
    public String  getLongestSubstring(String str){
        if(str==null||str.length()==0)
            return null;
        if(str.length()==1)
            return str;
        int length=1;
        int maxLength=0;
        String subStr=null;
        String resStr=null;
        int lo=0;
        for(int i=1;i<str.length();i++){
            subStr=str.substring(lo,i);
            String goal=str.substring(i,i+1);
            if(subStr.contains(goal)){
                length=subStr.length()-subStr.indexOf(goal);
                lo=i-length+1;
            }
            else {
                length++;
            }
            if(length>maxLength){
                maxLength=length;
                resStr=str.substring(i-length+1,i+1);
            }
        }
        return resStr;
    }
}
