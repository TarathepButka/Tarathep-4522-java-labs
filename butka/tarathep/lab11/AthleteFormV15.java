package butka.tarathep.lab11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 18 , 2023

/**
 * The program extends "AthleteFormV14" then creates neww methods for saving and
 * reading data from the file.saveSlider method to get name and slider values
 * then saves the data to the binary file.readSlider method to read the data
 * from binary file and append to bioset.Then set bioTextArea to bioset.
 */
public class AthleteFormV15 extends AthleteFormV14 {

    public AthleteFormV15(String heading) {
        super(heading);
    }

    @Override
    protected void saveFile() {
        super.saveFile();
        // Call saveSlider method.
        saveSlider();

    }

    // The method saves name and value of the slider and shows message dialog when
    // the file is saved.
    protected void saveSlider() {
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        int filechooses = fileChooser.showSaveDialog(this);
        // If the user selects a file.
        if (filechooses == JFileChooser.APPROVE_OPTION) {
            // Getting the selected file.
            File file = fileChooser.getSelectedFile();
            try {
                // Create a FileOutputStream and DataOutputStream for writing data to the file.
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos);
                // Write the athlete name and slider value to the file.
                dos.writeUTF(nametextField.getText());
                dos.writeInt(yearepSlider.getValue());
                // Close the DataOutputStream and FileOutputStream.
                dos.close();
                fos.close();
                // Display a message dialog that the data was saved.
                JOptionPane.showMessageDialog(null, "Saving experiences year in file" + file.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void openFile() {
        super.openFile();
        // Calls readSlider method.
        readSlider();
    }

    // The method reads the data from the file and appends it to the bioset
    // according to the conditions.
    protected void readSlider() {
        // Instantiating a JFileChooser object.
        JFileChooser fileChooser = new JFileChooser();
        // Displaying a file chooser dialog.
        int filechooses = fileChooser.showOpenDialog(this);
        // If the user selects a file.
        if (filechooses == JFileChooser.APPROVE_OPTION) {
            // Getting the selected file.
            File file = fileChooser.getSelectedFile();
            try {
                // Create a FileInputStream and DataInputStream for reading data from the file.
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
                // Read the athlete name and slider value from the file.
                String name = dis.readUTF();
                int year = dis.readInt();
                // Check the slider value and appending the appropriate message to the bioset.
                if (year == 1) {
                    bioset.append("\n" + name + " has " + year + " year of experiences");
                } else if (year > 1) {
                    bioset.append("\n" + name + " has " + year + " years of experiences");
                }
                // Close the DataInputStream and FileInputStream.
                dis.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * The method creates an instance of "AthleteFormV15" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV15 alfV15 = new AthleteFormV15("Athlete Form V15");
        alfV15.addMenus();
        alfV15.addComponents();
        alfV15.initValues();
        alfV15.setFrameFeatures();
        alfV15.addListener();
        alfV15.changeItem();

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
