import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ex15Image extends JPanel {
    private ImageIcon image;
    private String photoFileAddress;

    public void paintComponent(Graphics g) {
        photoFileAddress = "C:/Users/W11095/Downloads/javaTest/SwingPractice/photographs/ex16/";

        super.paintComponent(g);
        image = new ImageIcon(photoFileAddress + "frame1.png");
        image.paintIcon(this, g, 0, 0);
    }
}

class Example15 extends JFrame {
    public Example15() {
        Ex15Image exImage = new Ex15Image();

        add(exImage);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
} 

public class Test15 {
    public static void main(String[] args) {
        Example15 ex = new Example15();
        ex.setVisible(true);
    }
}