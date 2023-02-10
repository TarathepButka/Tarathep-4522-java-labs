package butka.tarathep.lab7;

import javax.swing.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: February 1, 2023

/**
 * The program extends "AthleteFormV2" and add a menu bar with various
 * options such as "File", "Config", "Color", and "Size". The menu bar has
 * several menu items such as "New", "Open", "Save", "Exit", "Red", "Green",
 * "Blue", "16", "20", and "24".
 */
public class AthleteFormV3 extends AthleteFormV2 {
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMI, sizeMI;
    protected JMenuItem newMI, openMI, saveMI, exitMI, redItem, greenItem, blueItem, stItem, twItem, twfItem;

    public AthleteFormV3(String heading) {
        super(heading);
    }

    /**
     * The method creates a menu bar with two menus, "File" and "Config". The "File"
     * menu
     * contains four items: "New", "Open", "Save", and "Exit". The "Config" menu
     * contains two sub-menus, "Color" and "Size". The "Color" sub-menu contains
     * three items: "Red", "Green", and "Blue", while the "Size" sub-menu contains
     * three items: "16", "20", and "24". Finally, the created menu bar is set as
     * the menu bar for a JFrame.
     */
    protected void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        ImageIcon newIcon = new ImageIcon(getClass().getResource("/images/Newicon.png"));
        newMI = new JMenuItem("New", newIcon);
        ImageIcon openIcon = new ImageIcon(getClass().getResource("/images/Openicon.png"));
        openMI = new JMenuItem("Open", openIcon);
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/Saveicon.png"));
        saveMI = new JMenuItem("Save", saveIcon);
        exitMI = new JMenuItem("Exit");
        configMenu = new JMenu("Config");
        colorMI = new JMenu("Color");
        sizeMI = new JMenu("Size");
        redItem = new JMenuItem("Red");
        greenItem = new JMenuItem("Green");
        blueItem = new JMenuItem("Blue");
        stItem = new JMenuItem("16");
        twItem = new JMenuItem("20");
        twfItem = new JMenuItem("24");
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.addSeparator();
        fileMenu.add(exitMI);
        configMenu.add(colorMI);
        configMenu.add(sizeMI);
        colorMI.add(redItem);
        colorMI.add(greenItem);
        colorMI.add(blueItem);
        sizeMI.add(stItem);
        sizeMI.add(twItem);
        sizeMI.add(twfItem);

        this.setJMenuBar(menuBar);

    }

    /**
     * The method creates an instance of "AthleteFormV3" and calls the methods to
     * addComponents, set the setFrameFeatures and addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV3 alfV3 = new AthleteFormV3("Athlete Form V3");
        alfV3.addMenus();
        alfV3.addComponents();
        alfV3.setFrameFeatures();

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
