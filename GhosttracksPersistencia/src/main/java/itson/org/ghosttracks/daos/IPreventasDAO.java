
package itson.org.ghosttracks.daos;

import itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface IPreventasDAO {
    
    public abstract List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) throws PersistenciaException;
    
    public abstract Preventa consultarPreventa(String folio) throws PersistenciaException;
    
    public abstract Preventa registrarPreventa(Preventa nuevaPreventa) throws PersistenciaException;
    
    public abstract Preventa actualizarPreventa(Preventa preventaActualizada) throws PersistenciaException;
    
    public abstract Preventa eliminarPreventa(String folio) throws PersistenciaException;
    
}
