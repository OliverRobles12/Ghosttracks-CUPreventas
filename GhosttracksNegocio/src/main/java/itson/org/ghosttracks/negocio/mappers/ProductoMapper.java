
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.dtos.enums.EstadoProducto;
import itson.org.ghosttracks.dtos.enums.TipoProducto;
import itson.org.ghosttracks.entidades.Producto;

/**
 *
 * @author nafbr
 */
public class ProductoMapper {

    private ProductoMapper() {
    }

    public static ProductoDTO toDTO(Producto entidad) {
        if (entidad == null) return null;
        
        TipoProducto tipoProducto = null;
        if (entidad.getTipo() != null) {
            tipoProducto = TipoProducto.valueOf(entidad.getTipo().name());
        }
        
        EstadoProducto estadoProducto = null;
        if (entidad.getEstado()!= null) {
            estadoProducto = estadoProducto.valueOf(entidad.getEstado().name());
        }
        
        ProductoDTO dto = new ProductoDTO();
        dto.setIdProducto(entidad.getIdProducto());
        dto.setNombre(entidad.getNombre());
        dto.setImgProducto(entidad.getImgProducto());
        dto.setTipoProducto(tipoProducto);
        dto.setArtista(entidad.getArtista());
        dto.setGenero(entidad.getGenero());
        dto.setSetlist(entidad.getSetlist());
        dto.setPrecio(entidad.getPrecio());
        dto.setStock(entidad.getStock());
        dto.setEstado(estadoProducto);
        return dto;
    }

    public static Producto toEntidad(ProductoDTO dto) {
        if (dto == null) {
            return null;
        }
        
        itson.org.ghosttracks.enums.TipoProducto tipoProducto = null;
        if (dto.getTipoProducto() != null) {
            tipoProducto = itson.org.ghosttracks.enums.TipoProducto.valueOf(dto.getTipoProducto().name());
        }

        Producto entidad = new Producto();
        entidad.setIdProducto(dto.getIdProducto());
        entidad.setNombre(dto.getNombre());
        entidad.setImgProducto(dto.getImgProducto());
        entidad.setTipo(tipoProducto);
        entidad.setPrecio(dto.getPrecio());
        entidad.setStock(dto.getStock());
        return entidad;
    }

}
