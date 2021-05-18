package periodically;

/**
 * This is the PeriodicallyRunner class that contains the main method and runs
 * Periodically.
 *
 * @author Andy Luu
 * @version 2021.5.18
 * 
 */
public class PeriodicallyRunner {

    /**
     * This is the main method which is called when the program is ran. The
     * method creates a new PeriodicallyReader object which parses through the
     * files that are passed into it and creates all the necessary components of
     * the program such as any object needed and the GUI to show the project.
     * 
     * @param args
     *            Command Line Arguments that dictate the PeriodicallyReader
     *            that is created
     * 
     * @throws FileNotFoundException
     *             This exception is thrown if any of the files are not found.
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            PeriodicallyReader periodicallyReader = new PeriodicallyReader(
                args[0]);

        }
        else {
            PeriodicallyReader periodicallyReader = new PeriodicallyReader(
                "Basic Periodic Table Data.csv");
        }
    }

}
