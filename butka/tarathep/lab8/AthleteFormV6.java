package butka.tarathep.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV6 extends AthleteFormV5 {
    JPanel olympicSymbolPanel;
    OlympicSymbol olympicSymbol;

    public AthleteFormV6(String heading) {
        super(heading);
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        olympicSymbolPanel = new JPanel(new BorderLayout());
        olympicSymbolPanel.setPreferredSize(new Dimension(200, 100));
        olympicSymbol = new OlympicSymbol();
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
