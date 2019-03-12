package a笔试题.神策数据;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //第1题 数组中最长和为0的子序列

        //第2题 （a,b）至少求和多少次，每次取较大值，才能大于给定值m
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        //if(a>=m||b>=m)
        //    System.out.print(0);
        int count =0;
        while(a<m&&b<m){
            int sum=a+b;
            if(sum<=Math.min(a,b)){
                System.out.print(-1);
                return;
            }else { //去除最小数
                if(a<=b){
                    a=b;
                    b=sum;
                }else if(b<=a){
                    b=a;
                    a=sum;
                }
            }
            count++;
        }
        System.out.print(count);
    }
}
