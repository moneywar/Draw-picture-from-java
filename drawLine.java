import java.awt.Color;
import java.awt.Graphics2D;

public class drawLine {
    public static void hatEye(Graphics2D g2) {
        //Left Side
        Tools.cubicBezier(g2, 167, 201, 150, 228, 193, 269, 229, 233);
        Tools.cubicBezier(g2, 229, 233, 245, 200, 188, 176, 167, 201);

        Tools.cubicBezier(g2, 225, 231, 204, 255, 172, 234, 185, 209);
        Tools.cubicBezier(g2, 225, 231, 240, 213, 200, 185, 185, 209);

        //Right Side
        Tools.cubicBezier(g2, 433, 201, 450, 228, 407, 269, 371, 233);
        Tools.cubicBezier(g2, 371, 233, 355, 200, 412, 176, 433, 201);

        Tools.cubicBezier(g2, 375, 231, 396, 255, 428, 234, 415, 209);
        Tools.cubicBezier(g2, 375, 231, 360, 213, 400, 185, 415, 209);
    }
    public static void horn(Graphics2D g2) {
        //Left Side
        Tools.cubicBezier(g2, 130, 146, 130, 124, 110, 100, 110, 82);
        Tools.cubicBezier(g2, 110, 82, 108, 46, 84, 21, 90, 10);
        Tools.cubicBezier(g2, 90, 10, 135, 19, 121, 61, 127, 87);
        Tools.cubicBezier(g2, 127, 87, 142, 117, 151, 58, 167, 54);
        Tools.cubicBezier(g2, 167, 54, 195, 73, 133, 101, 174, 146);

        //Right Side
        Tools.cubicBezier(g2, 470, 146, 470, 124, 490, 100, 490, 82);
        Tools.cubicBezier(g2, 490, 82, 492, 46, 516, 21, 510, 10);
        Tools.cubicBezier(g2, 510, 10, 465, 19, 479, 61, 473, 87);
        Tools.cubicBezier(g2, 473, 87, 458, 117, 449, 58, 433, 54);
        Tools.cubicBezier(g2, 433, 54, 405, 73, 467, 101, 426, 146);
    }
    public static void orangePart(Graphics2D g2) {
        //Left Side
        Tools.quadraticBezier(g2, 91, 348, 75, 337, 75, 334);
        Tools.quadraticBezier(g2, 75, 334, 85, 331, 86, 328);
        Tools.quadraticBezier(g2, 86, 328, 65, 314, 60, 293);
        Tools.quadraticBezier(g2, 60, 293, 73, 293, 79, 286);
        Tools.BresenhamLine(g2, 89, 278, 100, 266);

        Tools.cubicBezier(g2, 167, 201, 141, 191, 118, 172, 125, 145);
        Tools.cubicBezier(g2, 125, 145, 146, 155, 185, 138, 189, 160);
        Tools.cubicBezier(g2, 188, 163, 211, 145, 220, 168, 220, 175);
        Tools.cubicBezier(g2, 218, 178, 244, 143, 284, 223, 230, 215);

        //Right Side
        Tools.quadraticBezier(g2, 509, 348, 525, 337, 525, 334);
        Tools.quadraticBezier(g2, 525, 334, 515, 331, 514, 328);
        Tools.quadraticBezier(g2, 514, 328, 535, 314, 540, 293);
        Tools.quadraticBezier(g2, 540, 293, 527, 293, 521, 286);
        Tools.BresenhamLine(g2, 511, 278, 500, 266);

        Tools.cubicBezier(g2, 433, 201, 459, 191, 482, 172, 475, 145);
        Tools.cubicBezier(g2, 475, 145, 454, 155, 415, 138, 411, 160);
        Tools.cubicBezier(g2, 412, 163, 389, 145, 380, 168, 380, 175);
        Tools.cubicBezier(g2, 382, 178, 356, 143, 316, 223, 370, 215);
    }

