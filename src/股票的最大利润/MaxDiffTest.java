package 股票的最大利润;

public class MaxDiffTest {
    public static void main(String[] args){
        //int[] a={9,11};
        int[] a={11,9,8};
        //int[] a={9,11,8,5,7,12,16,14};
        MaxDiff md=new MaxDiff();
        System.out.println(md.getMaxDiff(a));
    }
}
