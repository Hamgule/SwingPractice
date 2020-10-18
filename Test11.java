import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Example11 extends JFrame implements ActionListener {
    private JLabel enterName;
    private JTextField name;
    private JButton click;
    private String storeName = "";
    
    public Example11() {
        setLayout(null);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        enterName = new JLabel("Enter Your Name: ");
        click = new JButton("Click");
        name = new JTextField();
        
        enterName.setBounds(60, 30, 120, 30);
        name.setBounds(80, 60, 130, 30);
        click.setBounds(100, 150, 80, 30);
        click.addActionListener(this);

        add(enterName);
        add(name);
        add(click);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == click) {
            storeName = name.getText();
            JOptionPane.showMessageDialog(null, "Hello " + storeName);
            System.exit(0);
        }
    }
}

public class Test11 {
    public static void main(String[] args) {
        Example11 ex = new Example11();
        ex.setVisible(true);
    }
}