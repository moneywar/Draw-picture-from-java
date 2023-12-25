import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

public class Tools {
    private static int stroke = 1;
    //For getPixelColorAt
    private static BufferedImage buffer;

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

    public static void floodFill(Graphics2D g2, int x, int y, Color replaceColor) {
        Queue<Node> Q = new LinkedList<>();

        paintColor(g2, x, y, replaceColor);
        Q.offer(new Node(x, y));

        while (!Q.isEmpty()) {
            Node current_Node = Q.poll();

            //South
            if(!getPixelColorAt(current_Node.x, current_Node.y + 1).equals(Color.BLACK) 
            && !getPixelColorAt(current_Node.x, current_Node.y + 1).equals(replaceColor)) {
                paintColor(g2, current_Node.x, current_Node.y + 1, replaceColor);
                Q.add(new Node(current_Node.x, current_Node.y + 1));
            }
            //North
            if(!getPixelColorAt(current_Node.x, current_Node.y - 1).equals(Color.BLACK) 
            && !getPixelColorAt(current_Node.x, current_Node.y - 1).equals(replaceColor)) {
                paintColor(g2, current_Node.x, current_Node.y - 1, replaceColor);
                Q.add(new Node(current_Node.x, current_Node.y - 1));
            }
            //East
            if(!getPixelColorAt(current_Node.x + 1, current_Node.y).equals(Color.BLACK) 
            && !getPixelColorAt(current_Node.x + 1, current_Node.y).equals(replaceColor)) {
                paintColor(g2, current_Node.x + 1, current_Node.y, replaceColor);
                Q.add(new Node(current_Node.x + 1, current_Node.y));
            }
            //West
            if(!getPixelColorAt(current_Node.x - 1, current_Node.y).equals(Color.BLACK) 
            && !getPixelColorAt(current_Node.x - 1, current_Node.y).equals(replaceColor)) {
                paintColor(g2, current_Node.x - 1, current_Node.y, replaceColor);
                Q.add(new Node(current_Node.x - 1, current_Node.y));
            }
            //System.out.println(current_Node.x + " " + current_Node.y);
        }
    }

    public static void poly(Graphics2D g2, int[] xPoly, int[] yPoly, Color fillColor) {
        g2.setColor(fillColor);
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.fillPolygon(poly);
        g2.setColor(Color.BLACK);
    }

    private static void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, stroke, stroke);
    }

    private static void paintColor(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillRect(x, y, 1, 1);
        g.setColor(Color.BLACK);
    }

    public static Color getPixelColorAt(int x, int y) {
        return new Color(buffer.getRGB(x, y));
    }

    public static void setStroke(int s) {
        stroke = s;
    }

    public static void setBuffer(BufferedImage b) {
        buffer = b;
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
