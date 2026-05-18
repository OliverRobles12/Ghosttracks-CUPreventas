
package itson.org.ghosttracks.controladores;

import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
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
    
    /**
     * Accede a la pantalla de busqueda de productos.
     * @return ProductoDTO seleccioanda.
     */
    public ProductoDTO buscarArticulo() {
        return navegador.abrirDialogSeleccionarProducto();
    }
    
    public List<ProductoDTO> consultarProductos(FiltroProductoDTO filtro) {
        try {
            return subsysPreventas.consultarProductos(filtro);
        } catch (PreventaException ex) {
            navegador.mostrarMensaje(ManejadorErrores.obtenerMensaje(ex.getCodigoError()), true);
            return Collections.emptyList();
        }
    }
    
    /**
     * Consulta las preventas registradas.
     * @param filtro Filtro de busqueda.
     * @return Lista de las preventas encontradas
     */
    public List<PreventaDTO> consultarPreventas(FiltroPreventaDTO filtro) {
        try {
            return subsysPreventas.consultarPreventas(filtro);
        } catch (PreventaException ex) {
            navegador.mostrarMensaje(ManejadorErrores.obtenerMensaje(ex.getCodigoError()), true);
            return Collections.emptyList();
        }
    }
    
    /**
     * Registra la nueva preventa
     * @param nuevaPreventa
     * @return 
     */
    public boolean registrarPreventa(NuevaPreventaDTO nuevaPreventa) {
        try {
            PreventaDTO preventa = subsysPreventas.registrarPreventa(nuevaPreventa);
            navegador.mostrarMensaje("La preventa ha sido registrada correctamente con el folio: " + preventa.getFolioPreventa(), false);
            return true;
        } catch (PreventaException ex) {
            return false;
        }
    }
    
    public void mostrarMensaje(String mensaje, boolean esError) {
        navegador.mostrarMensaje(mensaje, esError);
    }
    
}
