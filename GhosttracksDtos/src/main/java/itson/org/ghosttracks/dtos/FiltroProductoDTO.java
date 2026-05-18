
package itson.org.ghosttracks.dtos;

import itson.org.ghosttracks.dtos.enums.EstadoProducto;

/**
 *
 * @author oliro
 */
public class FiltroProductoDTO {
    
    private String folio;
    private String nombreProducto;
    private EstadoProducto estado;

    public FiltroProductoDTO() {
    }
    
    public FiltroProductoDTO(String folio, String nombreProducto, EstadoProducto estado) {
        this.folio = folio;
        this.nombreProducto = nombreProducto;
        this.estado = estado;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }
    
}
