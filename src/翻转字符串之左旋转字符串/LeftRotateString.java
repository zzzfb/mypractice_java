package 翻转字符串之左旋转字符串;

public class LeftRotateString {
    public String leftRotate(String str,int k){
        if(str==null||str.length()==0||k<0||k>str.length()){
            return new String();
        }
        if(k==0||k==str.length()){//该判断在这里可省略，原因是对lo，hi赋值完后在reverse中正好不满足lo<=hi，不会发生越界
            return str;
        }

        char[] ch=str.toCharArray();
        reverse(ch,0,ch.length-1);
        int lo=0,hi=ch.length-k-1;
        reverse(ch,lo,hi);
        lo=hi+1;
        hi=ch.length-1;
        reverse(ch,lo,hi);
        String res=String.valueOf(ch);
        return res;
    }

    public void reverse(char[] ch,int lo,int hi){
        while (lo<=hi){
            char temp=ch[lo];
            ch[lo]=ch[hi];
            ch[hi]=temp;
            lo++;//忘记更新循环变量
            hi--;
        }
    }
}
