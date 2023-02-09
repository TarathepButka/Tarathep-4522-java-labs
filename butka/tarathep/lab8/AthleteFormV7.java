package butka.tarathep.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV7 extends AthleteFormV6 {
    JPanel imagePanel;
    ReadImage readImage;

    public AthleteFormV7(String heading) {
        super(heading);
    }

    @Override
    protected void addComponents(){
        super.addComponents();

        imagePanel = new JPanel(new BorderLayout());
        imagePanel.setPreferredSize(new Dimension(400,300));
        readImage = new ReadImage();
        imagePanel.add(readImage);
        add(imagePanel,BorderLayout.SOUTH); 

    }

    /**
     * The method creates an instance of "AthleteFormV7" and calls the methods to
     * addComponents, set the setFrameFeatures and addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV7 alfV7 = new AthleteFormV7("Athlete Form V7");
        alfV7.addMenus();
        alfV7.addComponents();
        alfV7.setFrameFeatures();

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
