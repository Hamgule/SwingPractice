import javax.swing.*;
import java.awt.*;

class Example10 extends JFrame {
    private static JTextField canChange;
    private static JTextField cantChange;

    public Example10() {
        canChange = new JTextField("Default Text");
        cantChange = new JTextField("Cant change me");

        // no layout
        setLayout(null);

        Dimension size1 = canChange.getPreferredSize();
        Dimension size2 = cantChange.getPreferredSize();
        canChange.setBounds(100, 20, size1.width, size1.height);
        cantChange.setBounds(100, 55, size2.width, size2.height);
        
        // canChange.setEditable(true);
        cantChange.setEditable(false);

        add(canChange);
        add(cantChange);
        setSize(350, 300);
        setTitle("JTextFields");
        
        // to quit program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class Test10 {
    public static void main(String[] args) {
        Example10 s = new Example10();
        s.setVisible(true);
    }
} 