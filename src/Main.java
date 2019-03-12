import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        double res=1;
        int up=n;
        int down=1;
        for(int i=1;i<=s;i++){
            res*=(up/down);
            up--;
            down++;
        }
        res=res*(Math.pow(2,n-s));
        System.out.println((int)(res%(Math.pow(10,9)+7)));
    }
}
