import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Example13 extends JFrame implements ActionListener {
    private JMenuBar bar;
    private JMenu menu;
    private JRadioButtonMenuItem red;
    private JRadioButtonMenuItem green;
    private JRadioButtonMenuItem blue;

    public Example13() {
        bar = new JMenuBar();
        menu = new JMenu("Colors");
        red = new JRadioButtonMenuItem("Red");
        green = new JRadioButtonMenuItem("Green");
        blue = new JRadioButtonMenuItem("Blue");

        setLayout(new FlowLayout());
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Colors");
        bar.add(menu);
        menu.add(red);
        menu.add(green);
        menu.add(blue);
        
        ButtonGroup group = new ButtonGroup();
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        group.add(red);
        group.add(green);
        group.add(blue);
        add(bar);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) getContentPane().setBackground(Color.RED);
        if (e.getSource() == green) getContentPane().setBackground(Color.GREEN);
        if (e.getSource() == blue) getContentPane().setBackground(Color.BLUE);
    }
}

public class Test13 {
    public static void main(String[] args) {
        Example13 ex = new Example13();
        ex.setVisible(true);
    }
}
