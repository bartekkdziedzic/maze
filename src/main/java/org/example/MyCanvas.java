package org.example;

import java.awt.*;

public class MyCanvas extends Canvas {

    public MyCanvas() {
        setBackground(Color.PINK);
        setSize(401, 401);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);

        for (int i = 0; i <= 402; i += 20) {
            g.drawLine(0, i, 400, i);
            g.drawLine(i, 0, i, 400);
        }
        g.setColor(Color.PINK);
        for (int i = 0; i <= 402; i += 20) {
            for (int j = 0; j <= 402; j += 20) {
                g.drawLine(i, j, i, j);
            }

        }
        g.setColor(Color.CYAN);
    }
}
