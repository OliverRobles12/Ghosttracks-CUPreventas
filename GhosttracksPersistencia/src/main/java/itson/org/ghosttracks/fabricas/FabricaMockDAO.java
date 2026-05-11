
package itson.org.ghosttracks.fabricas;

import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.daos.ISolicitudesPreventaDAO;
import itson.org.ghosttracks.mocks.PreventasMockDAO;
import itson.org.ghosttracks.mocks.SolicitudesPreventaMockDAO;

/**
 *
 * @author oliro
 */
public class FabricaMockDAO implements IFabricaDAO{

    public FabricaMockDAO() {
    }
    
    @Override
    public IPreventasDAO crearPreventasDAO() {
        return new PreventasMockDAO();
    }

    @Override
    public ISolicitudesPreventaDAO crearSolicitudesPreventaDAO() {
        return new SolicitudesPreventaMockDAO();
    }
    
}
