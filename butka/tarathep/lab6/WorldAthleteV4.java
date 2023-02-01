package butka.tarathep.lab6;

import butka.tarathep.lab5.*;
import java.util.*;

// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: January 28, 2023

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane = new BadmintonPlayerV3("Akane Yamaguchi", 55, 1.68, Athlete.Gender.FEMALE, "Japan",
                "05/02/1997");
        BadmintonPlayerV3 ratchanok = new BadmintonPlayerV3("Ratchanok Intanon", 55, 1.68, Athlete.Gender.FEMALE,
                "Thai", "05/02/1997");
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for (BadmintonPlayerV3 badmintonPlayer : badmintonPlayers) {
            System.out.println(badmintonPlayer);
        }
    }
}
