
package itson.org.ghosttracks.mocks;

import itson.org.ghosttracks.daos.IPreventasDAO;
import itson.org.ghosttracks.dtos.FiltroPreventaDTO;
import itson.org.ghosttracks.dtos.NuevaPreventaDTO;
import itson.org.ghosttracks.dtos.PreventaActualizadaDTO;
import itson.org.ghosttracks.entidades.Preventa;
import itson.org.ghosttracks.enums.EstadoPreventa;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oliro
 */
public class PreventasMockDAO implements IPreventasDAO {
    
    private List<Preventa> baseDeDatosSimulada = new ArrayList<>();

    public PreventasMockDAO() {
        cargarDatos();
    }
    
    private void cargarDatos() {
        // Preventa 1: Un vinilo clásico (Activa)
        Preventa p1 = new Preventa();
        p1.setIdPreventa("1");
        p1.setFolioPreventa("PRE-001");
        p1.setFechaPublicacion(LocalDateTime.now().minusDays(5));
        p1.setFechaCierre(LocalDateTime.now().plusDays(10));
        p1.setStock(50);
        p1.setStockAsignado(50);
        p1.setPrecio(850.00f);
        p1.setNota("Edición especial color azul.");
        p1.setEstado(EstadoPreventa.ACTIVA);
        baseDeDatosSimulada.add(p1);

        // Preventa 2: CD de lanzamiento reciente (Cerrada)
        Preventa p2 = new Preventa();
        p2.setIdPreventa("2");
        p2.setFolioPreventa("PRE-002");
        p2.setFechaPublicacion(LocalDateTime.now().minusMonths(1));
        p2.setFechaCierre(LocalDateTime.now().minusDays(1));
        p2.setStock(100);
        p2.setStockAsignado(100);
        p2.setPrecio(350.50f);
        p2.setNota("Incluye póster firmado.");
        p2.setEstado(EstadoPreventa.FINALIZADA);
        baseDeDatosSimulada.add(p2);

        // Preventa 3: Vinilo raro (Próximamente)
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
        baseDeDatosSimulada.add(p3);
        
        System.out.println("Mock: Se han cargado " + baseDeDatosSimulada.size() + " preventas de prueba.");
    }
    
    @Override
    public Preventa registrarPreventa(NuevaPreventaDTO dto) {
        Preventa p = new Preventa();
        p.setIdPreventa(String.valueOf(System.currentTimeMillis())); // Generamos id
        p.setImagen(dto.getImagen()); 
        p.setPrecio(dto.getPrecio());
        
        baseDeDatosSimulada.add(p);
        System.out.println("Mock: Preventa guardada con éxito. Folio: " + p.getFolioPreventa());
        return p;
    }

    @Override
    public List<Preventa> consultarPreventas(FiltroPreventaDTO filtro) {
        return baseDeDatosSimulada.stream()
            .filter(p -> {
                // Filtro por Folio (si no es nulo)
                boolean cumpleFolio = filtro.getFolio() == null || p.getFolioPreventa().contains(filtro.getFolio());
                // Filtro por Estado
                boolean cumpleEstado = filtro.getEstado() == null || p.getEstado().equals(filtro.getEstado());

                return cumpleFolio && cumpleEstado;
            })
            .collect(Collectors.toList());
    }

    @Override
    public Preventa consultarPreventa(String folio) {
        return baseDeDatosSimulada.stream()
                .filter(p -> p.getFolioPreventa().equals(folio))
                .findFirst().orElse(null);
    }

    @Override
    public Preventa actualizarPreventa(PreventaActualizadaDTO dto) {
        Preventa p = consultarPreventa(dto.getFolioPreventa());
        if(p != null) p.setPrecio(dto.getPrecio());
        return p;
    }

    @Override
    public Preventa eliminarPreventa(String folio) {
        Preventa p = consultarPreventa(folio);
        baseDeDatosSimulada.remove(p);
        return p;
    }
    
}
