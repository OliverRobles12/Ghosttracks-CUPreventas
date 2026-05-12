
package itson.org.ghosttracks.negocio.adaptador;

import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.dtos.enums.EstadoPreventa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliro
 */
public class PreventaAPreventaDTOAdapter {
    
    public static PreventaDTO adapt(Preventa preventa){ 
        
        PreventaDTO preventaDTO = new PreventaDTO(
                preventa.getIdPreventa(), 
                preventa.getIdPreventa(), 
                preventa.getFechaPublicacion(), 
                preventa.getFechaCierre(), 
                preventa.getFechaProcesado(), 
                EstadoPreventa.ACTIVA, 
                preventa.getStock(), 
                preventa.getStockAsignado(), 
                preventa.getPrecio(), 
                preventa.getNota(), 
                preventa.getImagen(), 
                ProductoAProductoDTOAdapter.adapt(preventa.getProducto())
        );
        
        return preventaDTO;
        
    }
    
    public static List<PreventaDTO> adaptList(List<Preventa> listaEntidades) {
        List<PreventaDTO> listaDtos = new ArrayList<>();
        
        if (listaEntidades != null && !listaEntidades.isEmpty()) {
            for (Preventa entidad : listaEntidades) {
                listaDtos.add(adapt(entidad));
            }
        }
        
        return listaDtos;
    }
    
}
