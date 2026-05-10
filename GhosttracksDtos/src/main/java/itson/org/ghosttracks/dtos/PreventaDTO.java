
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class PreventaDTO {
    
    private Long idPreventa;
    private String folioPreventa;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaCierre;
    private LocalDateTime fechaProcesado;
    private EstadoPreventa estado;
    private int limiteStock;
    private float precio;
    private String nota;
    private byte[] imagen;

    public PreventaDTO() {
    }

    public PreventaDTO(Long idPreventa, String folioPreventa, LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, int limiteStock, float precio, String nota, byte[] imagen) {
        this.idPreventa = idPreventa;
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

    public Long getIdPreventa() {
        return idPreventa;
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
