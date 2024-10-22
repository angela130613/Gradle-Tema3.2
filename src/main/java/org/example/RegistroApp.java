import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.info("Aplicación iniciada.");
        logger.warn("Este es un mensaje de advertencia.");
        logger.error("Este es un mensaje de error.");
    }
}