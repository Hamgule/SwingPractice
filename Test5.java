import javax.swing.*;
import java.awt.event.*;

class Frame5 extends JFrame {
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JPanel panel;
    private JLabel label;
    private int counter;

    public Frame5() {
        initUI();
    }

    public final void initUI() {
        setSize(480, 360);
        setTitle("Button Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        label = new JLabel(counter + "");
        buttonPlus = new JButton("Click to + 1");
        buttonMinus = new JButton("Click to - 1");
        counter = 0;

        buttonPlus.addActionListener(new Listener());
        buttonMinus.addActionListener(new Listener());
        panel.add(buttonMinus);
        panel.add(buttonPlus);
        panel.add(label);

        this.add(panel);
        this.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buttonPlus) label.setText(++counter + "");
            if(e.getSource() == buttonMinus) label.setText(--counter + "");
        }
    }
}

public class Test5 {
    public static void main(String[] args) {
        new Frame5();
    }
}