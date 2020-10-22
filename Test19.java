import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

class Ex19Graphics extends JPanel implements ActionListener, KeyListener {
    private Timer t = new Timer(5, this);
    private double x = 0, y = 0;
    private double velX = 0, velY = 0;

    public Ex19Graphics() {
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
        x += velX;
        y += velY;
    }

    public void up() { velX = 0; velY = -1.5; }
    public void down() { velX = 0; velY = 1.5; }
    public void left() { velX = -1.5; velY = 0; }
    public void right() { velX = 1.5; velY = 0; }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) up();
        if (code == KeyEvent.VK_DOWN) down();
        if (code == KeyEvent.VK_LEFT) left();
        if (code == KeyEvent.VK_RIGHT) right();
    }

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

}

class Example19 extends JFrame {
    public Example19() {
        Ex19Graphics exGraphics = new Ex19Graphics();
        add(exGraphics);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
    }
}

public class Test19 {
    public static void main(String[] args) {
        Example19 ex = new Example19();
        ex.setVisible(true);
    }
}