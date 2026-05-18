package itson.org.ghosttracks.mocks;

import itson.org.ghosttracks.persistencia.dtos.FiltroProductoDTO;
import itson.org.ghosttracks.daos.IProductosDAO;
import itson.org.ghosttracks.entidades.Producto;
import itson.org.ghosttracks.enums.EstadoProducto;
import itson.org.ghosttracks.enums.TipoProducto;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author emyla
 */
public class ProductosMockDAO implements IProductosDAO {

    private static final Logger LOGGER = Logger.getLogger(ProductosMockDAO.class.getName());
    
    private List<Producto> productosDB;
    private Long contadorId = 1L;

    public ProductosMockDAO() {
        this.productosDB = new ArrayList<>();
        cargarDatosDummy();
    }

    /**
     * Carga de datos iniciales adaptada a ProductoDTO
     */
    private void cargarDatosDummy() {
        
        //PRODUCTO 1 
        Producto producto1 = new Producto(
                1L,
                "PROD-0001",
                "Abbey Road",             
                "AbbeyRoad.png",         
                TipoProducto.VINILO,       
                "The Beatles",            
                "Rock",                   
                Arrays.asList("Come Together", "Something", "Maxwell's Silver Hammer", "Oh! Darling", "Octopus's Garden", "I Want You", "Here Comes the Sun"), // setlist
                650.00,                  
                15,                       
                EstadoProducto.DISPONIBLE 
        );
        this.productosDB.add(producto1);
        contadorId++;

        // PRODUCTO 2
        Producto producto2 = new Producto(
                2L,
                "PROD-0002",
                "Thriller", 
                "Thriller.png", 
                TipoProducto.CD,         
                "Michael Jackson", 
                "Pop", 
                Arrays.asList("Wanna Be Startin' Somethin'", "Baby Be Mine", "The Girl Is Mine", "Thriller", "Beat It", "Billie Jean", "Human Nature"),
                752.30, 
                20, 
                EstadoProducto.DISPONIBLE
        );
        this.productosDB.add(producto2);
        contadorId++;

        //PRODUCTO 3
        Producto producto3 = new Producto(
                3L,
                "PROD-0003",
                "Breach", 
                "JoshDun.png", 
                TipoProducto.CASSETTE,    
                "Twenty One Pilots", 
                "Rock Alternativo", 
                Arrays.asList("City Walls", "RAWFEAR", "Drum Show", "Garbage", "The Contract", 
                        "Downstairs", "Robot Voices", "Center Mass", "Cotton Wood", "One Way", "Days Lie Dormant", 
                        "Tally", "Intentions"), 
                1200.00, 
                5, 
                EstadoProducto.DISPONIBLE
        );
        this.productosDB.add(producto3);
        contadorId++;
        
        Producto producto4 = new Producto(
                4L,
                "PROD-0004",
                "Who Really Cares?",             
                "TvGirl.png",         
                TipoProducto.VINILO,       
                "TV Girl",            
                "Alternativo",                   
                Arrays.asList("Taking What's Not Yours", "Song About Me", "Cigarettes Out The Window", 
                        "Till You Tell Me to Leave", "Not Allowed", "(Do The) Act Like You Never Met Me", 
                        "Safeword", "For You", "Loving Machine", "Heaven Is a Bedroom"), // setlist
                1200.00,                  
                20,                       
                EstadoProducto.DISPONIBLE 
        );
        this.productosDB.add(producto4);
        contadorId++;
        
        Producto producto5 = new Producto(
                5L,
                "PROD-0005",
                "Chromakopia",             
                "Chromakopia.png",         
                TipoProducto.CD,       
                "Tyler, The Creator",            
                "Hip Hop",                   
                Arrays.asList("St. Chroma", "Rah Tah Tah", "Noid", "Darling, I", "Hey Jane", 
                        "I Killed You", "Sticky", "Take Your Mask Off", "Tomorrow", 
                        "Thought I Was Dead", "Like Him", "Balloon", "Hope You Find Your Way Home"),
                750.00,                  
                10,                       
                EstadoProducto.DISPONIBLE 
        );
        this.productosDB.add(producto5);
        contadorId++;
    }
    
    
    @Override
    public List<Producto> obtenerTodos() throws PersistenciaException {
        try {
            return new ArrayList<>(this.productosDB);
        } catch (Exception e) {
            LOGGER.severe("Error crítico e inesperado al intentar obtener todos los productos" + e.getMessage());
            throw new PersistenciaException("Ocurrió un error al consultar el catálogo de productos.", e);
        }
    }
    
    @Override
    public Producto buscarPorId(Long idProducto) throws PersistenciaException {
        if (idProducto == null) {
            throw new PersistenciaException("El ID del producto a buscar no puede ser nulo");
        }

        try {
            for (Producto producto : productosDB) {
                if (producto.getIdProducto().equals(idProducto)) {
                    return producto;
                }
            }
            throw new PersistenciaException("Producto no encontrado con el ID: " + idProducto);

        } catch (PersistenciaException e) {
            throw e;

        } catch (Exception e) {
            LOGGER.severe("Error crítico e inesperado al buscar el producto por ID: " + e.getMessage());
            throw new PersistenciaException("Error inesperado al intentar buscar el producto.", e);
        }
    }

    @Override
    public Producto agregar(Producto nuevoProducto) throws PersistenciaException {
        if (nuevoProducto == null) {
            throw new PersistenciaException("No se puede agregar un producto nulo.");
        }
        if (nuevoProducto.getNombre() == null || nuevoProducto.getNombre().trim().isEmpty()) {
            throw new PersistenciaException("El producto debe tener un nombre válido.");
        }
        
        nuevoProducto.setIdProducto(contadorId++);
        
        this.productosDB.add(nuevoProducto);
        return nuevoProducto;
        
    }

    @Override
    public List<Producto> consultarProductos(FiltroProductoDTO filtro) throws PersistenciaException {
        return productosDB.stream()
            .filter(p -> {
                boolean cumpleFolio = filtro.getFolio() == null || p.getFolio().contains(filtro.getFolio());

                boolean cumpleNombre = filtro.getNombreProducto() == null || p.getNombre().contains(filtro.getNombreProducto());

                boolean cumpleEstado = filtro.getEstado() == null || p.getEstado().equals(filtro.getEstado());

                return cumpleFolio && cumpleNombre && cumpleEstado;
            })
            .collect(Collectors.toList());
    }
    
}
