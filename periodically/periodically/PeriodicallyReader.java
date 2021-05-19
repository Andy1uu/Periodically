package periodically;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class PeriodicallyReader {

    private ArrayList<Element> elements;

    public PeriodicallyReader(String fileName) throws FileNotFoundException {

        elements = this.readElementsFile(fileName);

        Periodically periodically = new Periodically(elements);
        JFrame frame = new JFrame("Periodically");
        frame.setSize(1300, 1000);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(periodically);
        periodically.requestFocus();
        frame.setVisible(true);

    }


    private ArrayList<Element> readElementsFile(String fileName)
        throws FileNotFoundException {
        ArrayList<Element> tempElements = new ArrayList<Element>();

        Scanner in = new Scanner(new File(fileName));

        if (in.hasNext()) {

            in.nextLine();

            while (in.hasNext()) {

                String[] currentElementData = in.nextLine().split(",");

                Element currentElement = new Element(currentElementData[0],
                    currentElementData[1], Integer.parseInt(
                        currentElementData[2]), Double.parseDouble(
                            currentElementData[3]), currentElementData[4],
                    currentElementData[5]);

                tempElements.add(currentElement);
            }

        }

        in.close();

        return tempElements;
    }

}
