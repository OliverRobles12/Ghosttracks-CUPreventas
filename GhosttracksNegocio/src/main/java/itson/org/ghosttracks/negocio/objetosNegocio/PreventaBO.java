
package itson.org.ghosttracks.negocio.objetosNegocio;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import itson.org.ghosttracks.fachadas.FachadaPersistencia;
import itson.org.ghosttracks.fachadas.IFachadaPersistencia;
import itson.org.ghosttracks.negocio.adaptador.PreventaAPreventaDTOAdapter;
import itson.org.ghosttracks.negocio.interfaces.IPreventaBO;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author oliro
 */
public class PreventaBO implements IPreventaBO{

    private IFachadaPersistencia datos = new FachadaPersistencia();
    
    @Override
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) throws NegocioException {
        try {
            List<Preventa> listaEntidades = datos.consultarPreventas(filtro);
            return PreventaAPreventaDTOAdapter.adaptList(listaEntidades);
        } catch (PersistenciaException ex) {
            // TODO manejo de la excepcion
            throw new NegocioException();
        }
        
    }
    
}
