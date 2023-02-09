package butka.tarathep.lab8;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class ReadImage extends JPanel {
    BufferedImage img;
    String filename = "butka/tarathep/lab8/Athlete.png";
    @Override
    public void paintComponent(Graphics g) {
       g.drawImage(img,0,0,null);
    }
    public ReadImage() {
       try {
           img = ImageIO.read(new File(filename));
       } catch (IOException e) {
          e.printStackTrace(System.err);
       }
    }
   }

