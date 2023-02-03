package butka.tarathep.lab7;

import javax.swing.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 30, 2023

// This is a Java code that creates a simple window using the JFrame class, which is part of the Java Swing GUI library.
class MySimpleWindow extends JFrame {
    protected JPanel mainPanel, buttonPanel;
    protected JButton cancelButton, resetButton, submitButton;

    public MySimpleWindow(String heading) {
        super(heading);
    }

    /**
     * Sets the visibility, closes the window when the user closes it, packs the
     * window, and sets its location relative to the center of the screen.
     */
    protected void setFrameFeatures() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    /**
     * Adds three buttons (cancel, reset, and submit) to a panel, adds the panel
     * to the main panel and add main panel to JFrame.
     */
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

    /**
     * The method creates an instance of "MySimpleWindow" and calls the methods to
     * add components and set the frame features.
     */
    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();

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
