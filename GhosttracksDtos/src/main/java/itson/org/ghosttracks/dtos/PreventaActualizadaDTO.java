
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.dtos.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class PreventaActualizadaDTO {
    
    private String folioPreventa;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaCierre;
    private LocalDateTime fechaProcesado;
    private EstadoPreventa estado;
    private int limiteStock;
    private float precio;
    private String nota;
    private byte[] imagen;

    public PreventaActualizadaDTO() {
    }

    public PreventaActualizadaDTO(String folioPreventa, LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, int limiteStock, float precio, String nota, byte[] imagen) {
        this.folioPreventa = folioPreventa;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaCierre = fechaCierre;
        this.fechaProcesado = fechaProcesado;
        this.estado = estado;
        this.limiteStock = limiteStock;
        this.precio = precio;
        this.nota = nota;
        this.imagen = imagen;
    }

    public String getFolioPreventa() {
        return folioPreventa;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public LocalDateTime getFechaProcesado() {
        return fechaProcesado;
    }

    public EstadoPreventa getEstado() {
        return estado;
    }

    public int getLimiteStock() {
        return limiteStock;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNota() {
        return nota;
    }

    public byte[] getImagen() {
        return imagen;
    }
    
}
