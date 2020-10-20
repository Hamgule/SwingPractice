import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Example14 extends JFrame implements ActionListener {
    private JRadioButton red;
    private JRadioButton blue;
    private JRadioButton yellow;
    private JRadioButton green;
    private JRadioButton magenta;

    public Example14() {
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        
        red = new JRadioButton("Red");
        blue = new JRadioButton("Blue");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");
        magenta = new JRadioButton("Magenta");

        ButtonGroup group = new ButtonGroup();

        group.add(red);
        group.add(blue);
        group.add(yellow);
        group.add(green);
        group.add(magenta);

        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        magenta.addActionListener(this);

        add(red);
        add(blue);
        add(yellow);
        add(green);
        add(magenta);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) getContentPane().setBackground(Color.RED);
        if (e.getSource() == blue) getContentPane().setBackground(Color.BLUE);
        if (e.getSource() == yellow) getContentPane().setBackground(Color.YELLOW);
        if (e.getSource() == green) getContentPane().setBackground(Color.GREEN);
        if (e.getSource() == magenta) getContentPane().setBackground(Color.MAGENTA);
    }
}

public class Test14 {
    public static void main(String[] args) {
        Example14 ex = new Example14();
        ex.setVisible(true);
    }
}