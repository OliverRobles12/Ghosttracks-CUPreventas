
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.dtos.PaqueteDTO;
import itson.org.ghosttracks.dtos.enums.EstadoPaquete;
import itson.org.ghosttracks.entidades.Paquete;

/**
 *
 * @author nafbr
 */
public class PaqueteMapper {

    private PaqueteMapper() {}
 
    public static PaqueteDTO toDTO(Paquete entidad) {
        if (entidad == null) return null;
        
        EstadoPaquete estadoPaquete = null;
        if (entidad.getEstado() != null) {
            estadoPaquete = EstadoPaquete.valueOf(entidad.getEstado().name());
        }
        
        PaqueteDTO dto = new PaqueteDTO();
        dto.setIdPaquete(entidad.getIdPaquete());
        dto.setNumeroGuia(entidad.getNumeroGuia());
        dto.setIdEnvio(entidad.getIdEnvio());
        dto.setEstado(estadoPaquete);
        dto.setFechaEnvio(entidad.getFechaEnvio());
        dto.setFechaEntregaEstimada(entidad.getFechaEntregaEstimada());
        dto.setFechaEntregaFinal(entidad.getFechaEntregaFinal());
        dto.setUbicacionActual(entidad.getUbicacionActual());
        return dto;
    }
 
    public static Paquete toEntidad(PaqueteDTO dto) {
        if (dto == null) return null;
        
        itson.org.ghosttracks.enums.EstadoPaquete estadoPaquete = null;
        if (dto.getEstado() != null) {
            estadoPaquete = itson.org.ghosttracks.enums.EstadoPaquete.valueOf(dto.getEstado().name());
        }
        
        Paquete entidad = new Paquete();
        entidad.setIdPaquete(dto.getIdPaquete());
        entidad.setNumeroGuia(dto.getNumeroGuia());
        entidad.setIdEnvio(dto.getIdEnvio());
        entidad.setEstado(estadoPaquete);
        entidad.setFechaEnvio(dto.getFechaEnvio());
        entidad.setFechaEntregaEstimada(dto.getFechaEntregaEstimada());
        entidad.setFechaEntregaFinal(dto.getFechaEntregaFinal());
        entidad.setUbicacionActual(dto.getUbicacionActual());
        return entidad;
    }
    
}
