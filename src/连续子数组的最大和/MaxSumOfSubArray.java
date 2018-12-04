package 连续子数组的最大和;

public class MaxSumOfSubArray {
    public static void main(String[] args){
        //int[] a={1,-2,3,10,-4,7,2,-5};
        //int[] a={1,2,3,4};
        int[] a={-1,-2,-3,-4};
        int res=maxSum(a);
        System.out.println(res);
    }

    public static int maxSum(int[] a){
        if(a==null||a.length==0)
            return 0;
        int max=Integer.MIN_VALUE;   //不能初始化为0，数组全为负数，最大和也为负
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(sum<0)
                sum=a[i];
            else            //忘加else
                sum+=a[i];

            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
