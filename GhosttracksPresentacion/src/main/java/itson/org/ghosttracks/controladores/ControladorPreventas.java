
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.navegadores.NavegadorPreventas;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import itson.org.ghosttracks.preventaas.CUPreventas;
import itson.org.ghosttracks.preventas.excepciones.PreventaException;
import java.util.Collections;
import java.util.List;
import itson.org.ghosttracks.preventaas.ICUPreventas;

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
        } catch (NegocioException ex) {
            navegador.mostrarMensaje(ex.getMessage(), true);
            return Collections.emptyList();
        }
    }
    
}
