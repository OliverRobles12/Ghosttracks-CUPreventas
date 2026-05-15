
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.dtos.PreventaDTO;
import itson.org.ghosttracks.dtos.enums.EstadoPreventa;
import itson.org.ghosttracks.entidades.Preventa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliro
 */
public class PreventaMapper {
    
    public static PreventaDTO toDTO(Preventa preventa){ 
        
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
                ProductoMapper.toDTO(preventa.getProducto())
        );
        
        return preventaDTO;
        
    }
    
    public static List<PreventaDTO> toDTO(List<Preventa> listaEntidades) {
        List<PreventaDTO> listaDtos = new ArrayList<>();
        
        if (listaEntidades != null && !listaEntidades.isEmpty()) {
            for (Preventa entidad : listaEntidades) {
                listaDtos.add(toDTO(entidad));
            }
        }
        
        return listaDtos;
    }
    
}
