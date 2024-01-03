import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Assignment1_65050366_65050070 extends JPanel {
    public static void main(String[] args) {
        Assignment1_65050366_65050070 m = new Assignment1_65050366_65050070();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Canvas");
        f.setSize(600, 600);
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
        drawLine.Head(g2);
        drawLine.mouse(g2);
        drawLine.hair(g2);
        drawLine.eye(g2);
        drawLine.eyeBall(g2);
        drawLine.lowerHat(g2);
        drawLine.hand(g2);
        drawLine.shirt(g2);

        // Hat
        drawLine.moustacheHat(g2);
        drawLine.middleMedal(g2);
        drawLine.redPartHat(g2);
        drawLine.yelloPartHat(g2);
        drawLine.orangePart(g2);
        drawLine.horn(g2);
        drawLine.hatEye(g2);

        // paint
        paint.facePaint(g2);
        paint.hatPaint(g2);
        paint.hairPaint(g2);
        paint.handPaint(g2);
        paint.shirtPaint(g2);

        // shadow
        Tools.setStroke(2);
        paint.hairShadow(g2);
        paint.faceShadow(g2);
        paint.handShadow(g2);
        paint.shirtShadow(g2);
        paint.hatShadow(g2);
        g.drawImage(buffer, 0, 0, null);
    }
}                                                                               