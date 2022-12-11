package butka.tarathep.lab2;

public class StringAPI {
    public static void main(String[] args) {
        String schoolName = args[0];
        String unvst = "university";
        String cl = "college";
        String scnc = schoolName.toLowerCase();// the String, converted to lowercase
        if (scnc.contains(unvst)) {
            System.out.println(schoolName + " is a university");
        } // Its output format is (schoolName is a university)
        else if (scnc.contains(cl)) {
            System.out.println(schoolName + " is a college");
        } // Its output format is (schoolName is a college)
        else {
            System.out.println(schoolName + " is neither a university nor a college");
        } // Its output format is (schoolName is neither a university nor a college)
          // //ignore cases

    }
}
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: December 10, 2022
