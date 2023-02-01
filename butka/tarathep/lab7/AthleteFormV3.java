package butka.tarathep.lab7;

import javax.swing.*;

public class AthleteFormV3 extends AthleteFormV2 {
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colorMI, sizeMI;
    protected JMenuItem newMI, openMI, saveMI, exitMI, redItem, greenItem, blueItem, stItem, twItem, twfItem;

    public AthleteFormV3(String heading) {
        super(heading);
    }

    public void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        ImageIcon newIcon = new ImageIcon(getClass().getResource("images/Newicon.png"));
        newMI = new JMenuItem("New", newIcon);
        ImageIcon openIcon = new ImageIcon(getClass().getResource("images/Openicon.png"));
        openMI = new JMenuItem("Open", openIcon);
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("images/Saveicon.png"));
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

    @Override
    public void addComponents() {
        super.addComponents();

    }

    public static void createAndShowGUI() {
        AthleteFormV3 alfV3 = new AthleteFormV3("Athlete Form V3");
        alfV3.addComponents();
        alfV3.setFrameFeatures();
        alfV3.addMenus();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
