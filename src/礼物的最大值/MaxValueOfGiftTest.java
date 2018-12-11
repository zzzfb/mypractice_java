package 礼物的最大值;

public class MaxValueOfGiftTest {
    public static void main(String[] args){
        //int[] a=null;
        //int[] a={1,10,3,8,12,2,9,6,5,7,4,11,3,7,16,5};
        //int[] a={1};
        int[] a={1,2,3};
        

        MaxValueOfGift mvg=new MaxValueOfGift();
        System.out.println(mvg.getMaxValue(a,3,1));
    }
}
