package guiminical24;

import java.awt.Button;
import java.awt.*;

public class GUIMiniCal {

    public static void main(String[] args) {
        GUIMiniC g=new GUIMiniC();
        g.setVisible(true);
    }
}

class GUIMiniC extends Frame
{
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;
    Label l1,l2,l3,l4,l5;
    Panel p1;
    
    GUIMiniC(){
        super("Mini Calci");
        setLayout(null);
        setSize(400,300);
        setBackground(Color.lightGray);
        
        Panel p1=new Panel();
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
        l5.setBounds(210, 255, 50, 20);
        add(l5);
        
        b1=new Button("+");
        b1.setBounds(35, 100, 30, 30);
        p1.add(b1);
        
        b2=new Button("-");
        b2.setBounds(85, 100, 30, 30);
        p1.add(b2);
        
        b3=new Button("/");
        b3.setBounds(135, 100, 30, 30);
        p1.add(b3);
        
        b4=new Button("*");
        b4.setBounds(185, 100, 30, 30);
        p1.add(b4);
        
        b5=new Button("%");
        b5.setBounds(235, 100, 30, 30);
        p1.add(b5);

        t1=new TextField();
        t1.setBounds(130, 20, 120, 20);
        t1.setForeground(Color.white);
        p1.add(t1);
        
        t2=new TextField();
        t2.setBounds(130, 60, 120, 20);
        t2.setForeground(Color.white);
        p1.add(t2);
    }
}