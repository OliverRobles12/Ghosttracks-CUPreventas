
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.persistencia.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.enums.EstadoProducto;

/**
 *
 * @author oliro
 */
public class FiltroProductoMapper {
    
    public static FiltroProductoDTO toDTOPersistencia(itson.org.ghosttracks.dtos.FiltroProductoDTO filtro) {
        
        EstadoProducto estadoProducto = null;
        if (filtro.getEstado() != null) {
            estadoProducto = EstadoProducto.valueOf(filtro.getEstado().name());
        }
        
        FiltroProductoDTO filtroProducto = new FiltroProductoDTO(
                filtro.getFolio(), 
                filtro.getNombreProducto(), 
                estadoProducto
        );
        
        return filtroProducto;
        
    }
    
}
