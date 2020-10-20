import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

class Ex17Graphics extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Line2D line = new Line2D.Double(0, 30, 600, 40);
        Rectangle2D rectangle = new Rectangle2D.Double(200, 120, 70, 30);
        Ellipse2D oval = new Ellipse2D.Double(400, 200, 40, 60);
        
        g2.draw(line);
        g2.setPaint(Color.RED);
        g2.fill(rectangle);
        g2.setPaint(Color.ORANGE);
        g2.fill(oval);
    }
}

class Example17 extends JFrame {
    public Example17() {
        Ex17Graphics exGraphics = new Ex17Graphics();
        add(exGraphics);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Test17 {
    public static void main(String[] args) {
        Example17 ex = new Example17();
        ex.setVisible(true);
    }
}