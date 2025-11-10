package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("REGISTER FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/vecteezy_bangladeshi-taka-currency-symbol_19938876.png"));
        Image i2 = i1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(255,90,600,40);
        label1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label1);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(380,20);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Signup();
    }
}
