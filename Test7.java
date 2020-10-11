import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame7 extends JFrame {
    private JButton button;
    private JPanel panel;
    private JLabel label;
    private int level;

    public Frame7() {
        initUI();
    }

    public final void initUI() {
        setSize(480, 360);
        setTitle("Probability");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        label = new JLabel("0", SwingConstants.CENTER);
        buttons = new JButton[10];

        panel.add(label);

        button = new JButton(level + "");
        button.addActionListener(new Listener());
        panel.add(button);

        this.add(panel);
        this.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buttons[i]) {
                
            }
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        new Frame7();
    }
}