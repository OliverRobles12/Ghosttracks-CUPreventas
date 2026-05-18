
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.dtos.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class NuevaPreventaDTO {
    
    private String folio;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaCierre;
    private LocalDateTime fechaProcesado;
    private EstadoPreventa estado;
    private int stockAsignado;
    private float precio;
    private String nota;
    private byte[] imagen;
    private ProductoDTO producto;

    public NuevaPreventaDTO() {
    }

    public NuevaPreventaDTO(String folio, LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, int stockAsignado, float precio, String nota, byte[] imagen, ProductoDTO producto) {
        this.folio = folio;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaCierre = fechaCierre;
        this.fechaProcesado = fechaProcesado;
        this.estado = estado;
        this.stockAsignado = stockAsignado;
        this.precio = precio;
        this.nota = nota;
        this.imagen = imagen;
        this.producto = producto;
    }
    
    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
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

    public void setEstado(EstadoPreventa estado) {
        this.estado = estado;
    }

    public int getStockAsignado() {
        return stockAsignado;
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

    public ProductoDTO getProducto() {
        return producto;
    }

}
