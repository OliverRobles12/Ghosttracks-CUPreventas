
package itson.org.ghosttracks.preventaas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import itson.org.ghosttracks.negocio.objetosNegocio.PreventaBO;
import itson.org.ghosttracks.preventas.excepciones.CodigoErrorPreventa;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public class Preventas implements IPreventas {
    
    private final PreventaBO preventaBO = new PreventaBO();;
    
    public Preventas() {
    }
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws PreventaException {
        try {
            return this.preventaBO.consultarPreventas(filtro);
        } catch (NegocioException ex) {
            // TODO manejo de la excepcion
            throw new PreventaException("", CodigoErrorPreventa.PRUEBA);
        }
    }
    
}
