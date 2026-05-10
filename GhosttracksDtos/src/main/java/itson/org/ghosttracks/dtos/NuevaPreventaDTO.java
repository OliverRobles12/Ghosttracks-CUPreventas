
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class NuevaPreventaDTO {
    
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaCierre;
    private LocalDateTime fechaProcesado;
    private EstadoPreventa estado;
    private int limiteStock;
    private float precio;
    private String nota;
    private byte[] imagen;

    public NuevaPreventaDTO() {
    }

    public NuevaPreventaDTO(LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, int limiteStock, float precio, String nota, byte[] imagen) {
        this.fechaPublicacion = fechaPublicacion;
        this.fechaCierre = fechaCierre;
        this.fechaProcesado = fechaProcesado;
        this.estado = estado;
        this.limiteStock = limiteStock;
        this.precio = precio;
        this.nota = nota;
        this.imagen = imagen;
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
