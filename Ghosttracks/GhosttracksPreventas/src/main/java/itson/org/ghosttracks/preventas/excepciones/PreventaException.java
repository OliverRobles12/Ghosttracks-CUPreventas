
package itson.org.ghosttracks.preventas.excepciones;

/**
 *
 * @author oliro
 */
public class PreventaException extends Exception {

    private final CodigoErrorPreventa codigoError;

    public PreventaException(CodigoErrorPreventa codigoError, Throwable cause) {
        super(cause);
        this.codigoError = codigoError;
    }

    public CodigoErrorPreventa getCodigoError() {
        return codigoError;
    }
    
}
