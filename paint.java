import java.awt.Color;
import java.awt.Graphics;

import javax.tools.Tool;

public class paint {
    public static void background(Graphics g) {
        int x = 1;
        int y = 1;
        // int red = 255;
        // int green = 78;
        // int blue = 66;
        // Color trigColor = new Color(255, 78, 66);
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
                    int[] xPoly = { x, x + 60, x + 30 };
                    int[] yPoly = { y, y, y + 60 };
                    Tools.poly(g, xPoly, yPoly, trigColor);
                    x += 60;
                }
                //Normal Triangle (But some part is half) 
                else {
                    //First Triangle
                    if (j == 1) {
                        int[] xPoly = { x, x + 30, x };
                        int[] yPoly = { y, y, y - 60 };
                        Tools.poly(g, xPoly, yPoly, trigColor);
                        x += 30;
                    } 
                    // Not First triangle
                    else {
                        //For the last Triangle (That part is half)
                        int px2 = x + 60 > 600 ? 601 : x + 60;

                        int[] xPoly = { x, px2, x + 30 };
                        int[] yPoly = { y, y, y - 60 };
                        Tools.poly(g, xPoly, yPoly, trigColor);
                        x += 60;
                    }
                }

                // System.out.println(x);
            }
            //Don't want normal triangle line change the x value
            if (i % 2 == 0) {
                y += 60;
            }
        }
        // 255,221,97
        // 0,6.5,1.4
    }
}
