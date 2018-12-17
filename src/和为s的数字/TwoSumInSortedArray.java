package 和为s的数字;

public class TwoSumInSortedArray {
    public int[] twoSum(int[] a,int s){
        if(a==null||a.length<2)
            return new int[0];
        int lo=0,hi=a.length-1;
        while (lo<hi){
            int sum=a[lo]+a[hi];
            if(sum<s){
                lo++;
            }
            else if(sum>s) {
                hi--;
            }
            else {
                return new int[]{a[lo],a[hi]};
            }
        }
        return new int[0];
    }
}
