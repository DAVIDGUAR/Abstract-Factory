package libreriaio;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class LibreriaIOConsola extends LibreriaIOPadre{

    @Override
    public Short pedirNumShort(String mensaje) {
       
        System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Short numShort = ler.nextShort();
      
      return numShort;
      
    }

    @Override
    public Integer pedirNumInteger(String mensaje) {
       
        System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Integer num = ler.nextInt();
      
      return num;
    }

    @Override
    public Double pedirNumDouble(String mensaje) {
        
    System.out.println(mensaje);
        
      Scanner ler = new Scanner(System.in);
      
      Double num = ler.nextDouble();
      
      return num;
    
    }
         
    
}
