
package DigitoVerificadorMainPaq;

import DigitoVerificadorAtrib.DigitoVerificador;
import DigitoVerificaforServPaq.DigitVerifServ;

public class DigitoVerificadorMain {


    public static void main(String[] args) {
        
        DigitVerifServ service = new DigitVerifServ();
        DigitoVerificador dverif= new DigitoVerificador();
        
        dverif= service.crearNif();
       
        service.calcularDigito(dverif);
                
         service.mostrarNif(dverif);      
    }
    
}
