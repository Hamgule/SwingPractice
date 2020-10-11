import javax.swing.*;
import java.awt.*;

class Frame3 extends JFrame {
    public Frame3() {
        setSize(480, 360);
        setTitle("the title");

        // Default Setting Change (BorderLayout > FlowLayout)
        setLayout(new FlowLayout());

        // text on Button
        JButton button = new JButton("Button1");

        // add button on frame
        this.add(button);

        // to quit program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show/hide control (default: false)
        setVisible(true);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Frame3 f = new Frame3();
    }
}