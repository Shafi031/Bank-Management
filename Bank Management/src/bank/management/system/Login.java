package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel label1,label2,label3;
    JTextField textField2;
    JPasswordField passwordField2;
    JButton button1;
    JButton button2;
    JButton button3;

    Login(){
        super("Bank Management System");


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/vecteezy_bangladeshi-taka-currency-symbol_19938876.png"));
        Image i2 = i1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        label1 = new JLabel("Welcome to FinBank");
        Font customFont = new Font("JetBrains Mono", Font.BOLD, 25);
        label1.setFont(customFont);
        label1.setForeground(Color.DARK_GRAY);
        label1.setBounds(270,115,450,40);
        add(label1);


        label2 = new JLabel("Card No. ");
        Font customFont1 = new Font("JetBrains Mono", Font.BOLD, 20);
        label2.setFont(customFont1);
        label2.setForeground(Color.black);
        label2.setBounds(200,175,450,40);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,180,260,30);
        textField2.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField2);

        label3 = new JLabel("Pin. ");
        label3.setFont(customFont1);
        label3.setForeground(Color.black);
        label3.setBounds(200,220,450,40);
        add(label3);

        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(325,228,260,30);
        passwordField2.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(passwordField2);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("JetBrains Mono",Font.BOLD,15));
        button1.setForeground(Color.BLACK);
        button1.setBounds(325,280,100,30);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("JetBrains Mono",Font.BOLD,15));
        button2.setForeground(Color.BLACK);
        button2.setBounds(484,280,100,30);
        add(button2);










        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("Icon/geometric_perspective_line_pattern_background.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,850,480);
        add(iimage);

        setLayout(null);
        setSize(850,480);
        setLocation(380,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
     
}
