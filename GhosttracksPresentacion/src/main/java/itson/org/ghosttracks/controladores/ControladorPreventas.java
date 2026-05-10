
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.navegadores.NavegadorPreventas;
import itson.org.ghosttracks.preventaas.IPreventas;
import itson.org.ghosttracks.preventaas.Preventas;

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
    
}
