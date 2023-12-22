import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
import javax.swing.JFrame;

public class Tools {
    private static int stroke = 1;

    public static void quadraticBezier(Graphics g, int x1, int y1, int ctrlx, int ctrly, int x2, int y2) {
        int x = x1;
        int y = y1;
        plot(g, x, y);

        for (double t = 0; t <= 1; t += 0.005) {
            x = (int) Math.round(Math.pow(1 - t, 2) * x1 + (2 * (1 - t) * t * ctrlx) + Math.pow(t, 2) * x2);
            y = (int) Math.round(Math.pow(1 - t, 2) * y1 + (2 * (1 - t) * t * ctrly) + Math.pow(t, 2) * y2);
            plot(g, x, y);
        }
    }

    public static void cubicBezier(Graphics g, int x1, int y1, int ctrlx1, int ctrly1, int ctrlx2, int ctrly2, int x2,
            int y2) {
        int x = x1;
        int y = y1;
        plot(g, x, y);

        for (double t = 0; t <= 1; t += 0.005) {
            x = (int) Math.round(Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * ctrlx1
                    + 3 * t * t * (1 - t) * ctrlx2 + Math.pow(t, 3) * x2);
            y = (int) Math.round(Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * ctrly1
                    + 3 * t * t * (1 - t) * ctrly2 + Math.pow(t, 3) * y2);
            plot(g, x, y);
        }
    }

    public static void BresenhamLine(Graphics g, int x1, int y1, int x2, int y2) {
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);

        float sx = (x1 < x2) ? 1 : -1;
        float sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;
        if (dy > dx) {
            float tmp = dx;
            dx = dy;
            dy = tmp;

            isSwap = true;
        }

        float D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 1; i < dx; i++) {
            plot(g, x, y);

            if (D >= 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;

                D -= 2 * dx;
            }

            if (isSwap)
                y += sy;
            else
                x += sx;

            D += 2 * dy;
        }
    }

    public static void floodFill(Graphics g, int x, int y, Color taget_Colour) {
        Queue<Node> Q = new LinkedList<>();

        paint(g, x, y, taget_Colour);
        Q.offer(new Node(x, y));

        while(!Q.isEmpty()) {
            Node current_Node = Q.poll();

            // if(getColorAtPixel(current_Node.x, current_Node.y + 1) != Color.BLACK) {

            // }
        }
    }

    private static void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, stroke, stroke);
    }

    public static void paint(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillRect(x, y, 100, 100);
        g.setColor(Color.BLACK);
    }

    // public static Color getColorAtPixel(JFrame f, int x, int y) {
    //     Rectangle rect = f.getContentPane().getBounds();
    //     BufferedImage img = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_ARGB);
    //     f.getContentPane().paintAll(img.createGraphics());
    //     return new Color(img.getRGB(x, y), true);
    // }

    public static void setStroke(int s) {
        stroke = s;
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
