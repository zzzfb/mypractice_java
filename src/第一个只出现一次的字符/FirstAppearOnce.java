package 第一个只出现一次的字符;

public class FirstAppearOnce {
    public char getFirstAppearOnce(String str){
        if(str==null||str.length()==0)
            return '\0';//返回空字符'\0',不是''
        int[] count=new int[256];
        for (int i=0;i<str.length();i++){
            count[str.charAt(i)]++;//用for循环，内部i无需自增
        }
        for (int i=0;i<str.length();i++){//不是遍历count数组
            if(count[str.charAt(i)]==1)
                return str.charAt(i);
        }
        return '\0';
    }
}