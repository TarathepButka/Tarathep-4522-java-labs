package butka.tarathep.lab10;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import butka.tarathep.lab6.*;
import butka.tarathep.lab5.Athlete.Gender;
import butka.tarathep.lab9.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 11 , 2023

/**
 * The program extends "AthleteFormV10" then add and handle menu items if
 * clicked add this program show and add athlete to the list.If clicked display
 * show the list of athletes.If clicked clear this program clear the list of
 * athlete.If clicked search this program will search athlete in the list.
 */
public class AthleteFormV11 extends AthleteFormV10 {
    protected JMenu dataM, sortM;
    protected JMenuItem addMI, displayMI, clearMI, searchMI, byNMI, byHMI, byWaHMI;
    protected ArrayList<JMenuItem> MIArrList;
    protected ArrayList<AthleteV2> ArrAthlete;
    protected String ShowAthlete = "", search;
    protected Gender gender;
    protected Boolean check;

    public AthleteFormV11(String heading) {
        super(heading);
        ArrAthlete = new ArrayList<AthleteV2>();
    }

    // The method to add Actionlisteners for the addMI, displayMI, clearMI and
    // searchMI.
    @Override
    protected void addListener() {
        super.addListener();
        addMI.addActionListener(this);
        displayMI.addActionListener(this);
        clearMI.addActionListener(this);
        searchMI.addActionListener(this);

    }

    // The method to data menu to add many menu items in the menu and add menu to
    // menu bar.Then changed color and font of menu items.
    @Override
    protected void addMenus() {
        super.addMenus();
        dataM = new JMenu("Data");
        dataM.setFont(new Font("SanSerif", Font.BOLD, 14));
        sortM = new JMenu("Sort");
        addMI = new JMenuItem("Add");
        displayMI = new JMenuItem("Display");
        clearMI = new JMenuItem("Clear");
        searchMI = new JMenuItem("Search");
        byNMI = new JMenuItem("By Name");
        byHMI = new JMenuItem("By Height");
        byWaHMI = new JMenuItem("By Height and Weight");
        menuBar.add(dataM);
        dataM.add(addMI);
        dataM.add(displayMI);
        dataM.add(clearMI);
        dataM.add(searchMI);
        dataM.add(sortM);
        sortM.add(byNMI);
        sortM.add(byHMI);
        sortM.add(byWaHMI);

        MIArrList = new ArrayList<JMenuItem>(
                Arrays.asList(addMI, displayMI, clearMI, searchMI, byHMI, byNMI, byWaHMI, sortM));
        for (JMenuItem MI : MIArrList) {
            MI.setFont(new Font("SanSerif", Font.BOLD, 14));
            MI.setForeground(new Color(6, 57, 112));
        }

    }

    // The method to add actions to the menu items.
    @Override
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        if (src == addMI) {
            addAthlete();
        } else if (src == displayMI) {
            display();
        } else if (src == clearMI) {
            ArrAthlete.clear();
        } else if (src == searchMI) {
            Search();
        } else {
            super.actionPerformed(event);
        }

    }

    // The method to get input values from athlete form.Then keep in athlete and
    // show athlete.
    protected void addAthlete() {
        // Get input values from text fields and combo box.
        String name = nametextField.getText();
        double weight = Double.parseDouble(weighttextField.getText());
        double height = Double.parseDouble(heighttextField.getText());
        String nationality = nationalityComboBox.getSelectedItem().toString();
        String dofb = bdtextField.getText();

        // Get gender value based on selected radio button.
        AthleteV2.Gender gender = null;
        if (maleRadioButton.isSelected()) {
            gender = AthleteV2.Gender.MALE;
        } else if (femaleRadioButton.isSelected()) {
            gender = AthleteV2.Gender.FEMALE;
        }

        // Create new athlete object with input values.
        AthleteV2 athlete = new AthleteV2(name, weight, height, gender, nationality, dofb);

        // Add new athlete object to ArrayList.
        ArrAthlete.add(athlete);

        // Show message dialog with information about the new add athlete.
        JOptionPane.showMessageDialog(null, athlete);
    }

    // The method to show athlete in the list of athlete.
    protected void display() {
        ShowAthlete = "";
        // If the ArrayList is empty, show a message no athlete.
        if (ArrAthlete.size() == 0) {
            JOptionPane.showMessageDialog(null, "There is no athlete in the list");
        }
        // If there is only one athlete in the ArrayList, display athlete.
        else if (ArrAthlete.size() == 1) {
            // Loop through the ArrayList and get the information for the one athlete.
            for (int i = 0; i < ArrAthlete.size(); i++) {
                ShowAthlete += (i + 1) + ". " + ArrAthlete.get(i) + et;
            }
            // Show message dialog about the one athlete.
            JOptionPane.showMessageDialog(null, "There is one athlete as follows:" + et + ShowAthlete);
        }
        // If there are many athletes in the ArrayList, call the ShowAthlete method to
        // display all athlete.
        else if (ArrAthlete.size() > 1) {
            ShowAthlete();
        }
    }

    // The method to display the athlete in the ArrayList.
    protected void ShowAthlete() {
        ShowAthlete = "There are " + ArrAthlete.size() + " athletes as follows:" + et;
        for (int i = 0; i < ArrAthlete.size(); i++) {
            ShowAthlete += (i + 1) + ". " + ArrAthlete.get(i) + et;
        }
        JOptionPane.showMessageDialog(null, ShowAthlete);
    }

    protected void Search() {
        // Show input dialog asking for athlete name to search.
        search = JOptionPane.showInputDialog("Please enter athlete name:");
        // Set check value to false.
        check = false;
        // Loop through ArrayList and check if athlete with match name is found.
        for (AthleteV2 athlete : ArrAthlete) {
            if (athlete.getName().equals(search)) {
                // If athlete is found, show message athlete is found.
                JOptionPane.showMessageDialog(null, athlete + " is found");
                check = true;
                // Exit loop once athlete is found.
                break;
            }
        }
        // If athlete is not found and input is not null, show message athlete is not found.
        if (!check && search != null) {
            JOptionPane.showMessageDialog(null, "Athlete " + search + " is NOT found");
        }
    }

    /**
     * The method creates an instance of "AthleteFormV11" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV11 alfV11 = new AthleteFormV11("Athlete Form V11");
        alfV11.addMenus();
        alfV11.addComponents();
        alfV11.initValues();
        alfV11.setFrameFeatures();
        alfV11.addListener();
        alfV11.changeItem();

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
