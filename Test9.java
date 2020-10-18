import javax.swing.*;
import java.awt.*;

class Frame9 {
    private JFrame f;
    private JLabel l;

    private int w, h;

    public Frame9() {
        f = new JFrame();

        f.setVisible(true);
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Window");
        f.setResizable(false);
        
    }
    
}

public class Test9 {
    public static void main(String[] args) {
        new Frame9();
    }
}