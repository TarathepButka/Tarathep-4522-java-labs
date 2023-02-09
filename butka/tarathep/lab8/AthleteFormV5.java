package butka.tarathep.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV5 extends AthleteFormV4 {

    public AthleteFormV5(String heading) {
        super(heading);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
      
        //Change the background color of all the text fields (name, weight, height, and
        //date of birth) to a color defined in R, G, B as 167,59,36.
        
        nametextField.setBackground(new Color(167, 59, 36));
        weighttextField.setBackground(new Color(167, 59, 36));
        heighttextField.setBackground(new Color(167, 59, 36));
        bdtextField.setBackground(new Color(167, 59, 36));

        /**
         * Change the font of all the labels (name, weight, height, date of birth,
         * gender, hobbies, nationality, sport, bio, experience) to "Serif", bold, and
         * size 14.
         */
        nameLabel.setFont(new Font("Serif", Font.BOLD, 14));
        weightLabel.setFont(new Font("Serif", Font.BOLD, 14));
        heightLabel.setFont(new Font("Serif", Font.BOLD, 14));
        hobbiesLabel.setFont(new Font("Serif", Font.BOLD, 14));
        nationalityLabel.setFont(new Font("Serif", Font.BOLD, 14));
        sportLabel.setFont(new Font("Serif", Font.BOLD, 14));
        yearepLabel.setFont(new Font("Serif", Font.BOLD, 14));
        genderLabel.setFont(new Font("Serif", Font.BOLD, 14));
        bioLabel.setFont(new Font("Serif", Font.BOLD, 14));
        bdLabel.setFont(new Font("Serif", Font.BOLD, 14));

        // Change the font color of the sport list to blue.
        spoList.setForeground(new Color(35, 45, 222));

        /**
         * Change the font of the buttons (cancel, reset, and submit) to "Serif", Bold
         * and Italic, and size 16)
         */
        cancelButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        resetButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));
        submitButton.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 16));

        /**
         * Change the background color of the bio text area to a color defined in (R, G,
         * B) as (200,200,200).
         */
        bioTextArea.setBackground(new Color(200, 200, 200));

        // Set the tooltip text for the (cancel button,reset button, and submit button).
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");

    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // Change the font of all the menu and menu items to SanSerif, bold, and size
        // 14
        fileMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        configMenu.setFont(new Font("SanSerif", Font.BOLD, 14));
        saveMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        newMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        openMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        exitMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        colorMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        sizeMI.setFont(new Font("SanSerif", Font.BOLD, 14));
        redItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        greenItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        blueItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        stItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        twItem.setFont(new Font("SanSerif", Font.BOLD, 14));
        twfItem.setFont(new Font("SanSerif", Font.BOLD, 14));

        /**
         * Change the color of all the menu and menu items (except FIle and Config menu)
         * to color with (R, G, B) as (6,57,112).
         */
        saveMI.setForeground(new Color(6, 57, 112));
        newMI.setForeground(new Color(6, 57, 112));
        openMI.setForeground(new Color(6, 57, 112));
        exitMI.setForeground(new Color(6, 57, 112));
        colorMI.setForeground(new Color(6, 57, 112));
        sizeMI.setForeground(new Color(6, 57, 112));
        redItem.setForeground(new Color(6, 57, 112));
        greenItem.setForeground(new Color(6, 57, 112));
        blueItem.setForeground(new Color(6, 57, 112));
        stItem.setForeground(new Color(6, 57, 112));
        twItem.setForeground(new Color(6, 57, 112));
        twfItem.setForeground(new Color(6, 57, 112));

        // Set the tooltip text for the file menu and config menu.
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of a component");

    }

    /**
     * The method creates an instance of "AthleteFormV5" and calls the methods to
     * addComponents, set the setFrameFeatures and addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV5 alfV5 = new AthleteFormV5("Athlete Form V5");
        alfV5.addMenus();
        alfV5.addComponents();
        alfV5.setFrameFeatures();

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
