package libreriaio;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class LibreriaIOWind extends LibreriaIOPadre{

    @Override
    public Short pedirNumShort(String mensaje) {
        
        String numTexto = JOptionPane.showInputDialog(null, mensaje);
        
        Short num = Short.parseShort(numTexto);
                
    return num; 
    
    }

    @Override
    public Integer pedirNumInteger(String mensaje) {
        
       String numTexto = JOptionPane.showInputDialog(null, mensaje);  
       
       Integer num = Integer.parseInt(numTexto);
       
       return num;
        
    }

    @Override
    public Double pedirNumDouble(String mensaje) {
        
        String numTexto = JOptionPane.showInputDialog(null, mensaje);
        
        Double num = Double.parseDouble(numTexto);
        
        return num;
        
    }
    
    
    
    
    
}
