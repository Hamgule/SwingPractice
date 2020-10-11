import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {

        // the title on top
        JFrame f = new JFrame("The title");

        // sizing frame
        f.setSize(480, 360);

        // to quit program
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // show/hide control (default: false)
        f.setVisible(true);
    }
}