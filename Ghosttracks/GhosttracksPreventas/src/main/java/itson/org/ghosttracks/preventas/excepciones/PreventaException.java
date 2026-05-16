
package itson.org.ghosttracks.preventas.excepciones;

import itson.org.ghosttracks.dtos.codigos.CodigoErrorPreventa;

/**
 *
 * @author oliro
 */
public class PreventaException extends Exception {

    private CodigoErrorPreventa codigoError;
    
    public PreventaException(CodigoErrorPreventa codigo, String message, Throwable cause) {
        super(message, cause);
        this.codigoError = codigo;
    }

    public PreventaException(CodigoErrorPreventa codigo, Throwable cause) {
        super(cause);
        this.codigoError = codigo;
    }

    public CodigoErrorPreventa getCodigoError() {
        return codigoError;
    }
    
}
