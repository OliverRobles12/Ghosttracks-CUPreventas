
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class PreventaDTO {
    
    private String idPreventa;
    private String folioPreventa;
    private LocalDateTime fechaPublicacion;
    private LocalDateTime fechaCierre;
    private LocalDateTime fechaProcesado;
    private EstadoPreventa estado;
    private int stock;
    private int stockAsignado;
    private float precio;
    private String nota;
    private byte[] imagen;
    private ProductoDTO producto;

    public PreventaDTO() {
    }

    public PreventaDTO(String idPreventa, String folioPreventa, LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, int stock, int stockAsignado, float precio, String nota, byte[] imagen, ProductoDTO producto) {
        this.idPreventa = idPreventa;
        this.folioPreventa = folioPreventa;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaCierre = fechaCierre;
        this.fechaProcesado = fechaProcesado;
        this.estado = estado;
        this.stock = stock;
        this.stockAsignado = stockAsignado;
        this.precio = precio;
        this.nota = nota;
        this.imagen = imagen;
        this.producto = producto;
    }

    public String getIdPreventa() {
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

    public int getStock() {
        return stock;
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
