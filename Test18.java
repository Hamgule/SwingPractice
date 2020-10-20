import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

class Ex18Graphics extends JPanel implements ActionListener {
    private Timer t = new Timer(5, this);
    private double x = 0, y = 0;
    private double velX = 2, velY = 2;
    private int directionX = 1, directionY = 1;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
        g2.fill(circle);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 540)
            directionX *= -1;
        if (y < 0 || y > 320)
            directionY *= -1;
        x += velX * directionX;
        y += velY * directionY;
        repaint();
    }
}

class Example18 extends JFrame {
    public Example18() {
        Ex18Graphics exGraphics = new Ex18Graphics();
        add(exGraphics);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Moving Ball");
    }
}

public class Test18 {
    public static void main(String[] args) {
        Example18 ex = new Example18();
        ex.setVisible(true);
    }
}