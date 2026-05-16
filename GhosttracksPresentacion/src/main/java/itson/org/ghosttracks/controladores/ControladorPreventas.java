
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.navegadores.NavegadorPreventas;
import itson.org.ghosttracks.preventas.CUPreventas;
import java.util.Collections;
import java.util.List;
import itson.org.ghosttracks.preventas.ICUPreventas;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;

/**
 *
 * @author oliro
 */
public class ControladorPreventas {
    
    private final NavegadorPreventas navegador;
    private final ICUPreventas subsysPreventas = new CUPreventas();
    
    public ControladorPreventas(NavegadorPreventas navegador) {
        this.navegador = navegador;
    }
    
    public void irPantallaPreventas() {
        navegador.irPantallaPreventas();
    }
    
    public void irPantallaNuevaPreventa() {
        navegador.irPantallaNuevaPreventa();
    }
    
    public void irPantallaEditarPreventa() {
        navegador.irPantallaEditarPreventa();
    }
    
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) {
        try {
            return subsysPreventas.consultarPreventas(filtro);
        } catch (PreventaException ex) {
            navegador.mostrarMensaje(ManejadorErrores.obtenerMensaje(ex.getCodigoError()), true);
            return Collections.emptyList();
        }
    }
    
    public boolean registrarPreventa(NuevaPreventaDTO nuevaPreventa) {
        // TODO
        try {
            subsysPreventas.registrarPreventa(nuevaPreventa);
            return true;
        } catch (PreventaException ex) {
            return false;
        }
    }
    
}
