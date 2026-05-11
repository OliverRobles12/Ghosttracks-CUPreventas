
package itson.org.ghosttracks.fabricas;

import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.daos.ISolicitudesPreventaDAO;

/**
 *
 * @author oliro
 */
public interface IFabricaDAO {
    
    public abstract IPreventasDAO crearPreventasDAO();
    
    public abstract ISolicitudesPreventaDAO crearSolicitudesPreventaDAO(); 
    
}
