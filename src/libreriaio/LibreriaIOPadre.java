package libreriaio;

/**
 *
 * @author david
 */
public abstract class LibreriaIOPadre implements InterfaceLibreriaIO{

    public static LibreriaIOPadre crear(Tipo tipo){
    
        LibreriaIOPadre variablelibreria=null;
        
    switch (tipo){
        case VENTANA:{
        variablelibreria = new LibreriaIOWind();
        break;
        }
        case CONSOLA:{
        variablelibreria = new LibreriaIOConsola();
        break;
        }  
        
        
    }
        return variablelibreria;
        
    
    
    
    
    }
    
    
    
    
}
