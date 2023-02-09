package butka.tarathep.lab8;

import javax.swing.*;
import java.awt.*;

public class OlympicSymbol extends JPanel {

    private final int width = 50;
    private final int height = 50;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(5));

        g.setColor(Color.BLUE);
        g.drawOval(20, 10, width, height);

        g.setColor(Color.RED);
        g.drawOval(70, 10, width, height);

        g.setColor(Color.YELLOW);
        g.drawOval(120, 10, width, height);

        g.setColor(Color.GREEN);
        g.drawOval(45, 35, width, height);

        g.setColor(Color.BLACK);
        g.drawOval(95, 35, width, height);
    }
}