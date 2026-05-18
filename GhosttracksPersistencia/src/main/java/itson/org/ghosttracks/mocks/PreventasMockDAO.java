 
package itson.org.ghosttracks.mocks;

import itson.org.ghosttracks.persistencia.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.daos.IProductosDAO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.entidades.Producto;
import itson.org.ghosttracks.enums.EstadoPreventa;
import itson.org.ghosttracks.exceptions.PersistenciaException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oliro
 */
public class PreventasMockDAO implements IPreventasDAO {
    
    private List<Preventa> baseDeDatosSimulada; 
    private IProductosDAO productosDAO;
    
    public PreventasMockDAO() {
        this.baseDeDatosSimulada = new ArrayList<>();
        this.productosDAO = new ProductosMockDAO(); 
        cargarDatosDummy();
    }
    
    private void cargarDatosDummy() {
        
        try {
            
            Producto prod1 = productosDAO.buscarPorId(1L); // Abbey Road
            Producto prod2 = productosDAO.buscarPorId(2L); // Thriller
            Producto prod3 = productosDAO.buscarPorId(4L); // Who Really Cares?
            Producto prod5 = productosDAO.buscarPorId(5L); // Chromakopia
            
            // Preventa 1: Un vinilo clásico (Activa)
            Preventa p1 = new Preventa();
            p1.setIdPreventa("1");
            p1.setFolioPreventa("PRE-001");
            p1.setFechaPublicacion(LocalDateTime.now().minusDays(5));
            p1.setFechaCierre(LocalDateTime.now().plusDays(10));
            p1.setFechaProcesado(LocalDateTime.now().plusDays(8));
            p1.setStock(50);
            p1.setStockAsignado(50);
            p1.setPrecio(850.00f);
            p1.setNota("Edición especial color azul.");
            p1.setEstado(EstadoPreventa.ACTIVA);
            p1.setProducto(prod1);
            baseDeDatosSimulada.add(p1);

            // Preventa 2: CD de lanzamiento reciente (Finalizada)
            Preventa p2 = new Preventa();
            p2.setIdPreventa("2");
            p2.setFolioPreventa("PRE-002");
            p2.setFechaPublicacion(LocalDateTime.now().minusMonths(1));
            p2.setFechaCierre(LocalDateTime.now().minusDays(1));
            p2.setFechaProcesado(LocalDateTime.now().minusDays(2));
            p2.setStock(100);
            p2.setStockAsignado(100);
            p2.setPrecio(350.50f);
            p2.setNota("Incluye póster firmado.");
            p2.setEstado(EstadoPreventa.FINALIZADA);
            p2.setProducto(prod2);
            baseDeDatosSimulada.add(p2);

            // Preventa 3: Vinilo raro (En Espera)
            Preventa p3 = new Preventa();
            p3.setIdPreventa("3");
            p3.setFolioPreventa("PRE-003");
            p3.setFechaPublicacion(LocalDateTime.now().plusDays(5));
            p3.setFechaCierre(LocalDateTime.now().plusDays(20));
            p3.setStock(25);
            p3.setStockAsignado(25);
            p3.setPrecio(1200.00f);
            p3.setNota("Importado de Japón.");
            p3.setEstado(EstadoPreventa.EN_ESPERA);
            p3.setProducto(prod3);
            baseDeDatosSimulada.add(p3);

            // Preventa 4: Lanzamiento Hip Hop (Pausada)
            Preventa p4 = new Preventa();
            p4.setIdPreventa("4");
            p4.setFolioPreventa("PRE-004");
            p4.setFechaPublicacion(LocalDateTime.now().minusDays(2));
            p4.setFechaCierre(LocalDateTime.now().plusDays(5));
            p4.setStock(30);
            p4.setStockAsignado(30);
            p4.setPrecio(750.00f);
            p4.setNota("Stock limitado por proveedor.");
            p4.setEstado(EstadoPreventa.EN_ESPERA);
            p4.setProducto(prod5);
            baseDeDatosSimulada.add(p4);

            System.out.println("Mock: Se han cargado " + baseDeDatosSimulada.size() + " preventas con sus productos asociados.");
            
        } catch (Exception ex) {
            System.err.println("Error al cargar dummy de preventas: " + ex.getMessage());
        }
        

        
    }
    
    @Override
    public Preventa registrarPreventa(Preventa nuevaPreventa) throws PersistenciaException  {
        nuevaPreventa.setIdPreventa(String.valueOf(System.currentTimeMillis())); // Generamos id
        Producto prod = productosDAO.buscarPorId(nuevaPreventa.getProducto().getIdProducto());
        nuevaPreventa.setProducto(prod);
        baseDeDatosSimulada.add(nuevaPreventa);
        System.out.println("Mock: Preventa guardada con éxito. Folio: " + nuevaPreventa.getFolioPreventa());
        return nuevaPreventa;
    }

    @Override
    public List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) throws PersistenciaException  {
        return baseDeDatosSimulada.stream()
            .filter(p -> {
                boolean cumpleFolio = filtro.getFolio() == null || p.getFolioPreventa().contains(filtro.getFolio());
                boolean cumpleEstado = filtro.getEstado() == null || p.getEstado().equals(filtro.getEstado());
                return cumpleFolio && cumpleEstado;
            })
            .collect(Collectors.toList());
    }

    @Override
    public Preventa consultarPreventa(String folio) throws PersistenciaException {
        return baseDeDatosSimulada.stream()
                .filter(p -> p.getFolioPreventa().equals(folio))
                .findFirst().orElse(null);
    }

    @Override
    public Preventa actualizarPreventa(Preventa preventaActualizada) throws PersistenciaException {
        Preventa p = consultarPreventa(preventaActualizada.getFolioPreventa());
        if(p != null) p.setPrecio(preventaActualizada.getPrecio());
        return p;
    }

    @Override
    public Preventa eliminarPreventa(String folio) throws PersistenciaException {
        Preventa p = consultarPreventa(folio);
        baseDeDatosSimulada.remove(p);
        return p;
    }
    
}
