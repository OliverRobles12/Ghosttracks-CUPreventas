
package itson.org.ghosttracks.fachadas;

import itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface IFachadaPersistencia {
    
    // Preventas
    public abstract List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) throws PersistenciaException;
    
    public abstract Preventa registrarPreventa(Preventa nuevaPreventa) throws PersistenciaException;
    
}
