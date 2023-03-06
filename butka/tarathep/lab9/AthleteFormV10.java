public static void createAndShowGUI() {
    AthleteFormV10 alfV10 = new AthleteFormV10("Athlete Form V10");
    alfV10.addMenus();
    alfV10.addComponents();
    alfV10.initValues();
    alfV10.setFrameFeatures();
    alfV10.addListener();
    alfV10.changeItem();

}