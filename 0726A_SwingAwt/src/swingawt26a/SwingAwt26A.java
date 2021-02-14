package swingawt26a;

import java.awt.*;
import javax.swing.*;

public class SwingAwt26A {

    public static void main(String[] args) {
        Frame f1=new Frame("AWT");
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(400, 300);
        Button b1=new Button("OK");
        b1.setBounds(200, 80, 75, 50);
        f1.add(b1);
        
        JFrame f2=new JFrame("SWING");
        f2.setLayout(null);
        f2.setVisible(true);        
        f2.setSize(400, 300);
        JButton b2=new JButton("OK");
        b2.setBounds(200, 100, 75, 50);
        f2.add(b2);
    }
    
}
