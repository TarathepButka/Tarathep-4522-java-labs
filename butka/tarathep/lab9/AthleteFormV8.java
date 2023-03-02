package butka.tarathep.lab9;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: February,27 , 2023

import butka.tarathep.lab8.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/**
 * The program extends "AthleteFormV6" then handle Cancel, Reset and Submit
 * button and change background color of textfields to pink and set text.
 * When click Cancel button this program will clear values of textfields,
 * radiobutton, slider and textarea and set check is select watching movies,
 * combobox is
 * select Thai and sport is select Football.
 * When click Reset button this program will clear all value component to empty.
 * When click Submit button this program will get information user enter then
 * show in bioArea.
 */
public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected String et = "\n", Name, Weight, Height, BD, Gender, Nation, Sport, resultTxt, Hobbies;
    protected int YearEx;
    protected Boolean rscBoolean = false;

    public AthleteFormV8(String heading) {
        super(heading);
    }

    @Override
    protected void addComponents() {
        super.addComponents();

    }

    // The method sets the background color of textfields.
    protected void setTFBGColor(Color color) {
        nametextField.setBackground(color);
        weighttextField.setBackground(color);
        heighttextField.setBackground(color);
        bdtextField.setBackground(color);
    }

    // The method to add listeners for the "Submit", "Cancel", and "Reset" buttons.
    protected void addListener() {
        cancelButton.addActionListener(this);
        resetButton.addActionListener(this);
        submitButton.addActionListener(this);

    }

    // The method sets initial values for several components on the form.
    protected void initValues() {
        setTFBGColor(Color.pink);
        nametextField.setText("Fongt");
        weighttextField.setText("67");
        heighttextField.setText("180");
        bdtextField.setText("07/10/2003");
        femaleRadioButton.setSelected(true);
        yearepSlider.setValue(10);

    }

    // The method handles button if button was clicked and calling the appropriate
    // method to handle the click.
    @Override
    public void actionPerformed(ActionEvent event) {
        Object srcObject = event.getSource();
        if (srcObject == submitButton) {
            handleSubmitButton();
        } else if (srcObject == cancelButton) {
            handleCancelButton();
        } else if (srcObject == resetButton) {
            handleResetButton();
        }
    }

    // The method resets several form components to their initial values and change
    // back ground of textfields to kku color.
    protected void handleCancelButton() {
        rscBoolean = true;
        clearSelection();
        wcCheckBox.setSelected(true);
        nationalityComboBox.setSelectedItem("Thai");
        spoList.setSelectedIndex(2);
        setTFBGColor(new Color(167, 59, 36));
        rscBoolean = false;

    }

    // The method clear all form to empty.
    protected void handleResetButton() {
        rscBoolean = true;
        clearSelection();
        nationalityComboBox.setSelectedItem(null);
        wcCheckBox.setSelected(false);
        spoList.clearSelection();
        setTFBGColor(Color.white);
        rscBoolean = false;

    }

    // The method reset all form input fields and checkbox.
    protected void clearSelection() {
        nametextField.setText("");
        weighttextField.setText("");
        heighttextField.setText("");
        bdtextField.setText("");
        genderBg.clearSelection();// change lab7 pro1
        rdCheckBox.setSelected(false);
        gdCheckBox.setSelected(false);
        spCheckBox.setSelected(false);
        otCheckBox.setSelected(false);
        yearepSlider.setValue(0);
        bioTextArea.setText("");
    }

    // The method gets the current values from the user input fields
    // and checkbox, formats them into a string, and displays the string in a text
    // area.
    protected void handleSubmitButton() {
        getValues();
        bioTextArea.setText(resultTxt);
    }

    //The method gets the current values from the input fields and checkboxes and stores them in the corresponding variables.
    protected void getValues() {
        //Get values from text fields.
        Name = nametextField.getText();
        Weight = weighttextField.getText();
        Height = heighttextField.getText();
        BD = bdtextField.getText();

        //Get values from a radio buttons.
        if (maleRadioButton.isSelected()) {
            Gender = maleRadioButton.getText();
        } else if (femaleRadioButton.isSelected()) {
            Gender = femaleRadioButton.getText();
        }

        //Get values from a list of check box.
        JCheckBox HobbiesList[] = { rdCheckBox, gdCheckBox, wcCheckBox, spCheckBox, otCheckBox };
        Hobbies = " ";
        for (int i = 0; i < HobbiesList.length; i++) {
            if (HobbiesList[i].isSelected()) {
                Hobbies += (HobbiesList[i].getText() + " ");
            }
        }

        //Get the selected value from a combo box.
        Nation = (String) nationalityComboBox.getSelectedItem();
        //Get the selected values from a list.
        Sport = spoList.getSelectedValuesList() + " ";
        YearEx = yearepSlider.getValue();

        resultTxt = "Name:" + Name + et + "Weight:" + Weight + et + "Height:" + Height + et + "Date of birth:" + BD + et
                + "Gender:" + Gender + et + "Hobbies:" + Hobbies + et + "Nationality:" + Nation + et + "Sports:" + Sport
                + et + "Experience years:" + YearEx;

    }

    /**
     * The method creates an instance of "AthleteFormV8" and calls the methods to
     * addComponents, set the setFrameFeatures, initValues, addListener and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV8 alfV8 = new AthleteFormV8("Athlete Form 8");
        alfV8.addMenus();
        alfV8.addComponents();
        alfV8.initValues();
        alfV8.setFrameFeatures();
        alfV8.addListener();

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
