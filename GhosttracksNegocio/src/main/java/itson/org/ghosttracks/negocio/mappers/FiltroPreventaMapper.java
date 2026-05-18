
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.persistencia.enums.EstadoPreventa;
import itson.org.ghosttracks.dtos.FiltroPreventaDTO;

/**
 *
 * @author oliro
 */
public class FiltroPreventaMapper {
    
    public static itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO toDTOPersistencia(FiltroPreventaDTO filtro) {
        
        EstadoPreventa estadoPreventa = null;
        if (filtro.getEstado() != null) {
            estadoPreventa = EstadoPreventa.valueOf(filtro.getEstado().name());
        }
        
        itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO filtroPreventa = new itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO(
                filtro.getNombre(), 
                filtro.getFolio(), 
                estadoPreventa, 
                filtro.getFechaInicio(), 
                filtro.getFechaFin()
        );
        
        return filtroPreventa;
        
    }
    
}
