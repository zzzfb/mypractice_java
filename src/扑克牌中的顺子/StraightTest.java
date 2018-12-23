package 扑克牌中的顺子;

public class StraightTest {
    public static void main(String[] args){
//        int[] a={1,2,3,4,5};
//        int[] a={1,3,4,5,6};
//        int[] a={0,1,2,3,5};
//        int[] a={0,1,2,3,6};
//        int[] a={0,0,1,3,5};
        int[] a={0,0,1,4,6};
        Straight st=new Straight();
        System.out.println(st.isStraight(a));
    }
}
