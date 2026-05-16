
package itson.org.ghosttracks.negocio.utilerias;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author oliro
 */
public class FolioUtil {
    
    /**
     * Genera un folio basado en la fecha y un núnmero aleatorio.
     * Ejemplo: "PREV-20260516-0845-1234"
     * @param prefijo
     * @return 
     */
    public static String generarFolio(String prefijo) {
        LocalDateTime ahora = LocalDateTime.now();
        String fechaStr = ahora.format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmm"));
        int aleatorio = ThreadLocalRandom.current().nextInt(1000, 10000);
        return String.format("%s-%s-%d", prefijo, fechaStr, aleatorio);
    }
    
}
