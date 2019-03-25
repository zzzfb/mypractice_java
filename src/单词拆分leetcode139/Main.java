package 单词拆分leetcode139;


import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        String s="catsandog";
        System.out.println(wordBreak(s,wordDict));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n];
        dp[0]=wordDict.contains(s.substring(0,1));
        for(int i=1;i<n;i++){
            boolean tmp=false;
            for(int j=0;j<i;j++){
                tmp=tmp||(dp[j]&& wordDict.contains(s.substring(j+1,i+1)));
            }
            dp[i]=tmp||wordDict.contains(s.substring(0,i+1));
        }
        return dp[n-1];
    }

}

