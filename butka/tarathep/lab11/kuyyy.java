package butka.tarathep.lab11;
import java.awt.*;
import javax.swing.*;

public class kuyyy extends JFrame {
    protected JPanel main,btp,pjj,gdp;
    protected JLabel nl,al,llg,gdl;
    protected JTextField nt;
    protected JCheckBox py,jv,jvs;
    protected JRadioButton M,F,O;
    protected JButton ok,canButton;
    protected JTextArea at;
    protected JScrollPane scrollPane;
    protected ButtonGroup group = new ButtonGroup();


    public kuyyy (String head) {   super (head); }

    protected void setFrameFeatures() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }
    public static void createAndShowGUI() {
        kuyyy msw = new kuyyy("My Simple Window");
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

    protected void addComponents(){
        main = new JPanel(new GridLayout(4,2));
        btp = new JPanel();
        pjj = new JPanel();
        gdp = new JPanel();
        nl = new JLabel("Name:");
        al = new JLabel("Address:");
        llg = new JLabel("Language:");
        gdl = new JLabel("Gender:");
        py = new JCheckBox("Python",true);
        jv = new JCheckBox("Java",true);
        jvs = new JCheckBox("Javascript");
        M = new JRadioButton("Male");
        F = new JRadioButton("Female",true);
        O = new JRadioButton("Other");
        ok = new JButton("Ok");
        nt = new JTextField("Fongt");
        at = new JTextArea("pen kuy rai i sas");
        at.setRows(6);
        at.setLineWrap(true);
        at.setWrapStyleWord(true);
        scrollPane = new JScrollPane(at);
        canButton = new JButton("Cancel");
        group.add(M);
        group.add(F);
        group.add(O);
        pjj.add(py);
        pjj.add(jv);
        pjj.add(jvs);
        gdp.add(M);
        gdp.add(F);
        gdp.add(O);
        btp.add(ok);
        btp.add(canButton);
        main.add(nl);
        main.add(nt);
        main.add(al);
        main.add(scrollPane);
        main.add(llg);
        main.add(pjj);
        main.add(gdl);
        main.add(gdp);
        add(main);
        add(btp,BorderLayout.SOUTH);



    }
}
