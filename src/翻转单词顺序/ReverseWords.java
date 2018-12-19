package 翻转单词顺序;

public class ReverseWords {
    public String reverseWord(String str){
        if(str==null||str.length()==0){
            return new String();
        }
        char[] ch=str.toCharArray();
        reserve(ch,0,ch.length-1);
        /*for (int i=0;i<(ch.length+1)/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }*/
        int lo=0,hi=0;
        for (int i=0;i<ch.length;i++){
            while (i<ch.length&&ch[i]==' '){//！！！每一次内部循环i++后都要判断i<ch.length，否则有可能发生越界！！！
                i++;
            }
            if(i<ch.length){//str只包含' '时,发生越界,需额外判断i<ch.length
                lo=i;
            }
            while (i<ch.length&&ch[i]!=' '){
                i++;
            }
            hi=i-1;//i索引对应' '
            reserve(ch,lo,hi);
        }
        String res=String.valueOf(ch);
        return res;
    }

    public void reserve(char[] ch,int lo,int hi){
        //计算中间值较麻烦
        /*int mid=lo+(hi-lo)/2;
        for (int i=lo;i<=mid;i++){
            char temp=ch[i];
            ch[i]=ch[hi-(i-lo)];
            ch[hi-i+lo]=temp;
        }*/
        while (lo<=hi){
            char temp=ch[lo];
            ch[lo]=ch[hi];
            ch[hi]=temp;
            lo++;
            hi--;
        }
    }
}
