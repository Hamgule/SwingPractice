import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example13 extends JFrame implements ActionListener {
    private JMenuBar bar;
    private JMenu menu;
    private JRadioButtonMenuItem red;
    private JRadioButtonMenuItem green;
    private JRadioButtonMenuItem blue;

    public Example13() {
        bar = new JMenuBar();
        menu = new JMenu("Colors");
        red = JRadioButtonMenuItem("Red");
        green = JRadioButtonMenuItem("Green");
        blue = JRadioButtonMenuItem("blue");

        setLayout(new FlowLayout());
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Colors");
        bar.add(menu);
        menu.add(red);
        menu.add(green);
        menu.add(blue);
        
        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(blue);
        group.add(green);
        add(bar);
        
    }
}