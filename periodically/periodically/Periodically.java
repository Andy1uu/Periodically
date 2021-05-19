package periodically;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Periodically extends JPanel {
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Timer timer;
    private ArrayList<JButton> elementButtons;

    private static final int BUTTONSIZE = 60;

    public Periodically(ArrayList<Element> elements) {
        myImage = new BufferedImage(1300, 1000, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        myBuffer.setColor(new Color(204, 255, 255));
        myBuffer.fillRect(0, 0, 1300, 1000);
        elementButtons = new ArrayList<JButton>();

        for (int index = 0; index < elements.size(); index++) {

            elementButtons.add(new JButton(elements.get(index).getSymbol()));

            final int currentIndex = index;

            elementButtons.get(index).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    elements.get(currentIndex).draw(myBuffer);
                }
            });

            add(elementButtons.get(index));
        }

        timer = new Timer(5, new Listener());
        timer.start();
    }


    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int currentElementButtonIndex =
                0; currentElementButtonIndex < elementButtons
                    .size(); currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setSize(
                    BUTTONSIZE, BUTTONSIZE);
            }

            int column1XPos = 100;
            int row1YPos = 200;

            // Hydrogen
            elementButtons.get(0).setLocation(column1XPos, row1YPos);
            // Helium
            elementButtons.get(1).setLocation(1120, row1YPos);

            int row2YPos = row1YPos + BUTTONSIZE;

            // Lithium
            elementButtons.get(2).setLocation(column1XPos, row2YPos);
            // Beryillium
            elementButtons.get(3).setLocation(column1XPos + BUTTONSIZE, row2YPos);

            int column13XPos = column1XPos + (BUTTONSIZE*12);

            // Boron - Neon
            for (int currentElementButtonIndex =
                4; currentElementButtonIndex < 10; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column13XPos, row2YPos);
                column13XPos += BUTTONSIZE;
            }

            int row3YPos = row2YPos + BUTTONSIZE;

            // Sodium
            elementButtons.get(10).setLocation(100, row3YPos);
            // Magnesium
            elementButtons.get(11).setLocation(160, row3YPos);

            column13XPos = 820;
            
            // Aluminium - Argon
            for (int currentElementButtonIndex =
                12; currentElementButtonIndex < 18; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column13XPos, row3YPos);
                column13XPos += BUTTONSIZE;
            }
            
            int row4YPos = row3YPos + BUTTONSIZE;
            
            //Potassium - Krypton
            for (int currentElementButtonIndex =
                18; currentElementButtonIndex < 36; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column1XPos, row4YPos);
                column1XPos += BUTTONSIZE;
            }
            
            column1XPos = 100;
            int row5YPos = row4YPos + BUTTONSIZE;
            
            //Rubidium - Xenon
            for (int currentElementButtonIndex =
                36; currentElementButtonIndex < 54; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column1XPos, row5YPos);
                column1XPos += BUTTONSIZE;
            }
            
            column1XPos = 100;
            int row6YPos = row5YPos + BUTTONSIZE;
            int column4XPos = column1XPos + (BUTTONSIZE*3);
            
            //Caesium
            elementButtons.get(54).setLocation(column1XPos, row6YPos);
            //Barium
            elementButtons.get(55).setLocation(column1XPos + BUTTONSIZE, row6YPos);
            
            //Hafnium - Radon
            for (int currentElementButtonIndex =
                71; currentElementButtonIndex < 86; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column4XPos, row6YPos);
                column4XPos += BUTTONSIZE;
            }
            
            column1XPos = 100;
            int row7YPos = row6YPos + BUTTONSIZE;
            column4XPos = column1XPos + (BUTTONSIZE*3);
            
            //Francium
            elementButtons.get(86).setLocation(column1XPos, row7YPos);
            
            //Radium
            elementButtons.get(87).setLocation(column1XPos + BUTTONSIZE, row7YPos);
            
            //Hafnium - Radon
            for (int currentElementButtonIndex =
                103; currentElementButtonIndex < 118; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column4XPos, row7YPos);
                column4XPos += BUTTONSIZE;
            }
            
            int LanthanoidsYPos = row7YPos + (BUTTONSIZE*2);
            column4XPos = column1XPos + (BUTTONSIZE*3);
            
            //Lanthanoids
            for (int currentElementButtonIndex =
                56; currentElementButtonIndex < 71; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column4XPos, LanthanoidsYPos);
                column4XPos += BUTTONSIZE;
            }
            
            int ActinoidsYPos = LanthanoidsYPos + BUTTONSIZE;
            column4XPos = column1XPos + (BUTTONSIZE*3);
            
            //Actinoids
            for (int currentElementButtonIndex =
                88; currentElementButtonIndex < 103; currentElementButtonIndex++) {
                elementButtons.get(currentElementButtonIndex).setLocation(
                    column4XPos, ActinoidsYPos);
                column4XPos += BUTTONSIZE;
            }
            
            repaint();
        }
    }
}
