import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class paint {
    public static void background(Graphics g) {
        int x = 1;
        int y = 1;
        for (int i = 0; i < 20; i++) {
            x = 1;
            //Set Color RGB
            int red = 255;
            int green = (int) Math.round(78 + 7.5 * i);
            int blue = (int) Math.round(66 + 1.4 * i);
            Color trigColor = new Color(red, green, blue);
            //10 + i % 2 because in normal triangle line the last triangle don't create
            for (int j = 1; j <= 10 + i % 2; j++) {
                //Full upside down triangle
                if (i % 2 == 0) {
                    int[] xPoly = { x, x + 600, x + 600, x};
                    int[] yPoly = { y, y, y + 60, y + 60 };
                    Tools.poly(g, xPoly, yPoly, trigColor);
                    break;
                }
                //Normal Triangle (But some part is half) 
                else {
                    //First Triangle
                    if (j == 1) {
                        int[] xPoly = { x, x + 31, x };
                        int[] yPoly = { y, y, y - 59 };
                        Tools.poly(g, xPoly, yPoly, trigColor);
                        x += 30;
                    } 
                    // Not First triangle
                    else {
                        //For the last Triangle (That part is half)
                        int px2 = x + 60 > 600 ? 601 : x + 61;

                        int[] xPoly = { x, px2, x + 30 };
                        int[] yPoly = { y, y, y - 59 };
                        Tools.poly(g, xPoly, yPoly, trigColor);
                        x += 60;
                    }
                }
            }
            //Don't want normal triangle line change the x value
            if (i % 2 == 0) {
                y += 60;
            }
        }
    }

    public static void facePaint(Graphics g, Graphics2D g2) {
        //Face
        Color replaceColor = new Color(255,239,219);
        Tools.floodFill(g, g2, 300, 420, replaceColor);
        Tools.floodFill(g, g2, 375, 355, replaceColor);

        //Eye 
        replaceColor = new Color(255,201,171);
        Tools.floodFill(g, g2, 220, 390, replaceColor);
        Tools.floodFill(g, g2, 380, 390, replaceColor);
        replaceColor = new Color(203,68,30);
        Tools.floodFill(g, g2, 206, 377, replaceColor);
        Tools.floodFill(g, g2, 394, 377, replaceColor);

        //Mouth
        replaceColor = new Color(232,156,131);
        Tools.floodFill(g, g2, 300, 455, replaceColor);
    }

    public static void hairPaint(Graphics g, Graphics2D g2) {
        Color replaceColor = new Color(113,68,56);
        Tools.floodFill(g, g2, 300, 350, replaceColor);

        Tools.floodFill(g, g2, 100, 450, replaceColor);
        Tools.floodFill(g, g2, 99, 517, replaceColor);
        Tools.floodFill(g, g2, 80, 570, replaceColor);

        Tools.floodFill(g, g2, 500, 450, replaceColor);
        Tools.floodFill(g, g2, 501, 517, replaceColor);
        Tools.floodFill(g, g2, 520, 570, replaceColor);
    }

    public static void hatPaint(Graphics g, Graphics2D g2) {
        //red part
        Color replaceColor = new Color(255,95,84);
        Tools.floodFill(g, g2, 60, 314, replaceColor);
        Tools.floodFill(g, g2, 88, 273, replaceColor);
        Tools.floodFill(g, g2, 93, 248, replaceColor);
        Tools.floodFill(g, g2, 120, 208, replaceColor);

        Tools.floodFill(g, g2, 540, 314, replaceColor);
        Tools.floodFill(g, g2, 512, 273, replaceColor);
        Tools.floodFill(g, g2, 507, 248, replaceColor);
        Tools.floodFill(g, g2, 480, 208, replaceColor);

        //orange part
        replaceColor = new Color(255,186,84);
        Tools.floodFill(g, g2, 100, 300, replaceColor);
        Tools.floodFill(g, g2, 214, 250, replaceColor);
        Tools.floodFill(g, g2, 165, 173, replaceColor);

        Tools.floodFill(g, g2, 500, 300, replaceColor);
        Tools.floodFill(g, g2, 386, 250, replaceColor);
        Tools.floodFill(g, g2, 435, 173, replaceColor);

        //yello part
        replaceColor = new Color(255,222,84);
        Tools.floodFill(g, g2, 120, 250, replaceColor);
        Tools.floodFill(g, g2, 144, 290, replaceColor);

        Tools.floodFill(g, g2, 300, 230, replaceColor);

        Tools.floodFill(g, g2, 480, 250, replaceColor);
        Tools.floodFill(g, g2, 456, 290, replaceColor);

        //green part
        replaceColor = new Color(80,168,67);
        Tools.floodFill(g, g2, 208, 270, replaceColor);

        Tools.floodFill(g, g2, 300, 180, replaceColor);
        Tools.floodFill(g, g2, 300, 260, replaceColor);

        Tools.floodFill(g, g2, 392, 270, replaceColor);

        //hat eye
        replaceColor = new Color(0,0,0);
        Tools.floodFill(g, g2, 200, 220, replaceColor);
        Tools.floodFill(g, g2, 400, 220, replaceColor);
        replaceColor = new Color(255,255,255);
        Tools.floodFill(g, g2, 170, 215, replaceColor);
        Tools.floodFill(g, g2, 430, 220, replaceColor);

        //horn 
        replaceColor = new Color(255,232,97);
        Tools.floodFill(g, g2, 140, 110, replaceColor);
        Tools.floodFill(g, g2, 460, 110, replaceColor);

        //white part
        replaceColor = new Color(255,255,255);
        Tools.floodFill(g, g2, 300, 275, replaceColor);

        Tools.floodFill(g, g2, 140, 370, replaceColor);
        Tools.floodFill(g, g2, 200, 338, replaceColor);
        Tools.floodFill(g, g2, 248, 310, replaceColor);

        Tools.floodFill(g, g2, 460, 370, replaceColor);
        Tools.floodFill(g, g2, 400, 338, replaceColor);
        Tools.floodFill(g, g2, 352, 310, replaceColor);
    }

    public static void handPaint(Graphics g, Graphics2D g2) {
        Color replaceColor = new Color(255,239,219);
        Tools.floodFill(g, g2, 150, 540, replaceColor);
        Tools.floodFill(g, g2, 450, 540, replaceColor);
    }
}
