
package itson.org.ghosttracks.preventaas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.negocio.interfaces.IPreventaBO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import itson.org.ghosttracks.negocio.objetosNegocio.PreventaBO;
import java.util.List;

/**
 *
 * @author oliro
 */
public class CUPreventas implements ICUPreventas {
    
    private final IPreventaBO preventaBO = new PreventaBO();
    
    public CUPreventas() {
    }
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws NegocioException {
        return this.preventaBO.consultarPreventas(filtro);
    }
    
}
