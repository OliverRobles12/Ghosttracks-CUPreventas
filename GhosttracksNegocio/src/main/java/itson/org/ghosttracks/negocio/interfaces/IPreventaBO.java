
package itson.org.ghosttracks.negocio.interfaces;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface IPreventaBO {
    
    public abstract List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws NegocioException;
    
}
