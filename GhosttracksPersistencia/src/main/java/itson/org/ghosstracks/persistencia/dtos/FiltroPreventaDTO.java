
package itson.org.ghosstracks.persistencia.dtos;

import itson.org.ghosstracks.persistencia.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class FiltroPreventaDTO {
    
    private String nombre;
    private String folio;
    private EstadoPreventa estado;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public FiltroPreventaDTO() {
    }

    public FiltroPreventaDTO(String nombre, String folio, EstadoPreventa estado, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.nombre = nombre;
        this.folio = folio;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFolio() {
        return folio;
    }

    public EstadoPreventa getEstado() {
        return estado;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }
    
}
