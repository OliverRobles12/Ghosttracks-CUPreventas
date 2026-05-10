
package itson.org.ghosttracks.entidades;

import itson.org.ghosttracks.enums.EstadoPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class Preventa {
    
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

    public Preventa() {
    }

    public String getIdPreventa() {
        return idPreventa;
    }

    public void setIdPreventa(String idPreventa) {
        this.idPreventa = idPreventa;
    }

    public String getFolioPreventa() {
        return folioPreventa;
    }

    public void setFolioPreventa(String folioPreventa) {
        this.folioPreventa = folioPreventa;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public LocalDateTime getFechaProcesado() {
        return fechaProcesado;
    }

    public void setFechaProcesado(LocalDateTime fechaProcesado) {
        this.fechaProcesado = fechaProcesado;
    }

    public EstadoPreventa getEstado() {
        return estado;
    }

    public void setEstado(EstadoPreventa estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockAsignado() {
        return stockAsignado;
    }

    public void setStockAsignado(int stockAsignado) {
        this.stockAsignado = stockAsignado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
                
}
