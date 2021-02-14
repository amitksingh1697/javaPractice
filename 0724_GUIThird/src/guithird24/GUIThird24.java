package guithird24;

import java.awt.*;

public class GUIThird24{

    public static void main(String[] args) {
        GUI3 g=new GUI3();
        g.setVisible(true);
    }
    
}

class GUI3 extends Frame
{
    Button b;
    TextField t;
    Label l;  
    GUI3(){
        super("Inherited GUI");
//        setTitle("Inherited GUI");
        setLayout(null);
        setSize(400,400);
        
        l=new Label("Hello GUI");
        l.setBounds(60, 100, 80, 20);
        add(l);
        
        b=new Button("OK");
        b.setBounds(60, 300, 80, 20);
        add(b);

        t=new TextField();
        t.setBounds(60, 200, 50, 20);
        add(t);
    }
}