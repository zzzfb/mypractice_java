package 斐波那契数列;

public class Fibonacci {
    public int fibonacci(int n){
        if(n<0)
            return -1;
        if(n==0||n==1)
            return n;
        int first=0,second=1;
        int result=0;
        for (int i=2;i<=n;i++){
            result=first+second;
            first=second;
            second=result;
        }
        return result;
    }
}
