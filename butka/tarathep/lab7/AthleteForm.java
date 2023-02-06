package butka.tarathep.lab7;

import javax.swing.*;
import java.awt.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 31, 2023

/**
 * The class AthleteForm extends the MySimpleWindow class and creates a window
 * with a form to input the name, weight, height, date of birth, and gender of
 * an athlete.
 */
public class AthleteForm extends MySimpleWindow {
    protected JLabel nameLabel, weightLabel, heightLabel, bdLabel, genderLabel;
    protected JTextField nametextField, weighttextField, heighttextField, bdtextField, gendertextField;
    protected JRadioButton maleRadioButton, femaleRadioButton;
    protected JPanel typePanel, genderPanel;

    public AthleteForm(String heading) {
        super(heading);

    }

    @Override
    /**
     * The method create label, text field and radio buttons.Then create a panel to
     * hold all the labels, text fields and radio buttons and set the layout of the
     * main panel and
     * add the typePanel and buttonPanel and add main panel to JFrame.
     */
    protected void addComponents() {
        super.addComponents();

        // Create labels for each text field
        nameLabel = new JLabel("Name :");
        weightLabel = new JLabel("Weight :");
        heightLabel = new JLabel("Height :");
        bdLabel = new JLabel("Date of Birth (dd-mm-yyyy) :");
        genderLabel = new JLabel("Gender :");

        // Create text fields for each label
        nametextField = new JTextField();
        weighttextField = new JTextField();
        heighttextField = new JTextField();
        bdtextField = new JTextField();
        gendertextField = new JTextField();

        // Create radio buttons for gender selection
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        // Create a button group for the radio buttons
        genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        ButtonGroup genderBg = new ButtonGroup();
        genderBg.add(maleRadioButton);
        genderBg.add(femaleRadioButton);

        // Create a panel to hold all the labels and text fields
        typePanel = new JPanel(new GridLayout(5, 2));
        typePanel.add(nameLabel);
        typePanel.add(nametextField);
        typePanel.add(weightLabel);
        typePanel.add(weighttextField);
        typePanel.add(heightLabel);
        typePanel.add(heighttextField);
        typePanel.add(bdLabel);
        typePanel.add(bdtextField);
        typePanel.add(genderLabel);
        typePanel.add(genderPanel);

        // Set the layout of the main panel and add the typePanel and buttonPanel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(typePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

    }

    /**
     * The method creates an instance of "AthleteForm" and calls the methods to add
     * components and set the frame features.
     */
    public static void createAndShowGUI() {
        AthleteForm alf = new AthleteForm("Athlete Form");
        alf.addComponents();
        alf.setFrameFeatures();

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
