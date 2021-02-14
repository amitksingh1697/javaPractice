import com.zetcode.Board;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;


public class Snakes extends JFrame {

    public Snakes() {

        
        //setResizable(false);
        //pack();
       this.setSize(300,300);
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new Snakes();
                Board b=new Board();
               ex.add(b);
                ex.setVisible(true);                
            }
        });
    }
}