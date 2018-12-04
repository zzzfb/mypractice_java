package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


public class lambdaTest {
    public static void main(String[] args) {
        String[] name = {"qaz", "wsxc", "etuuhn", "ld", "euiof"};
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        Arrays.sort(name, (string1, string2) -> string1.length() - string2.length());
        System.out.println(Arrays.toString(name));

        Timer t=new Timer(1000,event->System.out.println(new Date()));
        t.start();
        JOptionPane.showMessageDialog(null,"stop");
        System.exit(0);
    }
}
