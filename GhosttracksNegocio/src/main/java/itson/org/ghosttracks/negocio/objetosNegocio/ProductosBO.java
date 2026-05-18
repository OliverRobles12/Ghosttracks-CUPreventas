/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.org.ghosttracks.negocio.objetosNegocio;

import itson.org.ghosttracks.daos.IProductosDAO;
import itson.org.ghosttracks.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.dtos.ProductoDTO;
import itson.org.ghosttracks.entidades.Producto;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import itson.org.ghosttracks.mocks.ProductosMockDAO;
import itson.org.ghosttracks.negocio.interfaces.IProductosBO;
import itson.org.ghosttracks.negocio.mappers.FiltroProductoMapper;
import itson.org.ghosttracks.negocio.mappers.ProductoMapper;
import itson.org.ghosttracks.negocio.objetosNegocio.Excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author nafbr
 */
public class ProductosBO implements IProductosBO {

    private final IProductosDAO productosDAO;

    public ProductosBO() {
        this.productosDAO = new ProductosMockDAO();
    }

    @Override
    public List<Producto> obtenerTodos() throws NegocioException {
        try {
            return productosDAO.obtenerTodos();
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al consultar productos en BD", e);
        }
    }
    
    @Override
    public Producto obtenerProductoPorId(Long id) throws NegocioException {
        try {
            return productosDAO.buscarPorId(id);
        } catch (PersistenciaException e) {
            throw new NegocioException("Error al buscar el producto", e);
        }
    }

    @Override
    public List<ProductoDTO> consultarProductos(FiltroProductoDTO filtro) throws NegocioException {
        try {
            List<Producto> productos = productosDAO.consultarProductos(FiltroProductoMapper.toDTOPersistencia(filtro));
            return ProductoMapper.toDTO(productos);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al consultar los productos registrados");
        }
    }
}
