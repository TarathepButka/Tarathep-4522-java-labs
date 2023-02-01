package butka.tarathep.lab7;

import javax.swing.*;


class MySimpleWindow extends JFrame{
    protected JPanel mainPanel,buttonPanel;
    protected JButton cancelButton,resetButton,submitButton;

    public MySimpleWindow(String heading) {
        super(heading);
    }

    protected void setFrameFeatures() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        
    }

    protected void addComponents() {
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");

        buttonPanel = new JPanel();
        mainPanel = new JPanel();

        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        mainPanel.add(buttonPanel);
        add(mainPanel);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
        
    }
        
        public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        createAndShowGUI();
                    }
                });
        }
        
}

