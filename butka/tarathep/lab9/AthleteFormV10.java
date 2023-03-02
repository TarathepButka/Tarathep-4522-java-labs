package butka.tarathep.lab9;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 2 , 2023

import javax.swing.*;
import javax.swing.event.*;

/**
 * The program extends "AthleteFormV9" then handle sportList and yearepSlider
 * when changes in the selection of sports in the spoList or value of
 * yearepSlider this program will show dialog box what you changes.
 */
public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener, ChangeListener {
    protected String selectedSportsString;

    public AthleteFormV10(String heading) {
        super(heading);
    }

    // The method to add listeners to spoList and yearepSlider components.
    protected void addListener() {
        super.addListener();
        spoList.addListSelectionListener(this);
        yearepSlider.addChangeListener(this);
    }

    // The method to handle changes in the selection of sports in the spoList.
    @Override
    public void valueChanged(ListSelectionEvent e) {

        selectedSportsString = spoList.getSelectedValuesList().toString();

        // Check if the value is still adjusting and if the rscBoolean is false.
        if (!e.getValueIsAdjusting() && rscBoolean == false) {
            // Check if sports are not selected.
            if (spoList.getSelectionModel().isSelectionEmpty()) {

            } else {
                // Get the selected sports and display them in a dialog box.
                JOptionPane.showMessageDialog(null, "Selected sports are "
                        + selectedSportsString.replace("[", "").replace("]", "").replace(",", ""));
            }
        }
    }

    // The method to handle changes in the value of the yearepSlider.
    @Override
    public void stateChanged(ChangeEvent e) {
        // Get the source of the event as a JSlider.
        JSlider yearex = (JSlider) e.getSource();
        // Check if the value is still adjusting and if the rscBoolean is false.
        if (!yearex.getValueIsAdjusting() && rscBoolean == false) {
            int value = yearex.getValue();
            // Get the value of the yearepSlider and display it in a dialog box.
            JOptionPane.showMessageDialog(null, "# of experience years is " + value);
        }
    }

    /**
     * The method creates an instance of "AthleteFormV10" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV10 alfV10 = new AthleteFormV10("Athlete Form 10");
        alfV10.addMenus();
        alfV10.addComponents();
        alfV10.initValues();
        alfV10.setFrameFeatures();
        alfV10.addListener();
        alfV10.changeItem();

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
