package guifirst24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class GUIFirst24 {

    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("First GUI Project");
//        Frame f=new Frame("First GUI Project");
        f.setSize(400, 300);//setting Size of the Frame
        f.setVisible(true);// To make visible the Frame
        f.setLayout(null);
        
        Button b=new Button("OK");
        b.setBounds(60, 80, 50, 40);//setting size and location of the button
        f.add(b);
        
        TextField t=new TextField();
        t.setBounds(60, 180, 80, 20);
        f.add(t);
        
    }
    
}
