package butka.tarathep.lab8;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: February,8 , 2023

import javax.swing.*;
import java.awt.*;

/**
 * The program extends "AthleteFormV5" and add the olympic symbol on top of the
 * window.
 */
public class AthleteFormV6 extends AthleteFormV5 {
    JPanel olympicSymbolPanel;
    OlympicSymbol olympicSymbol;

    public AthleteFormV6(String heading) {
        super(heading);
    }

    /**
     * The method creates a olympicSymbolPanel with a BorderLayout and sets
     * its preferred size to 200 pixels wide and 100 pixels height. Then
     * creates a new object of class OlympicSymbol and adds it to the
     * olympicSymbolPanel.And add the olympic symbol on top of the
     * window.
     */
    @Override
    protected void addComponents() {
        super.addComponents();

        olympicSymbolPanel = new JPanel(new BorderLayout());
        olympicSymbolPanel.setPreferredSize(new Dimension(200, 100));
        olympicSymbol = new OlympicSymbol();
        olympicSymbol.setBackground(Color.WHITE);
        olympicSymbolPanel.add(olympicSymbol);
        add(olympicSymbolPanel, BorderLayout.NORTH);

    }

    /**
     * The method creates an instance of "AthleteFormV6" and calls the methods to
     * addComponents, set the setFrameFeatures and addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV6 alfV6 = new AthleteFormV6("Athlete Form V6");
        alfV6.addMenus();
        alfV6.addComponents();
        alfV6.setFrameFeatures();

    }

    /**
     * The main method invokes the method "createAndShowGUI" on the Event Dispatch
     * Thread using the SwingUtilities.invokeLater method, which is a recommended
     * way to start a Swing GUI in Java.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

/**
 * The class overrides the paintComponent method of the JPanel class. This
 * method is called every time the panel needs to be repainted, and the code
 * inside it draws the Olympic symbol. using a series of calls to the drawOval
 * method on the Graphics object passed in as a parameter. Before drawing each
 * oval, the color is set using the setColor method and the stroke is set using
 * the setStroke method to make the outline of the ovals thicker.
 */
class OlympicSymbol extends JPanel {

    private final int width = 50;
    private final int height = 50;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(5));

        g.setColor(Color.BLUE);
        g.drawOval(30, 10, width, height);

        g.setColor(Color.RED);
        g.drawOval(80, 10, width, height);

        g.setColor(Color.YELLOW);
        g.drawOval(130, 10, width, height);

        g.setColor(Color.GREEN);
        g.drawOval(55, 35, width, height);

        g.setColor(Color.BLACK);
        g.drawOval(105, 35, width, height);
    }
}