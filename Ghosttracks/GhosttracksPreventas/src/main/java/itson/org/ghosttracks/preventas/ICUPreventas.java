
package itson.org.ghosttracks.preventas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public interface ICUPreventas {
    
    public abstract List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws PreventaException;
    
    public abstract PreventaDTO registrarPreventa(NuevaPreventaDTO nuevaPreventa) throws PreventaException;
    
    public abstract List<ProductoDTO> consultarProductos(FiltroProductoDTO filtro) throws PreventaException;
    
}
