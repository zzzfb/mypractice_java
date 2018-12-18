package 和为s的连续正数序列;

public class SerialSum {
    public void serialSum(int s){
        if(s<3){
            return;
        }
        int lo=1,hi=2;
        int sum=lo+hi;
        while (lo<hi&&lo<((s+1)>>1)){
            /*for (int i=lo;i<=hi;i++){
                sum+=i;
            }*/
            if(sum<s){
                hi++;
                sum+=hi;
            }else if(sum>s){
                //顺序错误
                //lo++;
                //sum-=lo;
                sum-=lo;
                lo++;
            }else {
                for (int i=lo;i<=hi;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                hi++;
                sum+=hi;
            }
        }
    }
}
