//package mainProject;
import java.awt.Graphics;

import javax.swing.*;

public class Canvas extends JPanel {
    public static void main(String[] args) {
        Canvas m = new Canvas();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Gradient");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Tools.setStroke(4);
        drawShape.Head(g);
        drawShape.mouse(g);
        drawShape.eye(g);
        drawShape.eyeBall(g);
        drawShape.hair(g);
        drawShape.lowerHat(g);
        drawShape.hand(g);
        drawShape.shirt(g);
        drawShape.moustacheHat(g);
        drawShape.middleMedal(g);
        drawShape.redPartHat(g);
        drawShape.yelloPartHat(g);
    }
}