    public static void yelloPartHat(Graphics2D g2) {
        //Left Side
        Tools.quadraticBezier(g2, 151, 300, 107, 314, 102, 293);
        Tools.quadraticBezier(g2, 102, 293, 110, 295, 106, 294);

        Tools.quadraticBezier(g2, 102, 278, 91, 260, 102, 249);
        Tools.quadraticBezier(g2, 102, 249, 107, 254, 112, 251);
        Tools.quadraticBezier(g2, 112, 251, 104, 249, 107, 225);
        Tools.quadraticBezier(g2, 107, 225, 117, 242, 148, 230);
        Tools.quadraticBezier(g2, 148, 230, 178, 228, 186, 252);

        Tools.quadraticBezier(g2, 189, 264, 192, 277, 187, 282);

        Tools.quadraticBezier(g2, 158, 248, 120, 246, 132, 270);
        Tools.quadraticBezier(g2, 143, 280, 167, 282, 163, 272);
        Tools.quadraticBezier(g2, 155, 263, 150, 258, 142, 263);

        //Right Side
        Tools.quadraticBezier(g2, 449, 300, 493, 314, 498, 293);
        Tools.quadraticBezier(g2, 498, 293, 490, 295, 494, 294);

        Tools.quadraticBezier(g2, 498, 278, 509, 260, 498, 249);
        Tools.quadraticBezier(g2, 498, 249, 493, 254, 488, 251);
        Tools.quadraticBezier(g2, 488, 251, 496, 249, 493, 225);
        Tools.quadraticBezier(g2, 493, 225, 483, 242, 452, 230);
        Tools.quadraticBezier(g2, 452, 230, 422, 228, 414, 252);

        Tools.quadraticBezier(g2, 411, 264, 408, 277, 413, 282);

        Tools.quadraticBezier(g2, 442, 248, 480, 246, 468, 270);
        Tools.quadraticBezier(g2, 457, 280, 433, 282, 437, 272);
        Tools.quadraticBezier(g2, 445, 263, 450, 258, 458, 263);
    }

    public static void redPartHat(Graphics2D g2) {
        //Left Side
        Tools.cubicBezier(g2, 89, 347, 56, 345, 42, 317, 52, 276);

        Tools.BresenhamLine(g2, 58, 270, 97, 270);
        Tools.cubicBezier(g2, 97, 270, 86, 263, 82, 243, 83, 228);
        Tools.quadraticBezier(g2, 83, 228, 92, 244, 104, 251);
        Tools.cubicBezier(g2, 104, 251, 88, 228, 85, 177, 101, 167);
        Tools.cubicBezier(g2, 101, 167, 109, 176, 126, 180, 133, 178);

        //Left Side
        Tools.cubicBezier(g2, 511, 347, 544, 345, 558, 317, 548, 276);

        Tools.BresenhamLine(g2, 542, 270, 503, 270);
        Tools.cubicBezier(g2, 503, 270, 514, 263, 518, 243, 517, 228);
        Tools.quadraticBezier(g2, 517, 228, 508, 244, 496, 251);
        Tools.cubicBezier(g2, 496, 251, 512, 228, 515, 177, 499, 167);
        Tools.cubicBezier(g2, 499, 167, 491, 176, 474, 180, 467, 178);
    }

    public static void middleMedal(Graphics2D g2) {
        //Left Side
        Tools.quadraticBezier(g2, 300, 208, 284, 207, 282, 224);
        Tools.quadraticBezier(g2, 281, 224, 274, 230, 267, 229);
        Tools.quadraticBezier(g2, 267, 229, 257, 250, 273, 256);
        Tools.quadraticBezier(g2, 273, 256, 281, 260, 300, 251);

        //Right Side
        Tools.quadraticBezier(g2, 300, 208, 316, 207, 318, 224);
        Tools.quadraticBezier(g2, 319, 224, 326, 230, 333, 229);
        Tools.quadraticBezier(g2, 333, 229, 343, 250, 327, 256);
        Tools.quadraticBezier(g2, 327, 256, 319, 260, 300, 251);

        //Top Part
        Tools.quadraticBezier(g2, 216, 163, 254, 132, 300, 156);
        Tools.quadraticBezier(g2, 384, 163, 346, 132, 300, 156);
    }

    public static void moustacheHat(Graphics2D g2) {
        //Left Side
        Tools.cubicBezier(g2, 12, 239, 123, 337, 169, 213, 266, 251);
        Tools.cubicBezier(g2, 12, 239, 107, 344, 136, 253, 266, 251);

        //Right Side
        Tools.cubicBezier(g2, 588, 239, 477, 337, 431, 213, 334, 251);
        Tools.cubicBezier(g2, 588, 239, 493, 344, 464, 253, 334, 251);
    }
    
