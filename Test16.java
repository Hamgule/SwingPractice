import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class Ex16Image extends JPanel implements ActionListener {
    private Timer animator;
    private ImageIcon imageArray[];
    private int delay = 50;
    private int totalFrame = 15;
    private int currentFrame = 0;
    private String photoFileAddress;

    public Ex16Image() {
        imageArray = new ImageIcon[totalFrame];
        photoFileAddress = "C:/Users/W11095/Downloads/javaTest/SwingPractice/photographs/ex16/";

        for (int i = 0; i < imageArray.length; i++) {
            imageArray[i] = new ImageIcon(photoFileAddress + "frame" + Math.abs((int) (i / 8) * 6 - (i % 8)) + ".png");
        }
        animator = new Timer(delay, this);
        animator.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame >= imageArray.length) currentFrame = 0;
        currentFrame++;
        imageArray[currentFrame].paintIcon(this, g, 0, 0);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

class Example16 extends JFrame {
    Example16() {
        Ex16Image exImage = new Ex16Image();
        add(exImage);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Test16 {
    public static void main(String[] args) {
        Example16 ex = new Example16();
        ex.setVisible(true);
    }
}