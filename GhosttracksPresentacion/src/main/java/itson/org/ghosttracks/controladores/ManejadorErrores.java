
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.dtos.codigos.CodigoErrorPreventa;
import itson.org.ghosttracks.dtos.codigos.ICodigoError;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oliro
 */
public class ManejadorErrores {
    
    private static final Map<ICodigoError, String> mensajes = new HashMap<>();
    
    static {
        mensajes.put(CodigoErrorPreventa.ERROR_GENERICO, 
                "Error de prubea :)");
    }
    
    private ManejadorErrores(){};
    
    public static String obtenerMensaje(ICodigoError error) {
        if (error == null) {
            return "Ha ocurrido un error inesperado.";
        }
        
        return mensajes.getOrDefault(
                error, 
                "Error desconocido."
        );
        
    }
    
}
