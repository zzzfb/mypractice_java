package enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARCE) ");
        String input=in.next().toUpperCase();

        Size size=Enum.valueOf(Size.class,input);

        System.out.println(size);
    }
}
enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L");

    private String abb;

    private Size(String abb){this.abb=abb;}

    public String getAbb() {
        return abb;
    }
}