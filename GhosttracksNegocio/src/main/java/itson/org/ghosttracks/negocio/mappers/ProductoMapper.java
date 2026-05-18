
package itson.org.ghosttracks.negocio.mappers;

import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.dtos.enums.EstadoProducto;
import itson.org.ghosttracks.dtos.enums.TipoProducto;
import itson.org.ghosttracks.entidades.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nafbr
 */
public class ProductoMapper {

    private ProductoMapper() {
    }

    public static ProductoDTO toDTO(Producto producto) {
        if (producto == null) return null;
        
        TipoProducto tipoProducto = null;
        if (producto.getTipo() != null) {
            tipoProducto = TipoProducto.valueOf(producto.getTipo().name());
        }
        
        EstadoProducto estadoProducto = null;
        if (producto.getEstado()!= null) {
            estadoProducto = estadoProducto.valueOf(producto.getEstado().name());
        }
        
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIdProducto(producto.getIdProducto());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setFolio(producto.getFolio());
        productoDTO.setImgProducto(producto.getImgProducto());
        productoDTO.setTipoProducto(tipoProducto);
        productoDTO.setArtista(producto.getArtista());
        productoDTO.setGenero(producto.getGenero());
        productoDTO.setSetlist(producto.getSetlist());
        productoDTO.setPrecio(producto.getPrecio());
        productoDTO.setStock(producto.getStock());
        productoDTO.setEstado(estadoProducto);
        return productoDTO;
    }

    public static List<ProductoDTO> toDTO(List<Producto> listaEntidades) {
        List<ProductoDTO> listaDtos = new ArrayList<>();
        
        if (listaEntidades != null && !listaEntidades.isEmpty()) {
            for (Producto producto : listaEntidades) {
                listaDtos.add(toDTO(producto));
            }
        }
        
        return listaDtos;
        
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