    public static void shirt(Graphics2D g2) {
        //Left Side
        Tools.BresenhamLine(g2, 271, 533, 271, 560);
        Tools.quadraticBezier(g2, 270, 551, 256, 564, 232, 551);
        Tools.quadraticBezier(g2, 232, 551, 207, 537, 198, 560);

        Tools.quadraticBezier(g2, 271, 545, 297, 545, 300, 565);

        Tools.quadraticBezier(g2, 300, 565, 285, 578, 278, 565);
        Tools.quadraticBezier(g2, 278, 565, 285, 551, 300, 565);

        Tools.quadraticBezier(g2, 271, 560, 271, 567, 283, 578);
        Tools.quadraticBezier(g2, 283, 578, 300, 590, 300, 600);

        //Right Side
        Tools.BresenhamLine(g2, 329, 533, 329, 560);
        Tools.quadraticBezier(g2, 330, 551, 344, 564, 368, 551);
        Tools.quadraticBezier(g2, 368, 551, 393, 537, 402, 560);

        Tools.quadraticBezier(g2, 329, 545, 303, 545, 300, 565);

        Tools.quadraticBezier(g2, 300, 565, 315, 578, 322, 565);
        Tools.quadraticBezier(g2, 322, 565, 315, 551, 300, 565);

        Tools.quadraticBezier(g2, 329, 560, 329, 567, 317, 578);
        Tools.quadraticBezier(g2, 317, 578, 300, 590, 300, 600);
    }

    public static void hand(Graphics2D g2) {
        //Left hand
        Tools.quadraticBezier(g2, 130, 600, 131, 587, 128, 578);// 130 588
        Tools.quadraticBezier(g2, 128, 578, 94, 560, 79, 533);// 99 558
        Tools.quadraticBezier(g2, 79, 533, 75, 519, 91, 521);// 80 523
        Tools.quadraticBezier(g2, 91, 521, 104, 527, 105, 532);// 100 73
        Tools.quadraticBezier(g2, 105, 532, 107, 544, 96, 543);//104 541

        Tools.quadraticBezier(g2, 98, 525, 109, 518, 104, 502);// 105 516
        Tools.quadraticBezier(g2, 104, 502, 109, 478, 130, 502);// 113 110
        Tools.quadraticBezier(g2, 130, 502, 138, 514, 130, 518);// 134 512
        Tools.quadraticBezier(g2, 130, 518, 122, 518, 117, 510);// 123 516

        Tools.quadraticBezier(g2, 124, 494, 134, 497, 133, 488);// 132 494
        Tools.quadraticBezier(g2, 133, 488, 138, 460, 154, 488);// 141 474
        Tools.quadraticBezier(g2, 154, 488, 163, 507, 152, 506);// 158 502
        Tools.quadraticBezier(g2, 152, 506, 146, 504, 144, 497);// 158 502

        Tools.quadraticBezier(g2, 158, 499, 165, 502, 168, 492);// 164 499
        Tools.quadraticBezier(g2, 168, 492, 177, 478, 182, 492);// 176 485
        Tools.quadraticBezier(g2, 182, 492, 189, 514, 180, 516);// 185 509
        Tools.quadraticBezier(g2, 180, 516, 170, 517, 171, 505);// 173 514 

        Tools.quadraticBezier(g2, 179, 516, 179, 536, 188, 535);// 173 514
        Tools.quadraticBezier(g2, 188, 535, 204, 521, 212, 528);// 173 514
        Tools.quadraticBezier(g2, 212, 528, 220, 535, 202, 549);// 173 514
        Tools.quadraticBezier(g2, 202, 549, 196, 554, 198, 562);// 173 514
        Tools.quadraticBezier(g2, 198, 562, 196, 579, 196, 600);// 173 514

        //Right Hand
        Tools.quadraticBezier(g2, 470, 600, 469, 587, 472, 578);// 130 588
        Tools.quadraticBezier(g2, 472, 578, 506, 560, 521, 533);// 99 558
        Tools.quadraticBezier(g2, 521, 533, 525, 519, 509, 521);// 80 523
        Tools.quadraticBezier(g2, 509, 521, 496, 527, 495, 532);// 100 73
        Tools.quadraticBezier(g2, 495, 532, 493, 544, 504, 543);// 104 541

        Tools.quadraticBezier(g2, 502, 525, 491, 518, 496, 502);// 105 516
        Tools.quadraticBezier(g2, 496, 502, 491, 478, 470, 502);// 113 110
        Tools.quadraticBezier(g2, 470, 502, 462, 514, 470, 518);// 134 512
        Tools.quadraticBezier(g2, 470, 518, 478, 518, 483, 510);// 123 516

        Tools.quadraticBezier(g2, 476, 494, 466, 497, 467, 488);// 132 494
        Tools.quadraticBezier(g2, 467, 488, 462, 460, 446, 488);// 141 474
        Tools.quadraticBezier(g2, 446, 488, 437, 507, 448, 506);// 158 502
        Tools.quadraticBezier(g2, 448, 506, 454, 504, 456, 497);// 158 502

        Tools.quadraticBezier(g2, 442, 499, 435, 502, 432, 492);// 164 499
        Tools.quadraticBezier(g2, 432, 492, 423, 478, 418, 492);// 176 485
        Tools.quadraticBezier(g2, 418, 492, 411, 514, 420, 516);// 185 509
        Tools.quadraticBezier(g2, 420, 516, 430, 517, 429, 505);// 173 514 
    }

