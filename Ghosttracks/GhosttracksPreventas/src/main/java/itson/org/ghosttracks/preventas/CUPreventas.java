
package itson.org.ghosttracks.preventas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.codigos.CodigoErrorPreventa;
import itson.org.ghosttracks.negocio.interfaces.IPreventaBO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import itson.org.ghosttracks.negocio.objetosNegocio.PreventaBO;
import itson.org.ghosttracks.negocio.utilerias.FolioUtil;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public class CUPreventas implements ICUPreventas {
    
    private final String PREFIJO_PREVENTA = "PREV";
    private final IPreventaBO preventaBO = new PreventaBO();
    
    public CUPreventas() {
    }
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws PreventaException {
        try {
            return this.preventaBO.consultarPreventas(filtro);
        } catch (NegocioException ex) {
            throw new PreventaException(CodigoErrorPreventa.ERROR_GENERICO, "Error al consultar las preventas registradas.", ex);
        }
        
    }

    @Override
    public PreventaDTO registrarPreventa(NuevaPreventaDTO nuevaPreventa) throws PreventaException {
        try {
            nuevaPreventa.setFolio(FolioUtil.generarFolio(PREFIJO_PREVENTA));
            return this.preventaBO.registrarPreventa(nuevaPreventa);
        } catch (NegocioException ex) {
            throw new PreventaException(CodigoErrorPreventa.ERROR_GENERICO, "Error al registrar una nueva preventa.", ex);
        }
    }
    
}
