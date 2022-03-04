package DigitoVerificaforServPaq;

import DigitoVerificadorAtrib.DigitoVerificador;
import java.util.Scanner;

public class DigitVerifServ {

    Scanner leer = new Scanner(System.in);
    
    // esto es un cambio para ver en los commits de git hub

    //-------------------------------METODO CREAR NIF---------------------
    public DigitoVerificador crearNif() {

        DigitoVerificador dv = new DigitoVerificador();
        System.out.println("Ingrese el DNI");
        dv.setDNI(leer.nextInt());
        System.out.println("El DNI ingresado es " + dv.getDNI());
        return dv;
    }

    //---------------------METODO CALCULAR DÍGITO VERIFICADOR--------
   
    public void calcularDigito(DigitoVerificador dv) {
        
        int digit = (dv.getDNI() % 23);
        char VectLetra[] = {'T', 'R', 'W', 'A', 'G','M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("*****El digito es "+ digit);
        
        System.out.println("*****La letra es " + VectLetra[digit]); // aca muestro la letra que se encuentra en la posición digit.
        dv.setLetra(VectLetra[digit]);
        

    }

    //----------------------------METODO MOSTRAR NIF---------------------------
    public void mostrarNif(DigitoVerificador dv) {

        System.out.println("El NIF del DNI ingresado es: ");
        System.out.println(dv.getDNI() + "-" + dv.getLetra());
    }
}
