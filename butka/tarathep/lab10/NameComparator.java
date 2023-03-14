package butka.tarathep.lab10;

import java.util.Comparator;
import butka.tarathep.lab6.AthleteV2;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 13 , 2023

public class NameComparator implements Comparator<AthleteV2> {
    protected String name1,name2;
    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        name1 = athlete1.getName();
        name2 = athlete2.getName();

        if (name1.compareTo(name2) > 0) {
            return 1;
        } else if (name1.compareTo(name2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
