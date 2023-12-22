import java.awt.Graphics;

import javax.swing.*;

public class Canvas extends JPanel {
    private static JFrame f;
    public static void main(String[] args) {
        Canvas m = new Canvas();

        f = new JFrame();
        f.add(m);
        f.setTitle("Gradient");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Tools.setStroke(4);
        //Body
        drawShape.Head(g);
        drawShape.mouse(g);
        drawShape.eye(g);
        drawShape.eyeBall(g);
        drawShape.hair(g);
        drawShape.lowerHat(g);
        drawShape.hand(g);
        drawShape.shirt(g);

        //Hat
        drawShape.moustacheHat(g);
        drawShape.middleMedal(g);
        drawShape.redPartHat(g);
        drawShape.yelloPartHat(g);
        drawShape.orangePart(g);
        drawShape.horn(g);
        drawShape.hatEye(g);
    }   
}