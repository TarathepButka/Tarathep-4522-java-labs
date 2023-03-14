package butka.tarathep.lab10;

import java.awt.event.ActionEvent;
import javax.swing.*;
import butka.tarathep.lab6.AthleteV2;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 13 , 2023

public class AthleteFormV12 extends AthleteFormV11 {
    // Comparator for sort by name.
    protected NameComparator nameComparator;
    // Comparator for sort by height.
    protected HeightComparator heightComparator;
    // Comparator for sort by height and weight.
    protected HeightWeightComparator heightandweightComparator;

    public AthleteFormV12(String heading) {
        super(heading);
        // Create new object of NameComparator.
        nameComparator = new NameComparator();
        // Create new object of HeightComparator.
        heightComparator = new HeightComparator();
        // Create new object of HeightWeightComparator.
        heightandweightComparator = new HeightWeightComparator();
    }

    // The method to add Actionlisteners for the byNMI, byHMI, byWaHMI.
    @Override
    protected void addListener() {
        super.addListener();
        byNMI.addActionListener(this);
        byHMI.addActionListener(this);
        byWaHMI.addActionListener(this);

    }

    // The method to sort athlete by height.
    protected void byHeight() {
        for (int i = 1; i < ArrAthlete.size(); i++) {
            // Get the athlete to be sorted by height.
            AthleteV2 heightsort = ArrAthlete.get(i);
            // Set the comparison index.
            int j = i - 1;
            // Compare heights of the current athlete and the athletes before it.
            while (j >= 0 && heightComparator.compare(heightsort, ArrAthlete.get(j)) < 0) {
                // If the current athlete is taller than the previous athlete, swap their
                // position in the array list.
                ArrAthlete.set(j + 1, ArrAthlete.get(j));
                j--;
            }
            // Set the current athlete to its new position in the array list.
            ArrAthlete.set(j + 1, heightsort);
        }
        // Show the updated athlete list.
        ShowAthlete();
    }

    // The method to sort athlete by name.
    protected void byName() {
        for (int i = 0; i < ArrAthlete.size() - 1; i++) {
            for (int j = 0; j < ArrAthlete.size() - i - 1; j++) {
                // Compare the names of athletes using the nameComparator.
                if (nameComparator.compare(ArrAthlete.get(j), ArrAthlete.get(j + 1)) == 1) {
                    // Swap the positions of the two athletes follow A-Z.
                    AthleteV2 namesort = ArrAthlete.get(j);
                    ArrAthlete.set(j, ArrAthlete.get(j + 1));
                    ArrAthlete.set(j + 1, namesort);
                }
            }
        }
        // Show the updated athlete list.
        ShowAthlete();
    }

    // The method to sort athlete by height and weight.
    protected void byHeightandWeight() {
        for (int i = 0; i < ArrAthlete.size() - 1; i++) {
            // Set the current index as the min index.
            int min = i;
            for (int j = i + 1; j < ArrAthlete.size(); j++) {
                if (heightandweightComparator.compare(ArrAthlete.get(j), ArrAthlete.get(min)) < 0) {
                    // If the current athlete has a smaller height and weight than the current min athlete, update the min index.
                    min = j;
                }
            }
            // Swap the athlete at the current index with the athlete at the min index.
            AthleteV2 hwsort = ArrAthlete.get(i);
            ArrAthlete.set(i, ArrAthlete.get(min));
            ArrAthlete.set(min, hwsort);
        }
        // Show the updated athlete list.
        ShowAthlete();
    }

    // The method set new handle to byNMI, byHMI, byWaHMI if clicked there MI it
    // sorting athlete by conditions and show the dialog according to the
    // conditions.
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src = event.getSource();
        if (src == byNMI) {
            byName();
        } else if (src == byHMI) {
            byHeight();
        } else if (src == byWaHMI) {
            byHeightandWeight();
        }

    }

    /**
     * The method creates an instance of "AthleteFormV12" and calls the methods to
     * addComponents, setFrameFeatures, initValues, addListener, changeItem and
     * addMenus.
     */
    public static void createAndShowGUI() {
        AthleteFormV12 alfV12 = new AthleteFormV12("Athlete Form V12");
        alfV12.addMenus();
        alfV12.addComponents();
        alfV12.initValues();
        alfV12.setFrameFeatures();
        alfV12.addListener();
        alfV12.changeItem();

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
