package butka.tarathep.lab11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.SwingUtilities;
import butka.tarathep.lab6.AthleteV2;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 18 , 2023

/**
 * The program extends "AthleteFormV15" then creates new methods for saving and
 * reading data from the file.saveAthlete method to get the data from the
 * AthleteForm and then saves the data to the file.readAthlete method to read
 * the data from the file.Then appends the data to the bioset and set
 * bioTextAtrea to bioset.
 */
public class AthleteFormV16 extends AthleteFormV15 {

    public AthleteFormV16(String heading) {
        super(heading);
    }

    @Override
    protected void saveFile() {
        super.saveFile();
        // Call saveAthlete method.
        saveAthlete();
    }

    @Override
    protected void openFile() {
        super.openFile();
        // Call readAthlete method.
        readAthlete();
    }

    // The method save an athlete object to a file.
    protected void saveAthlete() {
        // Get the athlete data from the form.
        double weight = Double.parseDouble(weighttextField.getText());
        double height = Double.parseDouble(heighttextField.getText());
        AthleteV2.Gender gender = null;
        if (maleRadioButton.isSelected()) {
            gender = AthleteV2.Gender.MALE;
        } else if (femaleRadioButton.isSelected()) {
            gender = AthleteV2.Gender.FEMALE;
        }
        String dob = bdtextField.getText();
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        fileChooser.setCurrentDirectory(new File("."));
        int filechooses = fileChooser.showSaveDialog(this);
        // If the user selects a file.
        if (filechooses == JFileChooser.APPROVE_OPTION) {
            // Getting the selected file.
            File file = fileChooser.getSelectedFile();
            try {
                // Create a FileOutputStream and ObjectOutputStream for writing data to the
                // file.
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                // Create an AthleteV2 object and write athlete to the file.
                AthleteV2 athlete = new AthleteV2(nametextField.getText(), weight, height, gender,
                        nationalityComboBox.getSelectedItem().toString(), dob);
                oos.writeObject(athlete);
                // Close the output stream.
                oos.close();
                fos.close();
                // Display a message confirm that athlete was saved.
                JOptionPane.showMessageDialog(null, athlete);
                JOptionPane.showMessageDialog(null, "Saving athlete in file" + file.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // The method to read athlete object from a file and append to bioset.
    protected void readAthlete() {
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        fileChooser.setCurrentDirectory(new File("."));
        int filechooses = fileChooser.showOpenDialog(this);
        // If the user selects a file.
        if (filechooses == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // Create a FileOutputStream and ObjectOutputStream for reading data to the
                // file.
                FileInputStream fileIS = new FileInputStream(file);
                ObjectInputStream obIS = new ObjectInputStream(fileIS);
                // Read an AthleteV2 object from the file and append it to the bioset.
                AthleteV2 athlete = (AthleteV2) obIS.readObject();
                bioset.append("\n" + athlete.toString());
                // Close the input stream.
                obIS.close();
                fileIS.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * The method creates an instance of "AthleteFormV16" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV16 alfV16 = new AthleteFormV16("Athlete Form V16");
        alfV16.addMenus();
        alfV16.addComponents();
        alfV16.initValues();
        alfV16.setFrameFeatures();
        alfV16.addListener();
        alfV16.changeItem();

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
