import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

    private static final Logger LOGGER = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {

        LOGGER.info("Logger Name: " + LOGGER.getName());

        LOGGER.warning("Pode levar a um ArrayIndexOutOfBoundsException");

        // Array com 3 elementos
        int[] a = { 1, 2, 3 };
        int index = 4;
        LOGGER.config("index é " + index);

        try {
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            LOGGER.log(Level.SEVERE, "Excessão ocorrida", ex);
        }

    }

}