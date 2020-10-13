import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
// import java.util.Timer;
// import java.util.TimerTask;

class Frame7 extends JFrame {
    private JButton button;
    private JPanel panel;
    private JLabel successOrFailLabel;
    private JLabel probLabel;
    private int level;

    public Frame7() {
        initUI();
    }

    public final void initUI() {
        setSize(480, 360);
        setTitle("Probability");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();

        successOrFailLabel = new JLabel("", SwingConstants.CENTER);
        probLabel = new JLabel("100%", SwingConstants.CENTER);
        button = new JButton("" + level);

        button.addActionListener(new Listener());

        panel.setLayout(new GridLayout(3, 1));
        panel.add(successOrFailLabel);
        panel.add(button);
        panel.add(probLabel);

        successOrFailLabel.setFont(new Font("Gothic", Font.PLAIN, 50));
        button.setFont(new Font("Gothic", Font.PLAIN, 50));
        probLabel.setFont(new Font("Gothic", Font.PLAIN, 50));

        this.add(panel);
        this.setVisible(true);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) {
                String buttonText = button.getText();
                String labelText = probLabel.getText();
                labelText = labelText.substring(0, labelText.length() - 1);

                int buttonLevel = Integer.parseInt(buttonText);
                double labelProb = Double.parseDouble(labelText) / 100;

                if (labelProb > Math.random()) {
                    successOrFailLabel.setText("Success");
                    buttonLevel++;
                }
                else {
                    successOrFailLabel.setText("Fail");
                    buttonLevel--;
                }

                button.setText("" + buttonLevel);
                probLabel.setText(String.format("%d%%", 105 - buttonLevel * 10));
                
            }
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        new Frame7();
    }
}