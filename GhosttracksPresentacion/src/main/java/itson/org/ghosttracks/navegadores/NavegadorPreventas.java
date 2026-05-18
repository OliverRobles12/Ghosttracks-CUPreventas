
package itson.org.ghosttracks.navegadores;

import itson.org.ghosttracks.controladores.ControladorPreventas;
import itson.org.ghosttracks.controladores.Navegador;
import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.presentacion.VentanaPrincipal;
import itson.org.ghosttracks.presentacion.preventas.PantallaEditarPreventa;
import itson.org.ghosttracks.presentacion.preventas.PantallaNuevaPreventa;
import itson.org.ghosttracks.presentacion.preventas.PantallaPreventas;
import itson.org.ghosttracks.utilerias.DialogBuscadorProducto;

/**
 *
 * @author oliro
 */
public class NavegadorPreventas {

    private final VentanaPrincipal ventana;
    private final Navegador navegadorPrincipal;
    private final ControladorPreventas controlador;
    
    public NavegadorPreventas(VentanaPrincipal ventana, Navegador navegadorPrincipal) {
        this.ventana = ventana;
        this.navegadorPrincipal = navegadorPrincipal;
        this.controlador = new ControladorPreventas(this);
    }
    
    public void irPantallaPreventas() {
        PantallaPreventas vista = new PantallaPreventas(controlador);
        ventana.cambiarPantalla(vista);
    }
    
    public void irPantallaNuevaPreventa() {
        PantallaNuevaPreventa vista = new PantallaNuevaPreventa(controlador);
        ventana.cambiarPantalla(vista);
    }
    
    public void irPantallaEditarPreventa() {
        PantallaEditarPreventa vista = new PantallaEditarPreventa(controlador);
        ventana.cambiarPantalla(vista);
    }
    
    public ProductoDTO abrirDialogSeleccionarProducto() {
        DialogBuscadorProducto dialog = new DialogBuscadorProducto(ventana, true, controlador);
        return dialog.mostrar();
    }
    
    public void mostrarMensaje(String mensaje, boolean esError) {
        navegadorPrincipal.mostrarMensaje(mensaje, esError);
    }
    
}
