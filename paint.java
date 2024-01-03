import java.awt.Color;
import java.awt.Graphics2D;

public class paint {
    public static void background(Graphics2D g2) {
        int x = 1;
        int y = 1;
        for (int i = 0; i < 20; i++) {
            x = 1;
            //Set Color RGB
            //0,0,47
            //4,17,179
            int red = 0;
            int green = (int) Math.round(0 + 0.7 * i);
            int blue = (int) Math.round(47 + 6 * i);
            Color trigColor = new Color(red, green, blue);
            //10 + i % 2 because in normal triangle line the last triangle don't create
            for (int j = 1; j <= 10 + i % 2; j++) {
                //Full upsidedown triangle
                if (i % 2 == 0) {
                    int[] xPoly = { x, x + 600, x + 600, x};
                    int[] yPoly = { y, y, y + 60, y + 60 };
                    Tools.poly(g2, xPoly, yPoly, trigColor);
                    break;
                }
                //Normal Triangle (But some part is half) 
                else {
                    //First Triangle
                    if (j == 1) {
                        int[] xPoly = { x, x + 31, x };
                        int[] yPoly = { y, y, y - 59 };
                        Tools.poly(g2, xPoly, yPoly, trigColor);
                        x += 30;
                    } 
                    // Not First triangle
                    else {
                        //For the last Triangle (That part is half)
                        int px2 = x + 60 > 600 ? 601 : x + 61;

                        int[] xPoly = { x, px2, x + 30 };
                        int[] yPoly = { y, y, y - 59 };
                        Tools.poly(g2, xPoly, yPoly, trigColor);
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

    public static void facePaint(Graphics2D g2) {
        //Face
        Color replaceColor = new Color(255,239,219);
        Tools.floodFill(g2, 300, 420, replaceColor);
        Tools.floodFill(g2, 375, 355, replaceColor);

        //Neck
        replaceColor = new Color(221,184,166);
        Tools.floodFill(g2, 300, 545, replaceColor);

        //Eye 
        replaceColor = new Color(255,201,171);
        Tools.floodFill(g2, 220, 390, replaceColor);
        Tools.floodFill(g2, 380, 390, replaceColor);
        replaceColor = new Color(203,68,30);
        Tools.floodFill(g2, 206, 377, replaceColor);
        Tools.floodFill(g2, 394, 377, replaceColor);

        //Mouth
        replaceColor = new Color(232,156,131);
        Tools.floodFill(g2, 300, 455, replaceColor);
    }

    public static void hairPaint(Graphics2D g2) {
        Color replaceColor = new Color(113,68,56);
        Tools.floodFill(g2, 300, 350, replaceColor);

        Tools.floodFill(g2, 100, 450, replaceColor);
        Tools.floodFill(g2, 99, 517, replaceColor);
        Tools.floodFill(g2, 80, 570, replaceColor);

        Tools.floodFill(g2, 500, 450, replaceColor);
        Tools.floodFill(g2, 501, 517, replaceColor);
        Tools.floodFill(g2, 520, 570, replaceColor);
    }

    public static void hatPaint(Graphics2D g2) {
        //red part
        Color replaceColor = new Color(255,95,84);
        Tools.floodFill(g2, 60, 314, replaceColor);
        Tools.floodFill(g2, 88, 273, replaceColor);
        Tools.floodFill(g2, 93, 248, replaceColor);
        Tools.floodFill(g2, 120, 208, replaceColor);

        Tools.floodFill(g2, 540, 314, replaceColor);
        Tools.floodFill(g2, 512, 273, replaceColor);
        Tools.floodFill(g2, 507, 248, replaceColor);
        Tools.floodFill(g2, 480, 208, replaceColor);

        //orange part
        replaceColor = new Color(255,186,84);
        Tools.floodFill(g2, 100, 300, replaceColor);
        Tools.floodFill(g2, 214, 250, replaceColor);
        Tools.floodFill(g2, 165, 173, replaceColor);

        Tools.floodFill(g2, 500, 300, replaceColor);
        Tools.floodFill(g2, 386, 250, replaceColor);
        Tools.floodFill(g2, 435, 173, replaceColor);

        //yello part
        replaceColor = new Color(255,222,84);
        Tools.floodFill(g2, 120, 250, replaceColor);
        Tools.floodFill(g2, 144, 290, replaceColor);

        Tools.floodFill(g2, 300, 230, replaceColor);

        Tools.floodFill(g2, 480, 250, replaceColor);
        Tools.floodFill(g2, 456, 290, replaceColor);

        //green part
        replaceColor = new Color(80,168,67);
        Tools.floodFill(g2, 208, 270, replaceColor);

        Tools.floodFill(g2, 300, 180, replaceColor);
        Tools.floodFill(g2, 300, 260, replaceColor);

        Tools.floodFill(g2, 392, 270, replaceColor);

        //Hat Eye
        replaceColor = new Color(0,0,0);
        Tools.floodFill(g2, 200, 220, replaceColor);
        Tools.floodFill(g2, 400, 220, replaceColor);
        replaceColor = new Color(255,255,255);
        Tools.floodFill(g2, 170, 215, replaceColor);
        Tools.floodFill(g2, 430, 220, replaceColor);

        //horn 
        replaceColor = new Color(255,232,97);
        Tools.floodFill(g2, 140, 110, replaceColor);
        Tools.floodFill(g2, 460, 110, replaceColor);

        //white part
        replaceColor = new Color(255,255,255);
        Tools.floodFill(g2, 300, 275, replaceColor);

        Tools.floodFill(g2, 140, 370, replaceColor);
        Tools.floodFill(g2, 200, 338, replaceColor);
        Tools.floodFill(g2, 248, 310, replaceColor);

        Tools.floodFill(g2, 460, 370, replaceColor);
        Tools.floodFill(g2, 400, 338, replaceColor);
        Tools.floodFill(g2, 352, 310, replaceColor);
    }

    public static void handPaint(Graphics2D g2) {
        Color replaceColor = new Color(255,239,219);
        Tools.floodFill(g2, 150, 540, replaceColor);
        Tools.floodFill(g2, 450, 540, replaceColor);
    }

    public static void shirtPaint(Graphics2D g2) {
        Color replaceColor = new Color(68,53,52);
        Tools.floodFill(g2, 250, 575, replaceColor);
        Tools.floodFill(g2, 350, 575, replaceColor);

        replaceColor = new Color(203,58,51);
        Tools.floodFill(g2, 280, 552, replaceColor);
        Tools.floodFill(g2, 288, 565, replaceColor);

        Tools.floodFill(g2, 300, 578, replaceColor);

        Tools.floodFill(g2, 320, 552, replaceColor);
        Tools.floodFill(g2, 312, 565, replaceColor);
    }

    public static void hairShadow(Graphics2D g2) {
        Color replaceColor = new Color(97,52,44);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 75, 600, 79, 584, 87, 567, 95, 559);
        Tools.floodFill(g2, 90, 580, replaceColor);
        Tools.cubicBezier(g2, 525, 600, 521, 584, 513, 567, 505, 559);
        Tools.floodFill(g2, 510, 580, replaceColor);

        replaceColor = new Color(73,34,27);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 97, 600, 101, 590, 106, 580, 111, 572);
        Tools.floodFill(g2, 115, 590, replaceColor);
        Tools.cubicBezier(g2, 503, 600, 499, 590, 494, 580, 489, 572);
        Tools.floodFill(g2, 485, 590, replaceColor);
        //end

        replaceColor = new Color(97,52,44);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 46, 471, 69, 477, 100, 466, 110, 449);
        Tools.cubicBezier(g2, 110, 449, 106, 431, 104, 409, 105, 387);
        Tools.BresenhamLine(g2, 121, 486, 126, 494);
        Tools.floodFill(g2, 110, 460, replaceColor);
        Tools.cubicBezier(g2, 554, 471, 531, 477, 500, 466, 490, 449);
        Tools.cubicBezier(g2, 490, 449, 494, 431, 496, 409, 495, 385);
        Tools.BresenhamLine(g2, 479, 484, 474, 494);
        Tools.floodFill(g2, 490, 460, replaceColor);

        replaceColor = new Color(73,34,27);
        g2.setColor(replaceColor);
        //Left
        Tools.cubicBezier(g2, 65, 482, 86, 480, 106, 476, 122, 467);
        Tools.cubicBezier(g2, 122, 467, 111, 438, 110, 409, 110, 372);
        Tools.BresenhamLine(g2, 126, 477, 133, 472);
        Tools.floodFill(g2, 125, 471, replaceColor);
        //Right
        Tools.cubicBezier(g2, 535, 482, 514, 480, 494, 476, 478, 467);
        Tools.cubicBezier(g2, 478, 467, 489, 438, 490, 409, 490, 372);
        Tools.BresenhamLine(g2, 474, 477, 467, 472);
        Tools.floodFill(g2, 475, 471, replaceColor);
        //end

        replaceColor = new Color(97,52,44);
        g2.setColor(replaceColor);
        //Left
        Tools.cubicBezier(g2, 126, 440, 129, 449, 134, 456, 141, 461);
        Tools.cubicBezier(g2, 141, 461, 139, 423, 165, 467, 201, 466);
        Tools.floodFill(g2, 157, 463, replaceColor);
        //Right
        Tools.cubicBezier(g2, 474, 440, 471, 449, 466, 456, 459, 461);
        Tools.cubicBezier(g2, 459, 461, 461, 423, 435, 467, 404, 466);
        Tools.floodFill(g2, 443, 463, replaceColor);

        replaceColor = new Color(73,34,27);
        g2.setColor(replaceColor);
        //Left
        Tools.cubicBezier(g2, 170, 487, 170, 465, 200, 500, 225, 500);
        Tools.floodFill(g2, 190, 488, replaceColor);
        //Right
        Tools.cubicBezier(g2, 430, 487, 430, 465, 400, 500, 375, 500);
        Tools.floodFill(g2, 410, 488, replaceColor);


        replaceColor = new Color(97,52,44);
        g2.setColor(replaceColor);
        //Left
        Tools.cubicBezier(g2, 125, 400, 118, 425, 159, 400, 189, 346);
        Tools.cubicBezier(g2, 189, 346, 207, 356, 212, 349, 219, 331);
        Tools.cubicBezier(g2, 219, 331, 228, 329, 236, 324, 243, 318);
        Tools.cubicBezier(g2, 243, 318, 257, 326, 260, 324, 264, 308);
        Tools.cubicBezier(g2, 264, 308, 274, 310, 291, 306, 300, 300);
        //Right
        Tools.cubicBezier(g2, 477, 400, 482, 425, 441, 400, 411, 346);
        Tools.cubicBezier(g2, 411, 346, 393, 356, 388, 349, 381, 331);
        Tools.cubicBezier(g2, 381, 331, 372, 329, 364, 324, 357, 318);
        Tools.cubicBezier(g2, 357, 318, 343, 326, 340, 324, 336, 308);
        Tools.cubicBezier(g2, 336, 308, 326, 310, 309, 306, 300, 300);
        Tools.floodFill(g2, 126, 405, replaceColor);
        Tools.floodFill(g2, 300, 298, replaceColor);
        Tools.floodFill(g2, 474, 405, replaceColor);
        //end

        replaceColor = new Color(97,52,44);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 244, 346, 258, 359, 274, 368, 286, 373);
        Tools.cubicBezier(g2, 286, 373, 283, 353, 293, 352, 317, 367);
        Tools.cubicBezier(g2, 317, 367, 316, 361, 316, 355, 316, 350);
        Tools.floodFill(g2, 300, 385, replaceColor);
    }

    public static void faceShadow(Graphics2D g2) {
        Color replaceColor = new Color(221,184,166);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 235, 510, 271, 530, 328, 530, 363, 510);
        Tools.floodFill(g2, 372, 513, replaceColor);
    }

