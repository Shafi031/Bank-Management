package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {
    JTextField textField4,textField5,textField7,textField8,textField9,textField10,textField11,textField12,textField13;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,r4,r5;
    JButton button1;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("REGISTER FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/vecteezy_bangladeshi-taka-currency-symbol_19938876.png"));
        Image i2 = i1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,5,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(255,90,600,40);
        label1.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(370,115,600,40);
        label2.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(310,135,600,40);
        label3.setFont(new Font("JetBrains Mono", Font.BOLD, 18));
        add(label3);

//        start form
        JLabel label4 = new JLabel("Name.");
        label4.setBounds(100,200,600,40);
        label4.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label4);

        textField4 = new JTextField(15);
        textField4.setBounds(325,205,400,30);
        textField4.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField4);

        JLabel label5 = new JLabel("Father's Name.");
        label5.setBounds(100,240,600,40);
        label5.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label5);

        textField5 = new JTextField(15);
        textField5.setBounds(325,245,400,30);
        textField5.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField5);

        JLabel label6 = new JLabel("Gender.");
        label6.setBounds(100,280,600,40);
        label6.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label6);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        r1.setBounds(400,280,90,40);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        r2.setBounds(550,280,110,40);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel label7 = new JLabel("Date of Birth.");
        label7.setBounds(100,320,600,40);
        label7.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label7);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105 ,105,105));
        dateChooser.setBounds(325,325,400,30);
        add(dateChooser);

        JLabel label8 = new JLabel("Email.");
        label8.setBounds(100,360,600,40);
        label8.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label8);

        textField8 = new JTextField(15);
        textField8.setBounds(325,365,400,30);
        textField8.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField8);

        JLabel label9 = new JLabel("Marital Status.");
        label9.setBounds(100,400,600,40);
        label9.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label9);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        r3.setBounds(325,400,100,40);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        r4.setBounds(475,400,110,40);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("JetBrains Mono", Font.BOLD, 15));
        r5.setBounds(625,400,100,40);
        add(r5);

        buttonGroup.add(r3);
        buttonGroup.add(r4);
        buttonGroup.add(r5);

        JLabel label10 = new JLabel("Address.");
        label10.setBounds(100,440,600,40);
        label10.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label10);

        textField10 = new JTextField(15);
        textField10.setBounds(325,445,400,30);
        textField10.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField10);

        JLabel label11 = new JLabel("City.");
        label11.setBounds(100,480,600,40);
        label11.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label11);

        textField11 = new JTextField(15);
        textField11.setBounds(325,485,400,30);
        textField11.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField11);

        JLabel label12 = new JLabel("Pin Code.");
        label12.setBounds(100,520,600,40);
        label12.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label12);

        textField12 = new JTextField(15);
        textField12.setBounds(325,525,400,30);
        textField12.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField12);

        JLabel label13 = new JLabel("State.");
        label13.setBounds(100,560,600,40);
        label13.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        add(label13);

        textField13 = new JTextField(15);
        textField13.setBounds(325,565,400,30);
        textField13.setFont(new Font("JetBrains Mono",Font.BOLD,20));
        add(textField13);

        button1 = new JButton("Next.");
        button1.setFont(new Font("JetBrains Mono",Font.BOLD,15));
        button1.setForeground(Color.BLACK);
        button1.setBounds(470,625,100,30);
//        button1.addActionListener(this);
        add(button1);



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
