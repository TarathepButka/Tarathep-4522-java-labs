package butka.tarathep.lab2;

public class Datatypes {
    public static void main(String[] args) {
        String name_lastname = "Tarathep Butka";// name
        String ID = "6530404522";// student id
        char mname = name_lastname.charAt(0); // 1st character name
        Boolean t = true;// 1st letter
        int MSDID8 = 026;// declare octal value
        int MSDID16 = 0x16;// declare hexadecimal value
        Long LValues = 22L;// declare long value
        Float S = 22.65f;// declare float
        Double SD = 22.22d;// declare double

        System.out.println("My name is " + name_lastname);
        System.out.println("My student ID was " + ID);
        System.out.println(mname + " " + t + " " + MSDID8 + " " + MSDID16);
        System.out.print(LValues + " " + S + " " + SD);
    }
    // Its output format is
    // My name is Tarathep Butka
    // My student ID was 6530404522
    // T true 22 22
    // 22 22.65 22.22

}
// Author: Tarathep Butka
// ID: 653040452-2
// Sec: 1
// Date: December 10, 2022