import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class Frame7 extends JFrame {
    private JButton button;
    private JPanel panel;
    private JLabel successOrFailLabel;
    private JLabel sucProbLabel, failProbLabel;
    private int level;
    private Timer t;

    // constructor
    public Frame7() {

        setSize(480, 360);
        setTitle("Probability");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();

        successOrFailLabel = new JLabel("Press Button to Start", SwingConstants.CENTER);
        sucProbLabel = new JLabel("100%", SwingConstants.CENTER);
        failProbLabel = new JLabel("0%", SwingConstants.CENTER);
        button = new JButton("" + level);

        EnhancingEvent e = new EnhancingEvent();
        button.addActionListener(e);

        panel.setLayout(new GridLayout(3, 1));

        panel.add(successOrFailLabel);
        panel.add(button);
        panel.add(sucProbLabel);
        // panel.add(failProbLabel);

        successOrFailLabel.setFont(new Font("Gothic", Font.PLAIN, 45));
        button.setFont(new Font("Gothic", Font.PLAIN, 45));
        sucProbLabel.setFont(new Font("Gothic", Font.PLAIN, 45));

        this.add(panel);
        this.setVisible(true);
    }

    public class EnhancingEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int count = 3;
            successOrFailLabel.setText("Enhancing ");

            TimeClass tc = new TimeClass(count);
            t = new Timer(1000, tc);
            t.start();
        }
    }

    public class TimeClass implements ActionListener {
        int counter;

        public TimeClass(int counter) {
            this.counter = counter;
        }

        public void actionPerformed(ActionEvent tc) {
            counter--;
            
            if (counter >= 0) {
                successOrFailLabel.setText(successOrFailLabel.getText() + ".");
            }
            else {
                t.stop();

                String buttonText = button.getText();
                String labelText = sucProbLabel.getText();
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
                sucProbLabel.setText(String.format("%d%%", 105 - buttonLevel * 10));
            
            }
                
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        new Frame7();
    }
}