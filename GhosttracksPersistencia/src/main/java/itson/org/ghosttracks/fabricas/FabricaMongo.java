
package itson.org.ghosttracks.fabricas;

import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.daos.ISolicitudesPreventaDAO;
import itson.org.ghosttracks.daos.PreventasDAO;
import itson.org.ghosttracks.daos.SolicitudesPreventaDAO;

/**
 *
 * @author oliro
 */
public class FabricaMongo implements IFabricaDAO {

    @Override
    public IPreventasDAO crearPreventasDAO() {
        return new PreventasDAO();
    }

    @Override
    public ISolicitudesPreventaDAO crearSolicitudesPreventaDAO() {
        return new SolicitudesPreventaDAO();
    }
    
}
