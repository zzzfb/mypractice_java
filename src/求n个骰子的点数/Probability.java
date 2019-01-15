package 求n个骰子的点数;

public class Probability {
    public void getProbability(int n){
        if(n<=0){
            return;
        }
        int[] countCurrent=new int[n*6+1];
        int[] countNext=new int[n*6+1];
        for (int i=1;i<=6;i++){
            countCurrent[i]=1;
            countNext[i]=1;
        }
        for (int k=2;k<=n;k++){
            for (int i=0;i<k;i++){  //前k位需要手动置0，否则会保留上次结果中的1
                countNext[i]=0;
            }
            for (int i=k;i<=k*6;i++){
                int index=i;
                int sum=0;
                while (index-1>=0&&index-1>=i-6){ //需保证index-1不会越界
                    sum+=countCurrent[index-1];  //从index-1开始，不是index
                    index--;
                }
                countNext[i]=sum;
            }
            int[] temp=countCurrent;//不能用countNext=countCurrent浅复制，两引用指向同一数组
            countCurrent=countNext;
            countNext=temp;
        }
        double total=Math.pow(6,n);
        //int totalCount=0;
        for (int i=n;i<=n*6;i++){
            //totalCount+=countCurrent[i];
            System.out.println(i+":"+countCurrent[i]+"/"+total);//最后一次交换后，保存在countCurrent中
        }
        //System.out.println(totalCount);
    }
}
