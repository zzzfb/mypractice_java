package a笔试题.公司360;

// 360笔试题-2019暑期实习
public class WrittenTest_360 {

    //第1题，淘气值排座位，最小同桌和
    /*public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int maxSum=0;
        int sum=0;
        int lo=0,hi=2*(n-m)-1;

        while(lo<hi){
            sum=a[lo++]+a[hi--];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.print(maxSum);
    }*/

    //第2题，包含星星的矩阵个数
    /*public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        int[][] a=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=str[i].charAt(j)-'0';
            }
        }
        //判断星星位置
        int[][] location=new int[][];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(a[i][j]==1&&a[i][j-1]==1&&a[i][j+1]==1&&a[i-1][j]==1&&a[i+1][j]==1){
                    //count++;
                }
            }
        }

    }*/

}