package 数组中的逆序对;

public class InversePairTest {
    public static void main(String[] args){
        //int[] a={7,5,6,4};
        //int[] a={4,5,6,7};
        //int[] a={7,6,5,4};
        //int[] a={7,6,6,4};
        int[] a={7};
        InversePair inv=new InversePair();
        System.out.println(inv.getInversePairs(a));
    }
}
