
package itson.org.ghosttracks.fachadas;

import itson.org.ghosstracks.persistencia.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface IFachadaPersistencia {
    
    public abstract List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) throws PersistenciaException;
    
}
