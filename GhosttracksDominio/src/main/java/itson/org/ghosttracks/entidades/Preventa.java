
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
    private Integer stock;
    private Integer stockAsignado;
    private Float precio;
    private String nota;
    private byte[] imagen;
    private Producto producto;

    public Preventa() {
    }

    public Preventa(String idPreventa, String folioPreventa, LocalDateTime fechaPublicacion, LocalDateTime fechaCierre, LocalDateTime fechaProcesado, EstadoPreventa estado, Integer stock, Integer stockAsignado, Float precio, String nota, byte[] imagen, Producto producto) {
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockAsignado() {
        return stockAsignado;
    }

    public void setStockAsignado(Integer stockAsignado) {
        this.stockAsignado = stockAsignado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
