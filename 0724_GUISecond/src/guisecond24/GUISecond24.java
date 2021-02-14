package guisecond24;

import java.awt.*;

public class GUISecond24 {

    public static void main(String[] args) {
        GUI2 g1=new GUI2();
        g1.f.setVisible(true);
    }
}

class GUI2
{
    Frame f;
    Button b;
    TextField t;
    Label l;
            
    GUI2(){
        f=new Frame("Second GUI Project");
//        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(null);

        l=new Label("Hello GUI");
        l.setBounds(60, 100, 80, 20);
        f.add(l);
        
        b=new Button("OK");
        b.setBounds(60, 300, 80, 20);
        f.add(b);

        t=new TextField();
        t.setBounds(60, 200, 50, 20);
        f.add(t);
    }
}