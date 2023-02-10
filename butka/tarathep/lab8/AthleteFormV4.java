package butka.tarathep.lab8;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: February,6 , 2023

import javax.swing.*;
import java.awt.*;
import butka.tarathep.lab7.*;

/**
 * The program extends "AthleteFormV3" and adds
 * hobbiesLabel,hobbiesCheckbox(reading, gardening, watching movies, shopping,
 * and others) under genderPanel,yearepLabel, and yearepslider(0-20years) in the
 * south of centerPanel.
 */
public class AthleteFormV4 extends AthleteFormV3 {
    JLabel hobbiesLabel, yearepLabel;
    JPanel hobPanel, hobboxPanel, sliderPanel;
    JCheckBox rdCheckBox, gdCheckBox, wcCheckBox, spCheckBox, otCheckBox;
    JSlider yearepSlider;

    public AthleteFormV4(String heading) {
        super(heading);
    }

    /**
     * The method creates hobbiesLabel and hobbiesCheckbox then add to the north of
     * nationPanel.Then creates yearepLabel and yearepslider and add them to the
     * south of bioTextArea.
     */
    @Override
    protected void addComponents() {
        super.addComponents();

        // create a label for hobbies
        hobbiesLabel = new JLabel("Hobbies:");

        // create a label for the year of experience in this sport
        yearepLabel = new JLabel("Year of experience in this sport:");

        // create check boxes for hobbies
        rdCheckBox = new JCheckBox("Reading");
        gdCheckBox = new JCheckBox("Gardening");
        wcCheckBox = new JCheckBox("Watching movies", true);
        spCheckBox = new JCheckBox("Shopping");
        otCheckBox = new JCheckBox("Others");

        // create a panel for the hobbies check boxes
        hobboxPanel = new JPanel();
        hobboxPanel.add(rdCheckBox);
        hobboxPanel.add(gdCheckBox);
        hobboxPanel.add(wcCheckBox);
        hobboxPanel.add(spCheckBox);
        hobboxPanel.add(otCheckBox);

        // create a panel for the hobbies section
        hobPanel = new JPanel(new BorderLayout());
        hobPanel.add(hobbiesLabel, BorderLayout.NORTH);
        hobPanel.add(hobboxPanel, BorderLayout.CENTER);
        spnabioPanel.add(hobPanel, BorderLayout.NORTH);

        // create a slider for the year of experience in this sport
        yearepSlider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
        yearepSlider.setMajorTickSpacing(5);
        yearepSlider.setMinorTickSpacing(1);
        yearepSlider.setPaintTicks(true);
        yearepSlider.setPaintLabels(true);

        // create a panel for the year of experience slider
        sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(yearepLabel, BorderLayout.NORTH);
        sliderPanel.add(yearepSlider, BorderLayout.CENTER);
        centerPanel.add(sliderPanel, BorderLayout.SOUTH);
    }

    /**
     * The method creates an instance of "AthleteFormV4" and calls the methods to
     * addComponents, set the setFrameFeatures and addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV4 alfV4 = new AthleteFormV4("Athlete Form V4");
        alfV4.addMenus();
        alfV4.addComponents();
        alfV4.setFrameFeatures();

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
