
package itson.org.ghosttracks.preventaas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface IPreventas {
    
    public abstract List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws PreventaException;
    
}
