package butka.tarathep.lab8;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: February,8 , 2023

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

/**
 * The program extends "AthleteFormV6" and add the image on the imagePanel
 * before putting the panel at the bottom of the window above the
 * buttons.
 */
public class AthleteFormV7 extends AthleteFormV6 {
    protected JPanel imagePanel;
    protected ReadImage readImage;

    public AthleteFormV7(String heading) {
        super(heading);
    }

    /**
     * The method creates a imagePanel with a BorderLayout and
     * sets its preferred size to 400 pixels wide and 300 pixels height.Then
     * creates a new object of class ReadImage called readImage and adds it to the
     * imagePanel.And putting the panel at the bottom of the window above the
     * buttons.
     */
    @Override
    protected void addComponents() {
        super.addComponents();

        imagePanel = new JPanel(new BorderLayout());
        imagePanel.setPreferredSize(new Dimension(500, 300));
        readImage = new ReadImage();
        imagePanel.add(readImage);
        mainPanel.add(imagePanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.SOUTH);

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

/**
 * The class overrides the paintComponent method of the JPanel class. This
 * method is called every time the panel needs to be repainted, and the code
 * inside it draws the image.
 */
class ReadImage extends JPanel {
    BufferedImage img;
    String filename = "/TestGit/Tarathep-4522-java-labs/images/Athlete.png";

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    // The ReadImage constructor reads the image from the file path using the
    // ImageIO.read method.
    public ReadImage() {
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
