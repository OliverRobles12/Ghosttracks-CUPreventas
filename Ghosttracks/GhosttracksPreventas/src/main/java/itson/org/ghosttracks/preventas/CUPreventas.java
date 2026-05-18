
package itson.org.ghosttracks.preventas;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.dtos.codigos.CodigoErrorPreventa;
import itson.org.ghosttracks.dtos.enums.EstadoPreventa;
import itson.org.ghosttracks.negocio.interfaces.IPreventaBO;
import itson.org.ghosttracks.negocio.interfaces.IProductosBO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import itson.org.ghosttracks.negocio.objetosNegocio.PreventaBO;
import itson.org.ghosttracks.negocio.objetosNegocio.ProductosBO;
import itson.org.ghosttracks.negocio.utilerias.FolioUtil;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.List;

/**
 *
 * @author oliro
 */
public class CUPreventas implements ICUPreventas {
    
    private final String PREFIJO_PREVENTA = "PREV";
    private final IPreventaBO preventaBO;
    private final IProductosBO productosBO;
    
    public CUPreventas() {
        this.preventaBO = new PreventaBO();
        this.productosBO = new ProductosBO();
    }
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws PreventaException {
        try {
            return this.preventaBO.consultarPreventas(filtro);
        } catch (NegocioException ex) {
            throw new PreventaException(CodigoErrorPreventa.ERROR_GENERICO, ex);
        }
        
    }

    @Override
    public PreventaDTO registrarPreventa(NuevaPreventaDTO nuevaPreventa) throws PreventaException {
        try {
            // Asignar valores faltantes y validar datos
            nuevaPreventa.setFolio(FolioUtil.generarFolio(PREFIJO_PREVENTA));
            nuevaPreventa.setEstado(EstadoPreventa.EN_ESPERA);
            return this.preventaBO.registrarPreventa(nuevaPreventa);
        } catch (NegocioException ex) {
            throw new PreventaException(CodigoErrorPreventa.ERROR_GENERICO, ex);
        }
    }

    @Override
    public List<ProductoDTO> consultarProductos(FiltroProductoDTO filtro) throws PreventaException {
        try {
            return this.productosBO.consultarProductos(filtro);
        } catch (NegocioException ex) {
            throw new PreventaException(CodigoErrorPreventa.ERROR_GENERICO, ex);
        }
    }
    
}
