package butka.tarathep.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected JLabel nameLabel, weightLabel,heightLabel, bdLabel ,genderLabel;
    protected JTextField nametextField,weighttextField,heighttextField,bdtextField,gendertextField;
    protected JRadioButton maleRadioButton , femaleRadioButton;
    protected JPanel typePanel,genderPanel;

    public AthleteForm(String heading) {
        super(heading);
        
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        nameLabel = new JLabel("Name :");
        weightLabel = new JLabel("Weight :");
        heightLabel = new JLabel("Height :");
        bdLabel = new JLabel("Date of Birth (dd-mm-yyyy) :");
        genderLabel = new JLabel("Gender :");

        nametextField = new JTextField();
        weighttextField = new JTextField();
        heighttextField = new JTextField();
        bdtextField = new JTextField();
        gendertextField = new JTextField();

        maleRadioButton = new JRadioButton("Male",true);
        femaleRadioButton = new JRadioButton("Female");
        genderPanel = new JPanel();
        ButtonGroup genderBg = new ButtonGroup();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderBg.add(maleRadioButton);
        genderBg.add(femaleRadioButton);

        typePanel = new JPanel(new GridLayout(5,2));
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
        
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(typePanel,BorderLayout.NORTH);
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);
        
        


    }




    public static void createAndShowGUI() {
        AthleteForm alf = new AthleteForm("Athlete Form");
        alf.addComponents();
        alf.setFrameFeatures();
        
    }
        
        public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        createAndShowGUI();
                    }
                });
        }
    
}