    public static void lowerHat(Graphics2D g2) {
        //Left
        Tools.quadraticBezier(g2, 90, 350, 89, 347, 100, 340);
        Tools.quadraticBezier(g2, 90, 350, 85, 390, 140, 350);
        Tools.quadraticBezier(g2, 140, 350, 170, 346, 184, 334);
        Tools.quadraticBezier(g2, 186, 334, 211, 334, 250, 302);
        Tools.quadraticBezier(g2, 250, 302, 281, 301, 300, 288);

        Tools.quadraticBezier(g2, 100, 340, 108, 325, 132, 314);// 112 326
        Tools.quadraticBezier(g2, 132, 314, 140, 298, 172, 290);// 146 300
        Tools.quadraticBezier(g2, 172, 290, 183, 279, 214, 280);// 188 282
        Tools.quadraticBezier(g2, 214, 280, 263, 250, 300, 268);// 260 262

        //Right
        Tools.quadraticBezier(g2, 510, 350, 511, 347, 500, 340);
        Tools.quadraticBezier(g2, 510, 350, 515, 390, 460, 350);
        Tools.quadraticBezier(g2, 460, 350, 430, 346, 416, 334);
        Tools.quadraticBezier(g2, 414, 334, 389, 334, 350, 302);
        Tools.quadraticBezier(g2, 350, 302, 319, 301, 300, 288);

        Tools.quadraticBezier(g2, 500, 340, 492, 325, 468, 314);// 488 326
        Tools.quadraticBezier(g2, 468, 314, 460, 298, 428, 290);// 454 300
        Tools.quadraticBezier(g2, 428, 290, 417, 279, 386, 280);// 412 318
        Tools.quadraticBezier(g2, 386, 280, 337, 250, 300, 268);// 340, 338

        Tools.quadraticBezier(g2, 421, 516, 421, 536, 412, 535);
        Tools.quadraticBezier(g2, 412, 535, 396, 521, 388, 528);
        Tools.quadraticBezier(g2, 388, 528, 380, 535, 398, 549);
        Tools.quadraticBezier(g2, 398, 549, 404, 554, 402, 562);
        Tools.quadraticBezier(g2, 402, 562, 404, 579, 404, 600);

        //Sharp Part Left
        Tools.quadraticBezier(g2, 130, 360, 132, 370, 126, 398);
        Tools.quadraticBezier(g2, 126, 398, 169, 378, 176, 342);

        Tools.BresenhamLine(g2, 184, 337, 204, 344);
        Tools.BresenhamLine(g2, 204, 344, 212, 328);

        Tools.BresenhamLine(g2, 244, 312, 254, 317);
        Tools.BresenhamLine(g2, 254, 317, 256, 304);
        //Tools.quadraticBezier(g2, 192, 338, 0, 0, 204, 346);

        //Sharp Part Right
        Tools.quadraticBezier(g2, 470, 360, 468, 370, 474, 398);
        Tools.quadraticBezier(g2, 474, 398, 431, 378, 424, 342);

        Tools.BresenhamLine(g2, 416, 337, 396, 344);
        Tools.BresenhamLine(g2, 396, 344, 388, 328);

        Tools.BresenhamLine(g2, 356, 312, 346, 317);
        Tools.BresenhamLine(g2, 346, 317, 344, 304);
    }

