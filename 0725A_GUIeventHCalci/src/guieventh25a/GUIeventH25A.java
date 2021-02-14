package guieventh25a;

import java.awt.*;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUIeventH25A extends Frame {
    
    public static void main(String[] args) {
        new GUI().setVisible(true);
    }
}

class GUI extends Frame
{
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;
    Label l1,l2,l3,l4,l5;
    Panel p1;

    private void addWindowListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
        setSize(400,300);
        setBackground(Color.lightGray);
        setLayout(null);
        addWindowListener(new F());
        
        
        p1=new Panel();
        p1.setLayout(null);
        p1.setBackground(Color.GRAY);
        p1.setBounds(50, 80, 300, 150);
        add(p1);

        l1=new Label("Mini Calculator");
        l1.setBounds(150, 40, 100, 20);
        add(l1);

        l2=new Label("1st No");
        l2.setBounds(50, 20, 50, 20);
        p1.add(l2);

        l3=new Label("2nd No");
        l3.setBounds(50, 60, 50, 20);
        p1.add(l3);

        l4=new Label("Result");
        l4.setBounds(140, 255, 50, 20);
        add(l4);

        l5=new Label("-------------");
        l5.setBounds(210, 255, 80, 20);
        add(l5);

        b1=new Button("+");
        b1.setBounds(35, 100, 30, 30);
        b1.addActionListener(new A());
        p1.add(b1);

        b2=new Button("-");
        b2.setBounds(85, 100, 30, 30);
        b2.addActionListener(new B());
        p1.add(b2);

        b3=new Button("*");
        b3.setBounds(135, 100, 30, 30);
        b3.addActionListener(new C());
        p1.add(b3);

        b4=new Button("/");
        b4.setBounds(185, 100, 30, 30);
        b4.addActionListener(new D());
        p1.add(b4);

        b5=new Button("%");
        b5.setBounds(235, 100, 30, 30);
        b5.addActionListener(new E());
        p1.add(b5);

        t1=new TextField();
        t1.setBounds(130, 20, 120, 20);
        t1.setForeground(Color.BLUE);
        p1.add(t1);

        t2=new TextField();
        t2.setBounds(130, 60, 120, 20);
        t2.setForeground(Color.BLUE);
        p1.add(t2);
    }
}
