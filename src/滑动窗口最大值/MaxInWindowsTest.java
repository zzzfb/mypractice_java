package 滑动窗口最大值;

public class MaxInWindowsTest {
    public static void main(String[] args){
        MaxInWindows mw=new MaxInWindows();
        int[] a={2,3,4,2,6,2,5,1};
        System.out.println(mw.maxInWindows(a,3));
    }
}