    public static void hair(Graphics2D g2) {
        //Left
        Tools.quadraticBezier(g2, 78, 530, 17, 579, 38, 600);
        Tools.quadraticBezier(g2, 112, 485, 104, 502, 88, 520);
        Tools.quadraticBezier(g2, 106, 372, 71, 471, 40, 470);

        Tools.quadraticBezier(g2, 40, 470, 86, 502, 124, 478);
        Tools.quadraticBezier(g2, 118, 368, 113, 431, 136, 475);
        Tools.quadraticBezier(g2, 236, 506, 194, 509, 176, 484);
        Tools.quadraticBezier(g2, 180, 362, 171, 443, 236, 506);

        //Middle
        Tools.quadraticBezier(g2, 235, 328, 210, 354, 182, 382);
        Tools.quadraticBezier(g2, 235, 328, 245, 383, 328, 412);
        Tools.BresenhamLine(g2, 328, 412, 326, 395);
        Tools.BresenhamLine(g2, 326, 395, 340, 400);
        Tools.quadraticBezier(g2, 340, 400, 312, 357, 316, 310);
        //important about color
        Tools.quadraticBezier(g2, 316, 310, 332, 348, 373, 378);
        Tools.quadraticBezier(g2, 373, 378, 367, 354, 366, 330);

        Tools.quadraticBezier(g2, 366, 330, 393, 359, 424, 388);

        //Right
        Tools.quadraticBezier(g2, 426, 368, 429, 443, 364, 506);
        Tools.quadraticBezier(g2, 364, 506, 406, 509, 424, 484);
        Tools.quadraticBezier(g2, 482, 368, 487, 431, 464, 475);

        Tools.quadraticBezier(g2, 494, 372, 529, 471, 560, 470);
        Tools.quadraticBezier(g2, 560, 470, 514, 502, 476, 478);
        Tools.quadraticBezier(g2, 488, 485, 496, 502, 512, 520);
        Tools.quadraticBezier(g2, 522, 530, 583, 579, 562, 600);
    }

    public static void eyeBall(Graphics2D g2) {
        // g2.setStroke(new BasicStroke(4));

        //Left Side
        Tools.quadraticBezier(g2, 211, 381, 210, 373, 217, 372);
        Tools.quadraticBezier(g2, 217, 372, 225, 371, 225, 380);

        Tools.quadraticBezier(g2, 225, 380, 234, 378, 235, 384);
        Tools.quadraticBezier(g2, 235, 384, 235, 391, 231, 391);

        Tools.quadraticBezier(g2, 231, 393, 234, 405, 221, 401);

        Tools.quadraticBezier(g2, 220, 401, 209, 408, 208, 395);

        Tools.quadraticBezier(g2, 208, 395, 201, 393, 203, 387);
        Tools.quadraticBezier(g2, 203, 387, 204, 381, 211, 381);

        //Right Side
        Tools.quadraticBezier(g2, 376, 381, 375, 373, 382, 372);
        Tools.quadraticBezier(g2, 382, 372, 390, 371, 390, 380);

        Tools.quadraticBezier(g2, 390, 380, 399, 378, 400, 384);
        Tools.quadraticBezier(g2, 400, 384, 400, 391, 396, 391);

        Tools.quadraticBezier(g2, 396, 393, 399, 405, 386, 401);

        Tools.quadraticBezier(g2, 385, 401, 374, 408, 373, 395);

        Tools.quadraticBezier(g2, 373, 395, 366, 393, 368, 387);
        Tools.quadraticBezier(g2, 368, 387, 369, 381, 376, 381);
    }

    public static void eye(Graphics2D g2) {
        //Left Eye
        Tools.quadraticBezier(g2, 217, 360, 189, 360, 189, 388);
        Tools.quadraticBezier(g2, 189, 388, 189, 416, 217, 416);
        Tools.quadraticBezier(g2, 217, 416, 245, 416, 245, 388);
        Tools.quadraticBezier(g2, 245, 388, 245, 360, 217, 360);

        //Right eye
        Tools.quadraticBezier(g2, 383, 360, 355, 360, 355, 388);
        Tools.quadraticBezier(g2, 355, 388, 355, 416, 383, 416);
        Tools.quadraticBezier(g2, 383, 416, 411, 416, 411, 388);
        Tools.quadraticBezier(g2, 411, 388, 411, 360, 383, 360);

        Color replaceColor = new Color(0, 0, 0);
        Tools.floodFill(g2, 368, 371, replaceColor);
    }

    public static void mouse(Graphics2D g2) {
        //Lower
        Tools.quadraticBezier(g2, 282, 445, 300, 530, 318, 445);

        //Upper
        Tools.quadraticBezier(g2, 282, 445, 291, 455, 300, 445);
        Tools.quadraticBezier(g2, 300, 445, 309, 455, 318, 445);
    }

    public static void Head(Graphics2D g2) {
        Tools.quadraticBezier(g2, 184, 493, 300, 570, 416, 493);
    }
}
