package periodically;

import java.awt.*;

/**
 * This is the Element class that creates the elements that the periodically
 * class displays information about.
 *
 * @author Andy Luu
 * @version 2021.5.18
 */

public class Element {

    /**
     * Private Data Fields that represent a Element's name, symbol, state at
     * room temperature, atomic number, atomic mass.
     */
    private String name, symbol, stateAtRoomTemp, typeOfElement;
    private int atomicNumber;
    private double atomicMass;

    /**
     * This is Element's constructor that creates a new Element object
     * by storing the Element's name, symbol, and state at room temperature as
     * strings, the Element's atomic number as an integer and the Element's
     * atomic mass as an double.
     *
     * @param name
     *            An String representing this Element's name.
     * 
     * @param symbol
     *            An String representing this Element's symbol.
     * 
     * @param atomicNumber
     *            An integer representing this Element's atomic number.
     * 
     * @param atomicMass
     *            An double representing this Element's atomic mass.
     * 
     * @param stateAtRoomTemp
     *            An String representing this Element's state at room
     *            temperature.
     * 
     */
    public Element(
        String name,
        String symbol,
        int atomicNumber,
        double atomicMass,
        String stateAtRoomTemp,
        String typeOfElement) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.stateAtRoomTemp = stateAtRoomTemp;
        this.typeOfElement = typeOfElement;
    }

    public String getSymbol() {
        return this.symbol;
    }
    
    /**
     * This method will draw the current Element's information onto the window.
     * 
     * @param g
     *            The Graphics object used to draw the Element's information.
     * 
     */
    public void draw(Graphics g) {
        
        int xPos = 300;
        
        g.setColor(new Color(204, 255, 255));
        g.fillRect(0, 0, 1300, 1000);
        g.setColor(Color.BLACK);
        g.setFont(new Font( Font.MONOSPACED, Font.BOLD, 24));
        g.drawString("Name: " + name, xPos, 120);
        g.drawString("Symbol: " + symbol, xPos, 160);
        g.drawString("Atomic Number: " + atomicNumber, xPos, 200);
        g.drawString("Atomic Mass: " + atomicMass, xPos, 240);
        g.drawString("State At Room Temperature: " + stateAtRoomTemp, xPos, 290);
        g.drawString("Type Of Element: " + typeOfElement, xPos, 340);
    }
}
