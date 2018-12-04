package 把数字翻译成字符串;

public class NumberToString {
    public int numberToString(int num){
        if(num<0)
            return 0;
        return numberToString(String.valueOf(num));
    }

    /*public int numberToString1(String num){
        char[] numArray=num.toCharArray();
        int len=numArray.length;
        int[] value=new int[len];
        for(int i=len-1;i>=0;i--){
            int count=1;
            if(i+1<=len-1){
                count--;
                count+=value[i+1];
                int num1=numArray[i]-'0';
                int num2=numArray[i+1]-'0';
                int digit=num1*10+num2;

                if(num1>0&&digit<=25){
                    count++;
                    if(i+2<=len-1){
                        count--;
                        count+=value[i+2];
                    }
                }
            }
            value[i]=count;
        }
        return value[0];
    }*/

    public int numberToString(String num){
        int val=1,val1=1,val2=1,k=0;//3个变量即可，无需定义数组
        for (int i=num.length()-2;i>=0;i--){
            int num1=num.charAt(i)-'0';//减字符‘0’，得到对应的数字
            int num2=num.charAt(i+1)-'0';
            int digit=num1*10+num2;
            if(digit<26)
                k=1;
            else
                k=0; //k不置为0会影响下次结果
            if(i==num.length()-2){
                val1=val2+k;
                val=val1;//只有两个数字时，不加此句会返回初始的val
                continue;
            }
            else{
                val=val1+k*val2;
                val2=val1;
                val1=val;
            }
        }
        return val;
    }
}
