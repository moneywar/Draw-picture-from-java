import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Canvas extends JPanel {
    public static void main(String[] args) {
        Canvas m = new Canvas();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Canvas");
        f.setSize(700, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();
        Tools.setBuffer(buffer);

        paint.background(g2);
        
        Tools.setStroke(4);
        Tools.BresenhamLine(g2, 600, 0, 600, 600);
        Tools.BresenhamLine(g2, 0, 600, 600, 600);

        // Body
        drawShape.Head(g2);
        drawShape.mouse(g2);
        drawShape.eye(g2);
        drawShape.eyeBall(g2);
        drawShape.hair(g2);
        drawShape.lowerHat(g2);
        drawShape.hand(g2);
        drawShape.shirt(g2);

        // Hat
        drawShape.moustacheHat(g2);
        drawShape.middleMedal(g2);
        drawShape.redPartHat(g2);
        drawShape.yelloPartHat(g2);
        drawShape.orangePart(g2);
        drawShape.horn(g2);
        drawShape.hatEye(g2);

        // paint
        paint.facePaint(g,g2);
        paint.hatPaint(g, g2);
        paint.hairPaint(g, g2);
        paint.handPaint(g, g2);
        g.drawImage(buffer, 0, 0, null);
    }
}