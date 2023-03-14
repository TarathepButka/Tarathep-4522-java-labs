package butka.tarathep.lab10;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 14 , 2023

/**
 * The program extends "AthleteFormV12" then check whether weight and height are
 * valid double numbers. In other words, the numbers cannot be characters. In
 * addition, the weight value needs to be in the range (0, 200] and the height
 * value needs to be in the range (0, 300].If input not in conditions it show
 * error message, but in condition show .... is changed to ..... .
 */
public class AthleteFormV13 extends AthleteFormV12 {
    // Set the max values for height and weight.
    protected final double MAX_HEIGHT = 300;
    protected final double MAX_WEIGHT = 200;
    // Set the min value to 0.
    protected final double min = 0;
    // Variables to hold the weight and height inputs.
    protected double weight;
    protected double height;
    // Variable to check if the weight and height inputs are valid.
    protected int value = 0;

    public AthleteFormV13(String heading) {
        super(heading);
    }

    @Override
    protected void addAthlete() {
        // Get valid weight input.
        weight = getValidNumber(weighttextField, "Weight", MAX_WEIGHT);
        if (weight == -1) {
            // If weight input is invalid, no add the athlete.
            return;
        }
        // Get valid height input.
        height = getValidNumber(heighttextField, "Height", MAX_HEIGHT);
        if (height == -1) {
            // If height input is invalid, no add the athlete.
            return;
        }
        // If weight and height inputs are valid, add the athlete.
        super.addAthlete();
    }

    // The method to check if the input is a valid number and in the range.If number
    // not in the range show message according to the conditions.
    protected int getValidNumber(JTextField textField, String name, double max) {
        value = 1;
        try {
            double number = Double.parseDouble(textField.getText());
            // If the input is more than max,it shows error message.
            if (number > max) {
                JOptionPane.showMessageDialog(null, name + " should be less than " + max);
                value = -1;
            }
            // If the input is less than min,it shows error message.
            else if (number <= min) {
                JOptionPane.showMessageDialog(null, name + " should be greater than " + min);
                value = -1;
            }
            // If the input text contains the characters "f" or "d",it shows error message.
            else if (textField.getText().contains("f") || textField.getText().contains("d")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for " + name);
                value = -1;
            }
        }
        // If the input text cannot be parsed as a double, it shows error message.
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for " + name);
            value = -1;
        }
        return value;
    }

    /**
     * The method set new handle to weighttextField, heighttextField if input not
     * correct, it show error message.If input is correct, it show message .... is
     * changed to .....
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        txtFieldsList = Arrays.asList(weighttextField, heighttextField);
        txtFieldsArrList = new ArrayList<JTextField>(txtFieldsList);
        // Loop through each text field in the list.
        for (JTextField textField : txtFieldsArrList) {
            // Check if the event source is the current text field.
            if (event.getSource() == textField) {
                // Get the valid weight input.
                weight = getValidNumber(weighttextField, "Weight", MAX_WEIGHT);
                if (weight == -1) {
                    // If weight input is invalid, no add the athlete.
                    return;
                }
                // Get the valid height input.
                height = getValidNumber(heighttextField, "Height", MAX_HEIGHT);
                if (height == -1) {
                    // If height input is invalid, no add the athlete.
                    return;
                }

            }
        }
        super.actionPerformed(event);
    }

    /**
     * The method creates an instance of "AthleteFormV13" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV13 alfV13 = new AthleteFormV13("Athlete Form V13");
        alfV13.addMenus();
        alfV13.addComponents();
        alfV13.initValues();
        alfV13.setFrameFeatures();
        alfV13.addListener();
        alfV13.changeItem();
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
