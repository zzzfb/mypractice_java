package 扑克牌中的顺子;

public class Straight {
    public boolean isStraight(int[] a){
        if(a==null||a.length<5){
            return false;
        }
        insertSort(a);
        int countOf0=0;
        int d=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]==0){
                countOf0++;
                continue;
            }
            if(a[i]==a[i+1]){
                return false;
            }
            d+=a[i+1]-a[i]-1;
        }
        if(d>countOf0){
            return false;
        }
        return true;
    }

    public void insertSort(int[] a){
        for (int i=1;i<a.length;i++){
            for (int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
