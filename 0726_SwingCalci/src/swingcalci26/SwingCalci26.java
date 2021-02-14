package swingcalci26;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingCalci26 {

    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
    
}

class GUI extends Frame
{
    JButton b1,b2,b3,b4,b5;
    JTextField t1,t2;
    JLabel l1,l2,l3,l4,l5;
    JPanel p1;

    class A implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            try{
                   String s1=t1.getText();
                   String s2=t2.getText();
                   int n1=Integer.parseInt(s1);
                   int n2=Integer.parseInt(s2);
                   int n=n1+n2;
                   String s=String.valueOf(n);
                   l5.setText(s);
            }
            catch(Exception ex)
            {
               l5.setText("Wrong entries !");
            }
        }
    }
    class B implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
                try{
                   String s1=t1.getText();
                   String s2=t2.getText();
                   int n1=Integer.parseInt(s1);
                   int n2=Integer.parseInt(s2);
                   int n=n1-n2;
                   String s=String.valueOf(n);
                   l5.setText(s);
            }
            catch(Exception ex)
            {
               l5.setText("Wrong entries !");
            }
        }
    }
    class C implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
                try{
                   String s1=t1.getText();
                   String s2=t2.getText();
                   int n1=Integer.parseInt(s1);
                   int n2=Integer.parseInt(s2);
                   int n=n1*n2;
                   String s=String.valueOf(n);
                   l5.setText(s);
            }
            catch(Exception ex)
            {
               l5.setText("Wrong entries !");
            }
        }
    }
    class D implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
                try{
                   String s1=t1.getText();
                   String s2=t2.getText();
                   int n1=Integer.parseInt(s1);
                   int n2=Integer.parseInt(s2);
                   int n=n1/n2;
                   String s=String.valueOf(n);
                   l5.setText(s);
            }
            catch(Exception ex)
            {
               l5.setText("Wrong entries !");
            }
        }
    }
    class E implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
                try{
                   String s1=t1.getText();
                   String s2=t2.getText();
                   int n1=Integer.parseInt(s1);
                   int n2=Integer.parseInt(s2);
                   int n=n1%n2;
                   String s=String.valueOf(n);
                   l5.setText(s);
            }
            catch(Exception ex)
            {
               l5.setText("Wrong entries !");
            }
        }
    }
    
    class F implements WindowListener
    {
        public void windowOpened(WindowEvent e) {}

        public void windowClosing(WindowEvent e) {
            dispose();  //System.exit(0);
        }

        public void windowClosed(WindowEvent e) {}

        public void windowIconified(WindowEvent e) {}

        public void windowDeiconified(WindowEvent e) {}

        public void windowActivated(WindowEvent e) {}
        
        public void windowDeactivated(WindowEvent e) {}
    }
    
    GUI(){
        super("Mini Calci");
        setSize(400,320);
        setBackground(Color.lightGray);
        setLayout(null);
        addWindowListener(new F());
        
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.GRAY);
        p1.setBounds(50, 80, 300, 150);
        add(p1);

        l1=new JLabel("Mini Calculator");
        l1.setBounds(150, 40, 100, 20);
        add(l1);

        l2=new JLabel("1st No");
        l2.setBounds(40, 20, 50, 20);
        p1.add(l2);

        l3=new JLabel("2nd No");
        l3.setBounds(40, 60, 50, 20);
        p1.add(l3);

        l4=new JLabel("Result");
        l4.setBounds(120, 255, 50, 20);
        add(l4);

        l5=new JLabel("--------------------");
        l5.setBounds(190, 255, 100, 20);
        add(l5);

        b1=new JButton("+");
        b1.setBounds(28, 100, 45, 45);
        b1.addActionListener(new A());
        p1.add(b1);

        b2=new JButton("-");
        b2.setBounds(78, 100, 45, 45);
        b2.addActionListener(new B());
        p1.add(b2);

        b3=new JButton("*");
        b3.setBounds(128, 100, 45, 45);
        b3.addActionListener(new C());
        p1.add(b3);

        b4=new JButton("/");
        b4.setBounds(178, 100, 45, 45);
        b4.addActionListener(new D());
        p1.add(b4);

        b5=new JButton("%");
        b5.setBounds(228, 100, 45, 45);
        b5.addActionListener(new E());
        p1.add(b5);

        t1=new JTextField();
        t1.setBounds(130, 20, 120, 20);
        t1.setForeground(Color.BLUE);
        p1.add(t1);

        t2=new JTextField();
        t2.setBounds(130, 60, 120, 20);
        t2.setForeground(Color.BLUE);
        p1.add(t2);
    }
}

