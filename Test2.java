import javax.swing.*;

// Using inheritance
class Frame2 extends JFrame {
    public Frame2() {
        setTitle("the title");
        setSize(480, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Test2 {
    public static void main(String[] args) {
        new Frame2();
    }
}