    public static void handShadow(Graphics2D g2) {
        //Hand
        Color replaceColor = new Color(222,185,168);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 128, 575, 152, 584, 179, 578, 196, 560);
        Tools.cubicBezier(g2, 154, 599, 172, 589, 183, 578, 193, 599);
        Tools.floodFill(g2, 150, 588, replaceColor);
        //Right Part
        Tools.cubicBezier(g2, 472, 575, 448, 584, 421, 578, 406, 560);
        Tools.cubicBezier(g2, 446, 599, 428, 589, 417, 578, 407, 599);
        Tools.floodFill(g2, 450, 588, replaceColor);

        //Finger
        replaceColor = new Color(222,185,168);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 95, 550, 109, 554, 118, 545, 109, 525);
        Tools.BresenhamLine(g2, 109, 525, 113, 520);
        Tools.cubicBezier(g2, 113, 520, 133, 534, 141, 526, 139, 507);
        Tools.cubicBezier(g2, 139, 507, 148, 515, 156, 516, 162, 511);
        Tools.cubicBezier(g2, 162, 511, 163, 518, 169, 525, 178, 525);

        Tools.BresenhamLine(g2, 87, 539, 95, 544);
        Tools.cubicBezier(g2, 109, 503, 111, 508, 113, 511, 115, 512);
        Tools.cubicBezier(g2, 136, 488, 135, 493, 138, 496, 142, 496);
        Tools.BresenhamLine(g2, 167, 501, 169, 507);
        Tools.floodFill(g2, 110, 520, replaceColor);
        Tools.floodFill(g2, 136, 500, replaceColor);
        //Right Part
        Tools.cubicBezier(g2, 506, 550, 491, 554, 482, 545, 491, 525);
        Tools.BresenhamLine(g2, 491, 525, 487, 520);
        Tools.cubicBezier(g2, 487, 520, 467, 534, 459, 526, 461, 507);
        Tools.cubicBezier(g2, 461, 507, 452, 515, 444, 516, 438, 511);
        Tools.cubicBezier(g2, 438, 511, 437, 518, 431, 525, 424, 525);

        Tools.BresenhamLine(g2, 515, 539, 507, 544);
        Tools.cubicBezier(g2, 492, 499, 489, 508, 487, 511, 485, 509);
        Tools.cubicBezier(g2, 464, 488, 465, 493, 462, 496, 458, 496);
        Tools.BresenhamLine(g2, 435, 500, 431, 507);
        Tools.floodFill(g2, 490, 520, replaceColor);
        Tools.floodFill(g2, 464, 500, replaceColor);
    }

    public static void shirtShadow(Graphics2D g2) {
        Color replaceColor = new Color(175,45,38);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 275, 556, 276, 557, 279, 557, 283, 557);
        Tools.floodFill(g2, 280, 552, replaceColor);
        //Right Part
        Tools.cubicBezier(g2, 327, 556, 326, 557, 323, 557, 319, 557);
        Tools.floodFill(g2, 320, 552, replaceColor);


        Tools.cubicBezier(g2, 288, 578, 290, 578, 295, 578, 300, 576);
        Tools.cubicBezier(g2, 313, 578, 310, 578, 305, 578, 300, 576);
        Tools.floodFill(g2, 300, 572, replaceColor);
    }

    public static void hatShadow(Graphics2D g2) {
        //White Part
        Color replaceColor = new Color(212,221,229);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 94, 360, 108, 363, 122, 357, 135, 344);
        Tools.cubicBezier(g2, 135, 344, 151, 344, 165, 340, 178, 328);
        Tools.cubicBezier(g2, 178, 328, 203, 325, 226, 314, 245, 297);
        Tools.cubicBezier(g2, 245, 297, 263, 297, 282, 292, 300, 281);
        //Right Part
        Tools.cubicBezier(g2, 508, 360, 492, 363, 478, 357, 465, 344);
        Tools.cubicBezier(g2, 465, 344, 449, 344, 435, 340, 422, 328);
        Tools.cubicBezier(g2, 422, 328, 397, 325, 374, 314, 355, 297);
        Tools.cubicBezier(g2, 355, 297, 337, 297, 318, 292, 300, 281);
        Tools.floodFill(g2, 100, 365, replaceColor);
        //White Part

        //White Sharp Part
        replaceColor = new Color(212,221,229);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 134, 371, 143, 360, 158, 355, 169, 357);
        Tools.floodFill(g2, 147, 355, replaceColor);
        //Right Part
        Tools.cubicBezier(g2, 468, 371, 459, 360, 444, 355, 433, 357);
        Tools.floodFill(g2, 453, 355, replaceColor);
        //White Sharp Part


        //Green Part Under Moustache
        replaceColor = new Color(46,124,50);
        g2.setColor(replaceColor);
        //Left Part
        Tools.cubicBezier(g2, 193, 271, 197, 268, 232, 260, 251, 262);
        Tools.floodFill(g2, 252, 258, replaceColor);
        //Right Part
        Tools.cubicBezier(g2, 408, 271, 403, 268, 368, 260, 349, 262);
        Tools.floodFill(g2, 348, 258, replaceColor);
        //Green Part Under Moustache

        //Green Part Under Medel
        replaceColor = new Color(46,124,50);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 291, 262, 297, 260, 302, 260, 310, 262);
        Tools.floodFill(g2, 300, 258, replaceColor);
        //Green Part Under Medel

        //Yellow Part
        //Left Part
        replaceColor = new Color(228,162,72);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 110, 300, 125, 296, 140, 287, 153, 284);
        Tools.cubicBezier(g2, 165, 280, 171, 277, 180, 274, 188, 274);
        Tools.floodFill(g2, 116, 293, replaceColor);
        Tools.floodFill(g2, 175, 273, replaceColor);
        //Middle Part
        replaceColor = new Color(228,162,72);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 270, 233, 269, 244, 282, 247, 300, 238);
        Tools.cubicBezier(g2, 330, 233, 331, 244, 318, 247, 300, 238);
        Tools.floodFill(g2, 300, 243, replaceColor);
        //Right Part
        replaceColor = new Color(228,162,72);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 490, 300, 475, 296, 460, 287, 447, 284);
        Tools.cubicBezier(g2, 435, 280, 429, 277, 420, 274, 414, 274);
        Tools.floodFill(g2, 484, 293, replaceColor);
        Tools.floodFill(g2, 425, 273, replaceColor);
        //Yellow Part

        //Orange Side Part
        //Left Part
        replaceColor = new Color(220,140,62);
        g2.setColor(replaceColor);
        Tools.BresenhamLine(g2, 83, 335, 90, 340);
        Tools.cubicBezier(g2, 90, 340, 96, 328, 105, 321, 120, 315);
        Tools.cubicBezier(g2, 120, 315, 104, 311, 98, 303, 95, 298);
        Tools.BresenhamLine(g2, 95, 298, 75, 294);
        Tools.floodFill(g2, 121, 313, replaceColor);
        //Right Part
        Tools.BresenhamLine(g2, 517, 335, 510, 340);
        Tools.cubicBezier(g2, 510, 340, 504, 328, 495, 321, 482, 315);
        Tools.cubicBezier(g2, 482, 315, 496, 311, 502, 303, 505, 298);
        Tools.BresenhamLine(g2, 505, 298, 525, 294);
        Tools.floodFill(g2, 479, 313, replaceColor);
        //Orange Side Part

        //Orange Eyeblow Part
        //Left Side
        replaceColor = new Color(220,140,62);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 128, 152, 135, 170, 152, 182, 175, 192);
        Tools.cubicBezier(g2, 229, 203, 243, 208, 252, 207, 254, 196);
        Tools.floodFill(g2, 154, 187, replaceColor);
        Tools.floodFill(g2, 244, 209, replaceColor);
        //Right side
        Tools.cubicBezier(g2, 472, 151, 465, 170, 448, 182, 425, 192);
        Tools.cubicBezier(g2, 373, 203, 359, 208, 350, 207, 348, 196);
        Tools.floodFill(g2, 446, 187, replaceColor);
        Tools.floodFill(g2, 356, 209, replaceColor);
        //Orange Eyeblow Part

        //Red Part
        //Left Side
        replaceColor = new Color(216,72,63);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 53, 294, 53, 314, 62, 328, 73, 336);
        Tools.floodFill(g2, 58, 323, replaceColor);
        Tools.cubicBezier(g2, 59, 297, 59, 310, 66, 321, 77, 332);
        Tools.floodFill(g2, 66, 316, replaceColor);

        Tools.cubicBezier(g2, 91, 257, 91, 253, 93, 250, 94, 248);
        Tools.floodFill(g2, 94, 253, replaceColor);

        Tools.cubicBezier(g2, 118, 230, 129, 233, 141, 221, 157, 223);
        Tools.cubicBezier(g2, 157, 223, 154, 217, 154, 211, 157, 204);
        Tools.cubicBezier(g2, 157, 204, 144, 201, 134, 190, 127, 182);
        Tools.floodFill(g2, 158, 215, replaceColor);
        //Right Side
        replaceColor = new Color(216,72,63);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 549, 296, 547, 314, 538, 328, 528, 336);
        Tools.floodFill(g2, 542, 323, replaceColor);
        Tools.cubicBezier(g2, 543, 297, 541, 310, 534, 321, 525, 332);
        Tools.floodFill(g2, 534, 316, replaceColor);

        Tools.cubicBezier(g2, 511, 257, 509, 253, 507, 250, 507, 248);
        Tools.floodFill(g2, 506, 253, replaceColor);

        Tools.cubicBezier(g2, 485, 230, 471, 233, 459, 221, 443, 223);
        Tools.cubicBezier(g2, 443, 223, 446, 217, 446, 211, 443, 204);
        Tools.cubicBezier(g2, 443, 204, 456, 201, 466, 190, 473, 182);
        Tools.floodFill(g2, 442, 215, replaceColor);
        //Red Part

        //Horn
        //Left Side
        replaceColor = new Color(228,162,72);
        g2.setColor(replaceColor);
        Tools.cubicBezier(g2, 120, 103, 125, 115, 137, 122, 135, 140);
        Tools.cubicBezier(g2, 135, 140, 142, 143, 151, 143, 161, 140);
        Tools.BresenhamLine(g2, 161, 140, 162, 132);
        Tools.floodFill(g2, 132, 129, replaceColor);

        Tools.cubicBezier(g2, 159, 127, 133, 99, 174, 88, 168, 61);
        Tools.floodFill(g2, 156, 101, replaceColor);
        //Right Side
        Tools.cubicBezier(g2, 482, 103, 475, 115, 463, 122, 465, 140);
        Tools.cubicBezier(g2, 465, 140, 458, 143, 449, 143, 441, 140);
        Tools.BresenhamLine(g2, 441, 140, 440, 132);
        Tools.floodFill(g2, 468, 129, replaceColor);

        Tools.cubicBezier(g2, 443, 127, 467, 99, 426, 88, 434, 60);
        Tools.floodFill(g2, 444, 101, replaceColor);
        //Horn
    }
}
