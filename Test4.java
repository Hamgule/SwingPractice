import javax.swing.*;
import java.awt.event.*;

class Frame4 extends JFrame {
    private JButton button;
    private JPanel panel;
    private JLabel label;
    private int counter;

    public Frame4() {
        initUI();
    }

    public final void initUI() {
        setSize(480, 360);
        setTitle("Button Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        label = new JLabel(counter + "");
        button = new JButton("Click to add 1");
        counter = 0;

        button.addActionListener(new Listener());
        panel.add(button);
        panel.add(label);

        this.add(panel);
        this.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) label.setText(++counter + "");
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        new Frame4();
    }
}