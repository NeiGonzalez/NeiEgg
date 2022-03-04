package DigitoVerificadorAtrib;

public class DigitoVerificador {
    //-----------------ATRIBUTOS -------------------------------
    
   private int DNI;    // LO DEFINÍ COMO INT PORQUE ENTRABA EN CONFICTO PARA SACAR EL RESTO Y USAR ESE NUMERO COMO POSICION EN EL ARRAY
   private char letra;
   
   private int variableQueNoSirve; //esto es solo para ver lo de los commit de gig hub

    public DigitoVerificador() {
    }

    public DigitoVerificador(int DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    
   
}
