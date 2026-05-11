
package itson.org.ghosttracks.fabricas;

/**
 *
 * @author oliro
 */
public class FabricaDAOProducer {

    private static final boolean USAR_MOCKS = true;
    
    public static IFabricaDAO getFactory() {
        if (USAR_MOCKS) {
            return new FabricaMockDAO();
        } else {
            // Aca regresar la fabrica de la abse de datos real.
            return null;
        }
    }
    
}
