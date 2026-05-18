package itson.org.ghosttracks.daos;

import itson.org.ghosttracks.persistencia.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.entidades.Producto;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.util.List;

/**
 *
 * @author emyla
 */
public interface IProductosDAO {
    
    public abstract List<Producto> obtenerTodos() throws PersistenciaException;
    
    public abstract Producto buscarPorId(Long idProducto) throws PersistenciaException;
    
    public abstract Producto agregar(Producto nuevoProducto) throws PersistenciaException;
    
    public abstract List<Producto> consultarProductos(FiltroProductoDTO filtro) throws PersistenciaException;
    
}
