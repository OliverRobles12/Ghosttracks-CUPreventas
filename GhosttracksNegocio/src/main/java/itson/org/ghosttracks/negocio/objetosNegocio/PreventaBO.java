
package itson.org.ghosttracks.negocio.objetosNegocio;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.codigos.CodigoErrorGenerico;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import itson.org.ghosttracks.fachadas.FachadaPersistencia;
import itson.org.ghosttracks.fachadas.IFachadaPersistencia;
import itson.org.ghosttracks.negocio.interfaces.IPreventaBO;
import itson.org.ghosttracks.negocio.mappers.FiltroPreventaMapper;
import itson.org.ghosttracks.negocio.mappers.PreventaMapper;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author oliro
 */
public class PreventaBO implements IPreventaBO{

    private IFachadaPersistencia datos = new FachadaPersistencia();

    public PreventaBO() {
    }
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws NegocioException {
        try {
            List<Preventa> listaEntidades = datos.consultarPreventas(FiltroPreventaMapper.toDTOPersistencia(filtro));
            return PreventaMapper.toDTO(listaEntidades);
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se puedieron recuperar las preventas registradas.", ex);
        }
        
    }

    @Override
    public PreventaDTO registrarPreventa(NuevaPreventaDTO nuevaPreventa) throws NegocioException {
        try {
            Preventa preventaRegistrada = datos.registrarPreventa(PreventaMapper.toPreventa(nuevaPreventa));
            return PreventaMapper.toDTO(preventaRegistrada);
        } catch (PersistenciaException ex) {
            throw new NegocioException( "No fue posible registrar la nueva preventa.", ex);
        }
    }
    
}
