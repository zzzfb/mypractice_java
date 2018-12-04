package timer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class TimerTest {
    static int[] a=new int[100000000];
    public static void main(String[] args){
        ActionListener listener=new TimerPrint();
        Timer t=new Timer(5000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"stop");
        System.exit(0);
    }
}
class TimerPrint implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date());
    }
}