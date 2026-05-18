
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
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
    
    public static Preventa toPreventa(NuevaPreventaDTO nuevaPreventa) {
        
        itson.org.ghosttracks.enums.EstadoPreventa estadoPreventa = null;
        if (nuevaPreventa.getEstado() != null) {
            estadoPreventa = itson.org.ghosttracks.enums.EstadoPreventa.valueOf(nuevaPreventa.getEstado().name());
        }
        
        Preventa preventa = new Preventa( 
                null, // Id de la preventa
                nuevaPreventa.getFolio(), // Folio de la preventa
                nuevaPreventa.getFechaPublicacion(), // Fecha publicacion
                nuevaPreventa.getFechaCierre(),  // Fecha cierre
                nuevaPreventa.getFechaProcesado(),  // Fecha procesado
                estadoPreventa, // Estado de la preventa
                nuevaPreventa.getStockAsignado(), // Stock actual 
                nuevaPreventa.getStockAsignado(), // Stock asignado
                nuevaPreventa.getPrecio(), // Precio en preventa
                nuevaPreventa.getNota(),  // Nota de la preventa
                nuevaPreventa.getImagen(), // Imagen de la preventa
                ProductoMapper.toEntidad(nuevaPreventa.getProducto()) // Producto en preventa
        );
        
        return preventa;
        
    }
    
}
