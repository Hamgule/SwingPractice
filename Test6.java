import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame6 extends JFrame {
    private JButton[] buttons;
    private JPanel panel;
    private JLabel label;

    public Frame6() {
        initUI();
    }

    public final void initUI() {
        setSize(170, 200);
        setTitle("Phone Number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        label = new JLabel("", SwingConstants.CENTER);
        buttons = new JButton[10];

        label.setPreferredSize(new Dimension(150, 20));
        panel.add(label);

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(((i + 1) % 10) + "");
            buttons[i].addActionListener(new Listener());
            panel.add(buttons[i]);
        }

        this.add(panel);
        this.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 10; i++) {
                boolean cond = label.getText().length() == 2 || label.getText().length() == 7;
                if(e.getSource() == buttons[i]) {
                    if (label.getText().length() < 13) label.setText(label.getText() + ((i + 1) % 10) + (cond ? "-" : ""));
                }
            }
        }
    }
}

public class Test6 {
    public static void main(String[] args) {
        new Frame6();
    }
}