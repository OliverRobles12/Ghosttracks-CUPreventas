
package itson.org.ghosttracks.entidades;

import itson.org.ghosttracks.enums.EstadoSolicitudPreventa;
import java.time.LocalDateTime;

/**
 *
 * @author oliro
 */
public class SolicitudPreventa {
    
    private String idSolicitud;
    private String folioSolicitud;
    private int cantidadProducto;
    private LocalDateTime fechaSolicitud;
    private EstadoSolicitudPreventa estado;

    public SolicitudPreventa() {
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFolioSolicitud() {
        return folioSolicitud;
    }

    public void setFolioSolicitud(String folioSolicitud) {
        this.folioSolicitud = folioSolicitud;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public EstadoSolicitudPreventa getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitudPreventa estado) {
        this.estado = estado;
    }
    
}
