package butka.tarathep.lab2;

public class MonneyProcessor {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println(
                    "Usage MonneyProcessor <# of 1,000 Baht Notes> <# of 500 Baht Notes> <# of 100 Baht Notes> <# of 20 Baht Notes>");
            System.exit(0);
        }
        // This MonneyProcessor program is to accept 4 arguments.
        else {
            int OTB = Integer.parseInt(args[0]);// declare num of 1,000 Baht Notes
            int FHB = Integer.parseInt(args[1]);// declare num of 500 Baht Notes
            int OHB = Integer.parseInt(args[2]);// declare num of 100 Baht Notes
            int TWB = Integer.parseInt(args[3]);// declare num of 20 Baht Notes
            int TOTB = OTB * 1000;
            int TFHB = FHB * 500;
            int TOHB = OHB * 100;
            int TTWB = TWB * 20;
            // Operation to convert money
            int TTMN = TOTB + TFHB + TOHB + TTWB;// Total money

            System.out.println("Total Money is " + (float) TTMN);
            // Its output format is //Total Money is TTMN

        }

    }
}
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: December 10, 2022