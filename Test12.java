import javax.swing.*;
import java.awt.*;

class Example12 extends JFrame {
    private JPasswordField pass; // texts becomes starred
    private JTextArea area; // bigger jtextfield
    private JCheckBox check1;
    private JCheckBox check2;

    public Example12() {
        setLayout(new FlowLayout());
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pass = new JPasswordField("asdfasdfasdf");
        area = new JTextArea("Text Area");
        check1 = new JCheckBox("check me");
        check2 = new JCheckBox("check me");
        add(pass);
        add(area);
        add(check1);
        add(check2);

    }
}

public class Test12 {
    public static void main(String[] args) {
        Example12 ex = new Example12();
        ex.setVisible(true);
    }
}