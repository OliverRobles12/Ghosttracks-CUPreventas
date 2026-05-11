
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.navegadores.NavegadorPreventas;
import itson.org.ghosttracks.preventaas.IPreventas;
import itson.org.ghosttracks.preventaas.Preventas;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author oliro
 */
public class ControladorPreventas {
    
    private final NavegadorPreventas navegador;
    private final IPreventas subsysPreventas = new Preventas();
    
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
            // TODO manejo de la excepcion
            return Collections.emptyList();
        }
    }
    
}
