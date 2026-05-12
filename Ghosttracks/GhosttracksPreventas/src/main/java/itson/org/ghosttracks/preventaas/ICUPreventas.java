
package itson.org.ghosttracks.preventaas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface ICUPreventas {
    
    public abstract List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws NegocioException;
    
}
