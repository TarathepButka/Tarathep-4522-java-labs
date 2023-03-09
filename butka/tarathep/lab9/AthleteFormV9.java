package butka.tarathep.lab9;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March,2 , 2023

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The program extends "AthleteFormV8" then handle textfields, menu,
 * radiobutton, combobox and checkbox.
 * When user input text in textfields and press enter or selected gender or
 * selected hobbies or selected nationality or clicked menu or use accelerator
 * and mnemonic key this program will show in dialog box.
 */
public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {

    protected ArrayList<JTextField> txtFieldsArrList;
    protected List<JTextField> txtFieldsList;
    protected ArrayList<JCheckBox> checkboxArrList;
    protected List<JCheckBox> checkboxList;
    protected ItemListener Itemcb;
    protected Object srcCheckBox, srcnation;

    public AthleteFormV9(String heading) {
        super(heading);

    }

    /**
     * The method sets up event listeners for various components of the form, such
     * as textfields, radiobutton, and menu items and set name of textfield and set
     * accelerator and mnemonic key of menu.
     */
    protected void addListener() {
        super.addListener();

        // Add action listeners for text fields and set their names.
        nametextField.addActionListener(this);
        nametextField.setName("Name");
        weighttextField.addActionListener(this);
        weighttextField.setName("Weight");
        heighttextField.addActionListener(this);
        heighttextField.setName("Height");
        bdtextField.addActionListener(this);
        bdtextField.setName("Date of birth");

        // Add action listeners for combobox.
        nationalityComboBox.addActionListener(this);

        // Add action listeners and shortcuts for new menu items.
        newMI.addActionListener(this);
        newMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newMI.setMnemonic(KeyEvent.VK_N);
        

        // Add action listeners and shortcuts for open menu items.
        openMI.addActionListener(this);
        openMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        openMI.setMnemonic(KeyEvent.VK_O);

        // Add action listeners and shortcuts for save menu items.
        saveMI.addActionListener(this);
        saveMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveMI.setMnemonic(KeyEvent.VK_S);

        // Add action listeners and shortcuts for exit menu items.
        exitMI.addActionListener(this);
        exitMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        exitMI.setMnemonic(KeyEvent.VK_X);

        // Add item listeners for radio buttons
        femaleRadioButton.addItemListener(this);
        maleRadioButton.addItemListener(this);

    }

    // The methods handle events when a radiobutton is selected.
    @Override
    public void itemStateChanged(ItemEvent e) {
        // Get the source of the event, which should be a radio button.
        JRadioButton srcgender = (JRadioButton) e.getSource();
        // If the radio button is selected, show a message dialog box.
        if (e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(null, srcgender.getText() + " is selected");
        }

    }

    // The methods handle events when a menu item is clicked, textfields is change
    // and enter and a combobox is selected.
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        txtFieldsList = Arrays.asList(nametextField, weighttextField, heighttextField, bdtextField);
        txtFieldsArrList = new ArrayList<JTextField>(txtFieldsList);
        // Loop through each text field in the list.
        for (JTextField textField : txtFieldsArrList) {
            // Check if the event source is the current text field.
            if (event.getSource() == textField) {
                // Display a message dialog textfield is changed to its new text.
                JOptionPane.showMessageDialog(null, textField.getName() + " is changed to " + textField.getText());
            }
        }

        srcnation = event.getSource();
        if (rscBoolean == false) {
            // If the combo box has a selected item, show a message dialog with the selected
            // item.
            if (srcnation == nationalityComboBox) {
                if (nationalityComboBox.getSelectedIndex() == -1) {

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Nationality is changed to " + nationalityComboBox.getSelectedItem().toString());
                }

            }
        }

        if (event.getSource() == newMI) {
            JOptionPane.showMessageDialog(newMI, "You click menu New");
        } else if (event.getSource() == saveMI) {
            JOptionPane.showMessageDialog(newMI, "You click menu Save");
        } else if (event.getSource() == openMI) {
            JOptionPane.showMessageDialog(newMI, "You click menu Open");
        } else if (event.getSource() == exitMI) {
            System.exit(0);
        }

    }

    // The method sets up an ItemListener to handle changes to the checkbox items.
    protected void changeItem() {
        // Create a list of all checkboxes to be used.
        checkboxList = Arrays.asList(wcCheckBox, rdCheckBox, gdCheckBox, spCheckBox, otCheckBox);
        // Convert the list to an ArrayList for easier manipulation.
        checkboxArrList = new ArrayList<JCheckBox>(checkboxList);
        // Disable the focus for each checkbox.
        for (JCheckBox dis : checkboxArrList) {
            dis.setFocusable(false);
        }
        // Create a new ItemListener for each checkbox.
        Itemcb = new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // Get the source of the event which checkbox was clicked.
                srcCheckBox = e.getSource();
                if (rscBoolean == false) {
                    // Loop through each checkbox to see which one was clicked.
                    for (JCheckBox dis : checkboxArrList) {
                        if (srcCheckBox == dis) {
                            // If the checkbox was selected, show a message that it's also a hobby.
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                JOptionPane.showMessageDialog(null, dis.getActionCommand() + " is also your hobby");
                            }
                            // If the checkbox was deselected, show a message that it's no longer a hobby.
                            else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                JOptionPane.showMessageDialog(null,
                                        dis.getActionCommand() + " is no longer your hobby");
                            }
                        }
                    }
                }
            }

        };
        // Add the ItemListener to each checkbox.
        for (JCheckBox dis : checkboxArrList) {
            dis.addItemListener(Itemcb);
        }

    }

    /**
     * The method creates an instance of "AthleteFormV9" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV9 alfV9 = new AthleteFormV9("Athlete Form V9");
        alfV9.addMenus();
        alfV9.addComponents();
        alfV9.initValues();
        alfV9.setFrameFeatures();
        alfV9.addListener();
        alfV9.changeItem();

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
