
package itson.org.ghosttracks.fachadas;

import itson.org.ghosstracks.persistencia.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import itson.org.ghosttracks.fabricas.FabricaDAOProducer;
import itson.org.ghosttracks.fabricas.IFabricaDAO;
import java.util.List;

/**
 *
 * @author oliro
 */
public class FachadaPersistencia implements IFachadaPersistencia {

    private IPreventasDAO preventasDAO;
    
    public FachadaPersistencia() {
        IFabricaDAO fabrica = FabricaDAOProducer.getFactory();
        this.preventasDAO =  fabrica.crearPreventasDAO();
    }
    
    @Override
    public List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) throws PersistenciaException{
        return preventasDAO.consultarPreventas(filtro);
        
    }

    @Override
    public Preventa registrarPreventa(Preventa nuevaPreventa) throws PersistenciaException {
        return preventasDAO.registrarPreventa(nuevaPreventa);
    }
    
}
