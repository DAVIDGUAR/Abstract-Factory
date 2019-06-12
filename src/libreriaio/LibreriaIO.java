package libreriaio;

/**
 *
 * @author david
 */
public class LibreriaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        LibreriaIOPadre obxnum = LibreriaIOPadre.crear(Tipo.VENTANA);
        
        obxnum.pedirNumInteger("introduce un numero ");
        
        LibreriaIOPadre obxnum2 = LibreriaIOPadre.crear(Tipo.CONSOLA);
        
        obxnum2.pedirNumShort("introduce un numero ");
        
    }
    
}
