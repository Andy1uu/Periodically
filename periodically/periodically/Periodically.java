package periodically;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Periodically extends JPanel {
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Timer timer;
    private ArrayList<Element> elements;
    private ArrayList<JButton> elementButtons;

    public Periodically(ArrayList<Element> elements) {
        myImage = new BufferedImage(1300, 1000, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        myBuffer.setColor(new Color(204, 255, 255));
        myBuffer.fillRect(0, 0, 1300, 1000);
        this.elements = elements;
        elementButtons = new ArrayList<JButton>();

        elementButtons.add(new JButton("H"));
        elementButtons.get(0).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elements.get(0).draw(myBuffer);
            }
        });
        add(elementButtons.get(0));

        elementButtons.add(new JButton("He"));
        elementButtons.get(1).addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elements.get(1).draw(myBuffer);
            }
        });
        add(elementButtons.get(1));

        timer = new Timer(5, new Listener());
        timer.start();
    }


    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Hydrogen
            elementButtons.get(0).setSize(60, 60);
            elementButtons.get(0).setLocation(100, 200);
// //Helium
            elementButtons.get(1).setSize(60, 60);
            elementButtons.get(1).setLocation(1120, 200);
// //Lithium
// elementButtons.get(2).setSize(60, 60);
// elementButtons.get(2).setLocation(100,260);
// //Beryillium
// elementButtons.get(3).setSize(60, 60);
// elementButtons.get(3).setLocation(160,260);
// //Boron
// elementButtons.get(4).setSize(60, 60);
// elementButtons.get(4).setLocation(820,260);
// //Carbon
// elementButtons.get(5).setSize(60, 60);
// elementButtons.get(5).setLocation(880,260);
// //Nitrogen
// elementButtons.get(6).setSize(60, 60);
// elementButtons.get(6).setLocation(940,260);
// //Oxygen
// elementButtons.get(7).setSize(60, 60);
// elementButtons.get(7).setLocation(1000,260);
// //Fluorine
// elementButtons.get(8).setSize(60, 60);
// elementButtons.get(8).setLocation(1060,260);
// //Neon
// elementButtons.get(9).setSize(60, 60);
// elementButtons.get(9).setLocation(1120,260);
// //Sodium
// elementButtons.get(10).setSize(60, 60);
// elementButtons.get(10).setLocation(100,320);
// //Magnesium
// elementButtons.get(11).setSize(60, 60);
// elementButtons.get(11).setLocation(160,320);
// //Aluminium
// elementButtons.get(12).setSize(60, 60);
// elementButtons.get(12).setLocation(820,320);
// //Silicon
// elementButtons.get(13).setSize(60, 60);
// elementButtons.get(13).setLocation(880,320);
// //Phosphorus
// elementButtons.get(14).setSize(60, 60);
// elementButtons.get(14).setLocation(940,320);
// //Sulfur
// elementButtons.get(15).setSize(60, 60);
// elementButtons.get(15).setLocation(1000,320);
// //Chlorine
// elementButtons.get(16).setSize(60, 60);
// elementButtons.get(16).setLocation(1060,320);
// //Argon
// elementButtons.get(17).setSize(60, 60);
// elementButtons.get(17).setLocation(1120,320);
// //Potassium
// elementButtons.get(18).setSize(60, 60);
// elementButtons.get(18).setLocation(100,380);
// //Calcium
// elementButtons.get(19).setSize(60, 60);
// elementButtons.get(19).setLocation(160, 380);
// // Scandium
// elementButtons.get(20).setSize(60, 60);
// elementButtons.get(20).setLocation(220, 380);
// // Titanium
// elementButtons.get(21).setSize(60, 60);
// elementButtons.get(21).setLocation(280, 380);
// // Vanadium
// elementButtons.get(22).setSize(60, 60);
// elementButtons.get(22).setLocation(340, 380);
// // Chromium
// elementButtons.get(23).setSize(60, 60);
// elementButtons.get(23).setLocation(400, 380);
// // Manganese
// elementButtons.get(24).setSize(60, 60);
// elementButtons.get(24).setLocation(460, 380);
// // Iron
// elementButtons.get(25).setSize(60, 60);
// elementButtons.get(25).setLocation(520, 380);
// // Cobalt
// elementButtons.get(26).setSize(60, 60);
// elementButtons.get(26).setLocation(580, 380);
// // Nickel
// elementButtons.get(27).setSize(60, 60);
// elementButtons.get(27).setLocation(640, 380);
// // Copper
// elementButtons.get(28).setSize(60, 60);
// elementButtons.get(28).setLocation(700, 380);
// // Zinc
// elementButtons.get(29).setSize(60, 60);
// elementButtons.get(29).setLocation(760, 380);
// //Gallium
// elementButtons.get(30).setSize(60, 60);
// elementButtons.get(30).setLocation(820,380);
// //Germanium
// elementButtons.get(31).setSize(60, 60);
// elementButtons.get(31).setLocation(880,380);
// //Arsenic
// elementButtons.get(32).setSize(60, 60);
// elementButtons.get(32).setLocation(940,380);
// //Selenium
// elementButtons.get(33).setSize(60, 60);
// elementButtons.get(33).setLocation(1000,380);
// //Bromine
// elementButtons.get(34).setSize(60, 60);
// elementButtons.get(34).setLocation(1060,380);
// //Krypton
// elementButtons.get(35).setSize(60, 60);
// elementButtons.get(35).setLocation(1120,380);
// //Rubidium
// elementButtons.get(36).setSize(60, 60);
// elementButtons.get(36).setLocation(100,440);
// //Strontium
// elementButtons.get(37).setSize(60, 60);
// elementButtons.get(37).setLocation(160,440);
// //Yttrium
// elementButtons.get(38).setSize(60, 60);
// elementButtons.get(38).setLocation(220,440);
// //Zirconium
// elementButtons.get(39).setSize(60, 60);
// elementButtons.get(39).setLocation(280,440);
// //Niobium
// elementButtons.get(40).setSize(60, 60);
// elementButtons.get(40).setLocation(340,440);
// //Molybdenum
// elementButtons.get(41).setSize(60, 60);
// elementButtons.get(41).setLocation(400,440);
// //Technetium
// elementButtons.get(42).setSize(60, 60);
// elementButtons.get(42).setLocation(460,440);
// //Ruthenium
// elementButtons.get(43).setSize(60, 60);
// elementButtons.get(43).setLocation(520,440);
// //Rhodium
// elementButtons.get(44).setSize(60, 60);
// elementButtons.get(44).setLocation(580,440);
// //Palladium
// elementButtons.get(45).setSize(60, 60);
// elementButtons.get(45).setLocation(640,440);
// //Silver
// elementButtons.get(46).setSize(60, 60);
// elementButtons.get(46).setLocation(700,440);
// //Cadmium
// elementButtons.get(47).setSize(60, 60);
// elementButtons.get(47).setLocation(760,440);
// //Indium
// elementButtons.get(48).setSize(60, 60);
// elementButtons.get(48).setLocation(820,440);
// //Tin
// elementButtons.get(49).setSize(60, 60);
// elementButtons.get(49).setLocation(880,440);
            repaint();
        }
    }
}
