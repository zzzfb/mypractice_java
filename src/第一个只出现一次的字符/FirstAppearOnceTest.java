package 第一个只出现一次的字符;

public class FirstAppearOnceTest {
    public static void main(String[] args){
        String str="abaccddff";
        //String str="";
        FirstAppearOnce fao=new FirstAppearOnce();
        System.out.println(fao.getFirstAppearOnce(str));
    }
}
