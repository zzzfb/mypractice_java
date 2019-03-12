package a笔试题.牛客网;

import java.util.*;
public class NowCoder {
    public static void main(String[] args){
        String str1 = "   ";
        System.out.println(isSame(str1));
    }

    //第1题 判断回文字符串，排除非字母字符，忽略大小写
    public static boolean isSame(String str){
        if(str == null){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        //sb.toString();
        int i = 0;
        int n = sb.length() - 1;
        while(i < n){
            if(sb.charAt(i) != sb.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    //第2题  反转整数
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int result = 0;
        while(num > 0){
            int d = num % 10;
            result = result * 10 + d;
            num = num / 10;
        }
        System.out.println(result);
    }*/

    //第3题 三数和
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
