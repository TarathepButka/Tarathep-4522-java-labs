package butka.tarathep.lab11;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.*;
import butka.tarathep.lab10.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 18 , 2023

/**
 * The program extends "AthleteFormV13" then creates new methods for saving and
 * reading data from the file.saveFile() method to save name and hobbies to the
 * file.open() method to open and read the file.Then appends the name and
 * hobbies to the bioset and set bioTextArea to bioset.
 */
public class AthleteFormV14 extends AthleteFormV13 {
    protected int selectedHobbies;
    protected StringBuilder bioset = new StringBuilder();

    public AthleteFormV14(String heading) {
        super(heading);
    }

    // The method to get the selected hobby and write a new file.If the selected
    // hobby is only one save and show message dialog according to conditions.and
    // multiple
    // selections hobbies too.
    protected void saveFile() {
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        int filechooses = fileChooser.showSaveDialog(this);
        // If the user selects a file.
        if (filechooses == JFileChooser.APPROVE_OPTION) {
            // Getting the selected file.
            File file = fileChooser.getSelectedFile();
            try {
                // Instantiating a BufferedWriter object to write to the file.
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                // Create an array of JCheckBox objects.
                JCheckBox HobbiesList[] = { rdCheckBox, gdCheckBox, wcCheckBox, spCheckBox, otCheckBox };
                Hobbies = "";
                // Initializing selectedHobbies.
                selectedHobbies = 0;
                for (int i = 0; i < HobbiesList.length; i++) {
                    // If the JCheckBox is selected.
                    if (HobbiesList[i].isSelected()) {
                        // Add its text to the Hobbies field and append a "," and a space.
                        Hobbies += (HobbiesList[i].getText() + ", ");
                        selectedHobbies++; // Increment selectedHobbies
                    }
                }
                // Write the athlete's name to the file.
                writer.write(nametextField.getText() + "\n");
                // Write the hobbies to the file.
                writer.write(Hobbies);
                // Close the BufferedWriter.
                writer.close();
                // If there is only one selected hobby.
                if (selectedHobbies == 1) {
                    // Display a message dialog that a hobby is being saved.
                    JOptionPane.showMessageDialog(null, "Saving a hobby in file " + file.getAbsolutePath());
                }
                // If there are multiple selected hobbies.
                else if (selectedHobbies > 1) {
                    // Display a message dialog that a hobbies is being saved.
                    JOptionPane.showMessageDialog(null, "Saving hobbies in file " + file.getAbsolutePath());
                }
                // If error occurs while writing to the file.
            } catch (IOException e) {
                // Display an error message.
                JOptionPane.showMessageDialog(null, "Error saving hobbies: " + e.getMessage());
            }
        }
    }

    // The method to read the file that user choose from directory.If
    // hobby is only one read and append according to conditions.and multiple
    // hobbies too.
    protected void openFile() {
        // Clearing bioTextArea.
        bioTextArea.setText("");
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        int filechoose = fileChooser.showOpenDialog(this);
        if (filechoose == JFileChooser.APPROVE_OPTION) {
            // Getting the selected file.
            File file = fileChooser.getSelectedFile();
            // Trying to read from the file
            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);

                // Reading the first and second lines of the file.
                String line1 = bufferedReader.readLine();
                String line2 = bufferedReader.readLine();

                // Splitting the first line into two parts using the "," separator.
                String[] parts = line1.split(",");
                String athleteName = parts[0];
                String hobbies = line2;

                // Joining the hobbies array into a comma-separated string.
                String hobbiesString = String.join(", ", hobbies);

                // Removing the ", " from the hobbies string.
                if (!hobbiesString.isEmpty()) {
                    hobbiesString = hobbiesString.substring(0, hobbiesString.length() - 2);
                }

                // Checking which menu item was selected and appending the message to bioset.
                if (selectedHobbies == 1) {
                    bioset.append(athleteName + " has a hobby as " + hobbiesString);
                } else {
                    bioset.append(athleteName + " has hobbies as " + hobbiesString);
                }
                // Closing the BufferedReader.
                bufferedReader.close();
            } catch (IOException ex) {
                // Printing the stack trace if an exception occurs.
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // If the Open menu was selected.
        if (event.getSource() == openMI) {
            // Call the openFile method.
            openFile();
            // Set the bioTextArea text to the bioset.
            bioTextArea.setText(bioset.toString());
            // Reset the bioset.
            bioset.setLength(0);
            // If the Save menu was selected.
        } else if (event.getSource() == saveMI) {
            // Call the saveFile method.
            saveFile();
        } else {
            // Call the actionPerformed method of the superclass.
            super.actionPerformed(event);
        }

    }

    /**
     * The method creates an instance of "AthleteFormV14" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV14 alfV14 = new AthleteFormV14("Athlete Form V14");
        alfV14.addMenus();
        alfV14.addComponents();
        alfV14.initValues();
        alfV14.setFrameFeatures();
        alfV14.addListener();
        alfV14.changeItem();

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
