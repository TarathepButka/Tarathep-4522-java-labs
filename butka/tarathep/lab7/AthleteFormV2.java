package butka.tarathep.lab7;

import javax.swing.*;
import java.awt.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 31, 2023

/**
 * The class AthleteFormV2 that extends the AthleteForm added new components
 * such as a combo box for nationality, a list for sport, and a text area for a
 * bio.
 * The addComponents method adds these components to the main panel.
 */
public class AthleteFormV2 extends AthleteForm {
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected JTextArea bioTextArea;
    protected JComboBox<String> nationalityComboBox;
    protected JList<String> spoList;
    protected String[] sport = { "Badminton", "Boxing", "Football", "Running" },
            nationality = { "American", "Chinese", "Indonesian", "Japanese", "Thai", "Vietnamese" };
    protected JPanel centerPanel, bioPanel, sportPanel, nationPanel, spnabioPanel;
    protected JScrollPane scrollPane;

    public AthleteFormV2(String heading) {
        super(heading);
    }

    /**
     * The method create a combobox for a nationality, list for a sport, and
     * text area for a bio. The nationality combobox contains six options for
     * nationality and the sport list contains several sports.
     * Then create a panel to hold the (sport label ,sport list, nationality label
     * and nationality combo box and text area bio) and add them to center panel and
     * add center panel to main panel and add main panel to JFrame.
     */
    @Override
    public void addComponents() {
        super.addComponents();

        // Create labels for the nationality, sport, and bio.
        nationalityLabel = new JLabel("Nationality :");
        sportLabel = new JLabel("Sport :");
        bioLabel = new JLabel("Bio :");

        // Create a combo box for the nationality.
        nationalityComboBox = new JComboBox<String>(nationality);

        // Create a panel to hold the nationality label and combo box.
        nationPanel = new JPanel(new GridLayout(1, 1));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationalityComboBox);
        nationalityComboBox.setSelectedIndex(4);

        // Create a panel to hold the sport label and list.
        spoList = new JList<String>(sport);
        sportPanel = new JPanel(new GridLayout(1, 1));
        sportPanel.add(sportLabel);
        sportPanel.add(spoList);
        spoList.setSelectedIndex(2);

        // Create a text area for the bio.
        bioTextArea = new JTextArea(6, 2);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(bioTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Create a panel to hold the nation panel, sport panel, and bio label.
        spnabioPanel = new JPanel(new BorderLayout());
        spnabioPanel.add(nationPanel, BorderLayout.NORTH);
        spnabioPanel.add(sportPanel, BorderLayout.CENTER);
        spnabioPanel.add(bioLabel, BorderLayout.SOUTH);

        // Create a panel to hold the spnabio panel and scroll pane.
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(spnabioPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add the center panel to the main panel in the center.
        mainPanel.add(centerPanel, BorderLayout.CENTER);

    }

    /**
     * The method creates an instance of "AthleteFormV2" and calls the methods to
     * add components and set the frame features.
     */
    public static void createAndShowGUI() {
        AthleteFormV2 alfV2 = new AthleteFormV2("Athlete Form V2");
        alfV2.addComponents();
        alfV2.setFrameFeatures();

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
