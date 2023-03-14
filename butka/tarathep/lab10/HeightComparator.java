package butka.tarathep.lab10;

import java.util.Comparator;
import butka.tarathep.lab6.AthleteV2;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: March, 13 , 2023

public class HeightComparator implements Comparator<AthleteV2> {

    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        if (athlete1.getHeight() < athlete2.getHeight()) {
            return -1;
        } else if (athlete1.getHeight() > athlete2.getHeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}