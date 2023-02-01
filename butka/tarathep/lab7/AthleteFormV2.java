package butka.tarathep.lab7;

import javax.swing.*;
import java.awt.*;


public class AthleteFormV2 extends AthleteForm {
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected JTextArea bioTextArea;
    protected JComboBox<String> nationalityComboBox;
    protected JList<String> spoList;
    protected String[] sport = {"Badminton","Boxing","Football", "Running"};
    protected JPanel centerPanel,bioPanel,sportPanel,nationPanel,spnabioPanel;
    protected JScrollPane scrollPane;

    public AthleteFormV2(String heading) {
        super(heading);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        nationalityLabel = new JLabel("Nationality :");
        sportLabel = new JLabel("Sport :");
        bioLabel = new JLabel("Bio :");
        nationalityComboBox = new JComboBox<String>();
        nationalityComboBox.addItem("American");
        nationalityComboBox.addItem("Chinese");
        nationalityComboBox.addItem("Indonesian");
        nationalityComboBox.addItem("Japanese");
        nationalityComboBox.addItem("Thai");
        nationalityComboBox.addItem("Vietnamese");

        nationPanel = new JPanel(new GridLayout(1,1));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationalityComboBox);
        nationalityComboBox.setSelectedIndex(4);
        
        
        spoList = new JList<String>(sport);
        sportPanel = new JPanel(new GridLayout(1,1));
        sportPanel.add(sportLabel);
        sportPanel.add(spoList);
        spoList.setSelectedIndex(2);

        bioTextArea = new JTextArea(6,2);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(bioTextArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        spnabioPanel = new JPanel(new BorderLayout());
        spnabioPanel.add(nationPanel,BorderLayout.NORTH);
        spnabioPanel.add(sportPanel,BorderLayout.CENTER);
        spnabioPanel.add(bioLabel,BorderLayout.SOUTH);
        

        centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(spnabioPanel,BorderLayout.NORTH);
        centerPanel.add(scrollPane,BorderLayout.CENTER);
        
        
        mainPanel.add(centerPanel,BorderLayout.CENTER);
     
    }

    public static void createAndShowGUI() {
        AthleteFormV2 alfV2 = new AthleteFormV2("Athlete Form V2");
        alfV2.addComponents();
        alfV2.setFrameFeatures();
        
    }
        
        public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        createAndShowGUI();
                    }
                });
        }

}
