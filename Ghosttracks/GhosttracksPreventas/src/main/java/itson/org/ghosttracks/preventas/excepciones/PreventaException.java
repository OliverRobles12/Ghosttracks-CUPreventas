
package itson.org.ghosttracks.preventas.excepciones;

/**
 *
 * @author oliro
 */
public class PreventaException extends Exception {

    private final CodigoErrorPreventa codigoError;
    
    public PreventaException(String msg, CodigoErrorPreventa codigo) {
        super(msg);
        this.codigoError = codigo;
    }
    
    public PreventaException(String msg, Throwable cause, CodigoErrorPreventa codigo) {
        super(msg, cause);
        this.codigoError = codigo;
    }

    public CodigoErrorPreventa getCodigoError() {
        return codigoError;
    }
    
}
